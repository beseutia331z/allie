/*
 ┌───────────────────────────────────────────────────────────────────┐
 │ Copyright (c) 2024년 5월 26일 AllieDEV All rights reserved.        │
 └───────────────────────────────────────────────────────────────────┘
 */

package com.examlpe.allie.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage() {
        return "index";
    }
}
