package com.example.javaswacities.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class OpenAPIController {
    @GetMapping("openAPI")
    public RedirectView redirectToOpenApi() {
        return new RedirectView("http://localhost:8081");
    }
}
