package nao.cycledev.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    @RequestMapping(method = GET)
    public String getStudents(){
        return "students";
    }

}
