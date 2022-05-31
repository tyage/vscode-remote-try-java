package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HomeController {
  @RequestMapping("/{username}")
  public String user(@PathVariable String username) {
    return "Hi " + username + ", we have nothing to inform you.";
  }

  @RequestMapping("/admin")
  public String admin() {
    return "Hello admin! Here is secret information: Flag{BlahBlahBlah}";
  }
}
