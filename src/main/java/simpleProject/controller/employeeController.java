package simpleProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import simpleProject.model.EmployeeModel;
import simpleProject.repository.EmployeeRepository;

@RestController
@CrossOrigin(origins = "*")
//@CrossOrigin(origins = "http://localhost:3000") // originsに*を指定するとどのサイトからのアクセスも受け付ける
@RequestMapping("api")
public class employeeController {

	@Autowired
	EmployeeRepository  employeeRepository;

	@RequestMapping(value = "/getEmployee", method = RequestMethod.GET)
	@ResponseBody
//	public String getEmployee() {
	public EmployeeModel getEmployee(Model model) {
        /* (2) */
		EmployeeModel employeeModel = employeeRepository.selectByPrimaryKey(2);
//        model.addAttribute("phoneBook", employeeModel);
//        model.addAttribute("greeting", "Hello, World!");
//		return "鈴木太郎";
        return employeeModel;
    }
}
