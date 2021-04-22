package kr.needon.blog.modules.jwt.controller;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/v1/api/auth")
public class AuthController {

    @ResponseBody
    @PostMapping("/signin")
    public String signin() {

        return "signin api";
    }

}
