package com.jjang051.demo.controller;

import com.jjang051.demo.dto.Member;
import java.util.HashMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// [[ Controller와 RestController ]]
// 1. @Controller는 파일로 응답(/member/join.... jsp 혹은 html 파일의 위치) => ( WEB )
// 2. @RestController는 body에 응답 => ( JSON )
// 3.

@RestController
public class RestTestController {

  @GetMapping("/txt01")
  public String returnTxt() {
    return "{\"name\":\"hello\"}";
  }

  @GetMapping("/json01")
  public String returnJson() {
    return "{\"name\":\"hello\"}";
  }

  @GetMapping("json02")
  public HashMap<String, String> returnHashMap() {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("name", "HongGilDong");
    hashMap.put("age", "30");
    return hashMap;
  }

  @GetMapping("json03")
  public Member returnJson03() {
    Member member = new Member();
    member.setUserName("HongGilDong");
    member.setUserPw("1234");
    member.setUserId("hong111");
    member.setTel("010-1111-2222");
    member.setAddr("서울특별시 영등포구 선유로");
    return member;
  }
}
