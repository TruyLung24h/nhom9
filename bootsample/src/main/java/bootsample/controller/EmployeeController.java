package bootsample.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import bootsample.model.Employee;
import bootsample.service.EmployeeService;

/*
  @Controller
 */
@Controller
@SessionAttributes("employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	
	
	@GetMapping("/all-employees")
	public String allemployees(HttpServletRequest request){
		request.setAttribute("employees", employeeService.findAll());
		request.setAttribute("mode", "MODE_TASKS3");
		return "index";
	}
	
	@RequestMapping(value="/login")
	public String create(Model model) {
		
		return "login";
				
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String edit(@RequestParam String tendangnhap ,@RequestParam String pass,RedirectAttributes redirect) {
		
		if(employeeService.findEmployee(tendangnhap, pass)==1)
		{
			return "redirect:/admin";
		}	
		else {
			redirect.addFlashAttribute("success", "Không đúng tài khoản hoặc mật khẩu!");
			return "redirect:/login";
		}
		
	}
	@GetMapping("/new-employee")
	public String newemployee(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}
	
	@PostMapping("/save-employee")
	public String saveBinhLuan(@ModelAttribute Employee employee, BindingResult bindingResult, HttpServletRequest request){
		employeeService.save(employee);
		request.setAttribute("employees", employeeService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
	
	
	@GetMapping("/update-employee")
	public String updateemployee(@RequestParam int id, HttpServletRequest request){
		Optional<Employee> emp = employeeService.findEmployee(id);
		//request.setAttribute("employees", employeeService.findAll());
		//request.setAttribute("mode", "MODE_UPDATE");
		return "index";
	}
	public String edit(@RequestParam int id , Model model) {
		//model.addAttribute("tintuc", employeeService.findOne(id));
		return "themtintuc";
		
	}
	

	
	
	
}
