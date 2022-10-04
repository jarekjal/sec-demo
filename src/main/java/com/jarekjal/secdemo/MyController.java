package com.jarekjal.secdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MyController {

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome</h1>";
    }

    @GetMapping("/admin")
    public String admin(Principal principal) {
        return "<h1>Welcome Admin: " + principal.getName() + "</h1>";
    }

    @GetMapping("/user")
    public String test(Principal principal) {
        return "<h1>Welcome User: " + principal.getName() + "</h1>";
    }
}
