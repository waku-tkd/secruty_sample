package securityxss.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;



@Controller
public class XssSampleApplication {

    @RequestMapping("/")
    public String test(@RequestParam("id") String id) {
        return "Hello World id=[" + id + "]";
    }

    @RequestMapping("/escape")
    public String test2(@RequestParam("id") String id) {
        String escapedId = HtmlUtils.htmlEscape(id);
        return "Hello World id=[" + escapedId + "]";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "id", required = false, defaultValue = "No ID") String id, Model model) {
        model.addAttribute("id", id);
        return "hello";
    }
    
    
}
