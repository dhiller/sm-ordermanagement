package de.dhiller.smallbusiness.ordermanagement.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

    @RequestMapping({"/start"})
    public String home(HttpServletRequest httpServletRequest, Model model) {
        return "start";
    }

}
