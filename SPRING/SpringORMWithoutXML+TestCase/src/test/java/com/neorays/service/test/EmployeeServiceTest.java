package com.neorays.service.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.neorays.cnfgs.PersistanceConfiguration;
import com.neorays.cnfgs.ServiceConfiguration;
import com.neorays.dao.EmployeeDAO;
import com.neorays.domain.LoginBO;
import com.neorays.dto.RegisterDTO;
import com.neorays.service.EmployeServiceImpl;
import com.neorays.service.EmployeeService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ServiceConfiguration.class })
public class EmployeeServiceTest {

	@Autowired
	private  EmployeeService service=null;
	@Mock
	private static EmployeeDAO mockDao=null;
	private static RegisterDTO dto=null;
	private static LoginBO bo=null;
	@Before
	public void setUp() throws Exception {
		//service=new EmployeServiceImpl();
		//create Mock object
		MockitoAnnotations.initMocks(this);
		//mockDao=Mockito.mock(EmployeeDAO.class);//this line for without annotations
		//assign MockDAO obj to Service class
		((EmployeServiceImpl)service).setDao(mockDao);
	    bo=new LoginBO();
	    bo.setName("mithu");bo.setPsw("kumar");bo.setEmail("mithu");
	}//before method

	@After
	public void tearDown() throws Exception {
		service =null;
		mockDao=null;
		dto=null;
	}//after method

	@Test
	@Ignore
	public void testAuthenticateWithValidCredentials() {
		try{
		String actual=null;
		Mockito.when(mockDao.verify("raja","rani")).thenReturn(1);
		actual=service.authenticate("raja","rani");
		//actual=service.authenticate("","");
		System.out.println(	"actual "+actual);
		assertEquals("test1","Valid Crendetials" ,actual);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	@Test
	@Ignore
	public void testRegisterEmpWithValidData() {
		String actual=null;
		//set data in dto
		dto=new RegisterDTO();
		dto.setName("mithu");dto.setPsw("kumar");dto.setEmail("mithu");
		Mockito.when(mockDao.loginInsert(dto)).thenReturn(1);
		actual=service.registerEmp(dto);
		System.out.println("test result "+actual);
		assertEquals("test1","pass" ,actual);

	//	fail("Not yet implemented");
	}//test

}//class
