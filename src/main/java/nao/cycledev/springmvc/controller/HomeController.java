package nao.cycledev.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping({"/", "/home", "/index"})
public class HomeController {

    @RequestMapping(method=GET)
    public String home() {
        return "index";
    }

}
