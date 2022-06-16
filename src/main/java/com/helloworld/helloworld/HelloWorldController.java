package com.helloworld.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    DateTimeFormat days = new DateTimeFormat();

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "HelloWorld!今日の日付と時間はこちら");
        model.addAttribute("day", days.dateTimeJp);
        return "HelloWorld";
    }
}

