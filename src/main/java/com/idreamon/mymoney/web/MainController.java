package com.idreamon.mymoney.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class MainController {

    @RequestMapping("/user")
    public Principal user(Principal principal) {
        return principal;
    }
}
