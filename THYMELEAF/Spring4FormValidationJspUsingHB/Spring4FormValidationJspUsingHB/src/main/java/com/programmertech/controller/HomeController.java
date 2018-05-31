package com.programmertech.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.programmertech.model.Address;
import com.programmertech.model.Department;
import com.programmertech.model.Employee;

@Controller
public class HomeController {

	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = "/employee")
	public ModelAndView getHome(ModelAndView mv, Locale locale) {
		mv.setViewName("employeeForm");
		Employee employee = new Employee();
		Map<String, Object> formData = initFormData(locale);
		List<Address> addresses = new ArrayList<Address>();
		Address address = new Address();
		address.setAddressType(messageSource.getMessage(
				"Label.AddressType.Permanent", null, locale));
		addresses.add(address);
		address = new Address();
		address.setAddressType(messageSource.getMessage(
				"Label.AddressType.Current", null, locale));
		addresses.add(address);
		employee.setAddresses(addresses);
		mv.addObject("employee", employee);
		mv.addObject("skillSet", formData.get("skillSet"));
		mv.addObject("department", formData.get("department"));
		return mv;
	}

	private Map<String, Object> initFormData(Locale locale) {
		List<String> skillSet = new ArrayList<String>();
		skillSet.add("JAVA");
		skillSet.add("C");
		skillSet.add("C++");
		skillSet.add(".NET");
		skillSet.add("PHP");
		skillSet.add("DATABASE");
		skillSet.add("ADMINISTRATION");
		skillSet.add("OTHER");
		Map<Integer, String> department = new LinkedHashMap<Integer, String>();
		department.put(-1,
				messageSource.getMessage("Label.department", null, locale));
		department.put(1, messageSource.getMessage(
				"Label.department.development", null, locale));
		department.put(2,
				messageSource.getMessage("Label.department.bsa", null, locale));
		department.put(3, messageSource.getMessage("Label.department.admin",
				null, locale));
		department.put(4,
				messageSource.getMessage("Label.department.hr", null, locale));
		department.put(5, messageSource.getMessage("Label.department.research",
				null, locale));
		Map<String, Object> formMap = new HashMap<String, Object>();
		formMap.put("skillSet", skillSet);

		formMap.put("department", department);

		return formMap;
	}

	@RequestMapping(value = "/saveEmployee")
	public ModelAndView saveEmployee(ModelAndView mv,
			@ModelAttribute @Valid Employee employee,
			BindingResult bindingResult, Model model, Locale locale) {
		if (employee != null) {
			Map<String, Object> formData = initFormData(locale);
			if (employee.getDepartment()==null|| employee.getDepartment().getDeptId() < 1
					|| employee.getDepartment().getDeptId() > 5) {
				employee.setDepartment(new Department());
				bindingResult
						.rejectValue("department.deptId",
								"Valid.employee.Department",
								"Please Select Department");
			}
			if (bindingResult.hasErrors()) {
				mv.addObject("skillSet", formData.get("skillSet"));
				mv.addObject("department", formData.get("department"));
				mv.setViewName("employeeForm");
			} else {
				mv.setViewName("employeeSuccess");
			}

		}
		else{
			mv.setViewName("redirect:/employee");
		}
		return mv;
	}

}
