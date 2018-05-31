package com.neorays.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.neorays.model.PolicyHolder;

@Controller
public class HomeController {
	public static final List<Integer> terms;
	public static final Map<String, String> policyTypes;
	static {
		System.out.println("static");

		Integer[] t = { 5, 10, 15, 20, 25, 30 };
		terms = Arrays.asList(t);
		policyTypes = new HashMap<>();
		policyTypes.put("001", "Jeevan Suraksha");
		policyTypes.put("002", "Jeevan Kavach");
		policyTypes.put("003", "Jeevan Anand");

	}

	@RequestMapping(value = "/home")
	public ModelAndView getHome(ModelAndView mv) {
		System.out.println("getHome");
		mv.addObject("currentDate", new Date());
		mv.addObject("terms", terms);
		mv.addObject("policyTypes", policyTypes);
		PolicyHolder policyHolder = new PolicyHolder();
		mv.addObject("policyHolder", policyHolder);
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping(value = "/createPolicy")
	public ModelAndView createPolicy(ModelAndView mv, @ModelAttribute @Valid PolicyHolder policyHolder,
			BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
		System.out.println("createPolicy");

		if (policyHolder.getMobile() == null || !Pattern.matches("^\\d{10}$", policyHolder.getMobile().toString())) {
			bindingResult.rejectValue("mobile", "maxDigit.policyHolder.mobile", "Please enter valid mobile");
		}
		if (policyHolder.getPolicyInfo().getPolicyType() == null || !policyTypes.containsKey(policyHolder.getPolicyInfo().getPolicyType())) {
			bindingResult.rejectValue("policyInfo.policyType", "valid.policyInfo.policyType", "Please select valid policyType");
		}
		if (policyHolder.getPolicyInfo().getPolicyTerm() == null || !terms.contains(policyHolder.getPolicyInfo().getPolicyTerm())) {
			bindingResult.rejectValue("policyInfo.policyTerm", "valid.policyInfo.policyTerm", "Please select valid policyTerm");
		}
		if (bindingResult.hasErrors()) {
			mv.addObject("terms", terms);
			mv.addObject("policyTypes", policyTypes);
			mv.setViewName("home");
		} else {
			redirectAttributes.addFlashAttribute("policyHolder", policyHolder);
			mv.setViewName("redirect:/createPolicyInfo");
		}
		return mv;

	}
	@RequestMapping(value="/createPolicyInfo")
	public ModelAndView createPolicyInfo(ModelAndView mv,@ModelAttribute("policyHolder") PolicyHolder policyHolder){
		System.out.println("createPolicyInfo");

		mv.setViewName("createPolicySuccess");
		mv.addObject("policyHolder", policyHolder);
		return mv;
	}

}
