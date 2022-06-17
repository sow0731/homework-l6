package com.helloworld.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(Model model) {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH時mm分ss秒");
        String dateTimeJp = dateTimeFormatter.format(today);

        model.addAttribute("message", "HelloWorld!今日の日付と時間はこちら");
        model.addAttribute("day", dateTimeJp);
        return "HelloWorld";
    }
}

