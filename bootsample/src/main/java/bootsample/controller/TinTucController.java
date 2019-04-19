package bootsample.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import bootsample.model.Employee;
import bootsample.model.TinTuc;
import bootsample.service.TinTucService;

/*
  @Controller
 */
@Controller
@SessionAttributes("tintuc")
public class TinTucController {
	@Autowired
	private TinTucService tintucService;

	//@GetMapping("/")
	//public String home(HttpServletRequest request){
	//	request.setAttribute("mode", "MODE_HOME");
	//	return "index";
	//}
	@GetMapping("/")
	public String allTinTucsa(HttpServletRequest request){
		
		request.setAttribute("tintucs", tintucService.findAll());
		return "home";
	}
	@GetMapping("/admin")
	public String allTinTucs(HttpServletRequest request){
		request.setAttribute("tintucs", tintucService.findAll());
		//request.setAttribute("mode", "MODE_TASKS5");
		return "admin";
	}
	
	
	
	@PostMapping("/save-tintuc")
	public String saveTinTuc(@ModelAttribute TinTuc tintuc, BindingResult bindingResult, HttpServletRequest request){
		tintucService.save(tintuc);
		request.setAttribute("tintucs", tintucService.findAll());
		//request.setAttribute("mode", "MODE_TASKS");
		return "admin";
	}
	@GetMapping("/new-tintuc")
	public String newTinTuc(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}
	@GetMapping("/update-tintuc")
	public String updateTinTuc(@RequestParam("matintuc") int matintuc, HttpServletRequest request){
	//Object tt = tintucService.findTinTuc1(matintuc);
		TinTuc tintuc = tintucService.findTinTuc(matintuc);
		request.setAttribute("tintuc", tintuc);
		//request.setAttribute("mode", "MODE_UPDATE");
		return "form";
	}
	@GetMapping("/tintuc/xemchitiet")
	public String updateTinTuc1(@RequestParam("matintuc") int matintuc, HttpServletRequest request){
	
		TinTuc tintuc = tintucService.findTinTuc(matintuc);
		request.setAttribute("tintuc", tintuc);
		
		return "chitiet";
	}
	
	@GetMapping("/delete-tintuc")
	public String deleteTinTuc(@RequestParam int matintuc, HttpServletRequest request, RedirectAttributes redirect){
		tintucService.delete(matintuc);
		request.setAttribute("tintucs", tintucService.findAll());
		//request.setAttribute("mode", "MODE_TASKS");
		return "redirect:/admin";
	}
}
