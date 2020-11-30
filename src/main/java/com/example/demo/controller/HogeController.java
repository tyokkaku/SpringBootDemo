package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/hoge")
public class HogeController {

  @GetMapping
  public String hoge() {
    return "hoge";
  }
}