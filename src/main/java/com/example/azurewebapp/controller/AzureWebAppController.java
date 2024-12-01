package com.example.azurewebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureWebAppController {

    @GetMapping("/test")
    public String getString(){
        return "Hellow Monika !!!!";

    }
}
