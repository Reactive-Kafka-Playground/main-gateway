package uk.reactive.poc.maingateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainGatewayController {

    @RequestMapping("/test")
    public String home() {
        return "Hello reactive..";
    }
}
