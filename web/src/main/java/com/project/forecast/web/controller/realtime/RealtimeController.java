package com.project.forecast.web.controller.realtime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/realtime")
public class RealtimeController {

    @GetMapping("/test")
    public String test() {
        String tempValue = "Test";
        return tempValue;
    }

    @GetMapping("/action")
    public String testAction() {
        return "test...";
    }
}
