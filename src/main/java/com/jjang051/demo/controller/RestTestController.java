package com.jjang051.demo.controller;

import com.jjang051.demo.dto.Member;
import java.util.ArrayList;
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

  @GetMapping("json04")
  public ArrayList<Member> returnJson04() {
    ArrayList<Member> arrayList = new ArrayList<>();
    Member member01 = new Member();
    member01.setUserName("HongGilDong");
    member01.setUserPw("1234");
    member01.setUserId("hong111");
    member01.setTel("010-1111-2222");
    member01.setAddr("서울특별시 영등포구 선유로");

    Member member02 = new Member();
    member02.setUserName("MoonDongEun");
    member02.setUserPw("1234");
    member02.setUserId("moonWillRevenge");
    member02.setTel("010-1111-2222");
    member02.setAddr("세명시 에덴빌라");

    Member member03 = new Member();
    member03.setUserName("ParkYeonJin");
    member03.setUserPw("1234");
    member03.setUserId("thisIsNotTheEnd");
    member03.setTel("010-1111-2222");
    member03.setAddr("세명시 엄청 좋은 집");

    arrayList.add(member01);
    arrayList.add(member02);
    arrayList.add(member03);

    return arrayList;
  }
}
