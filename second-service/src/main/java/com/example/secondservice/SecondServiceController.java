package com.example.secondservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/second-service")
@Slf4j
public class SecondServiceController {
  @GetMapping("/welcome")
  public String welcome() {
    return "Welcome to Second Service";
  }

  /**
   *
   * @param header : first-request 라는 헤더의 value
   * @return String
   */
  @GetMapping("/message")
  public String message(@RequestHeader("second-request") String header) {
    log.info(header);
    return "Hello World in Second Service";
  }
}
