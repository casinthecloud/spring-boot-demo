package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
//@ComponentScan("com.example.other")
public class Application {

    @Autowired
    private CasTest casTest;

    @RequestMapping("/")
    public String root(final Map<String, Object> map) {
        map.put("d", new Date());
        return "page";
    }
}
