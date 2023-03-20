package com.jjang051.demo.controller;

import com.jjang051.demo.dto.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member")
@Slf4j
public class MemberController {

  @GetMapping("/info/{id}") //request mapping 있으니 member/info
  public String memberInfo(@PathVariable("id") String userId) {
    //이 경우는 @RequestParam이 아님
    // Restful한 경우 : url이 쿼리스트링이 아니라 sdfs.com/info/kim1234 이런 식으로 됨
    System.out.println(userId);
    return "/member/login";
  }

  @GetMapping("/join")
  public String join(
    @RequestParam String userId,
    @RequestParam String userPw,
    @RequestParam String userName,
    @RequestParam String tel,
    @RequestParam String addr
  ) {
    System.out.println(
      userId + " / " + userPw + " / " + userName + " / " + tel + " / " + addr
    );
    return "member/join";
  }

  @GetMapping("/join02")
  public String join02(Member member) {
    System.out.println(member.toString());
    return "member/join";
  }

  @GetMapping("/join03")
  // RequestParam은 사실 생략이 가능하다
  public String join03(String name, int age) {
    //System.out.println(name + ", " + age);
    log.info(name + ", " + age);
    return "member/join";
  }

  @GetMapping("/login")
  public String login(
    @RequestParam String userId,
    @RequestParam String userPw
    //@RequestParam(name = "password") String userPw
  ) {
    System.out.println(userId + ", " + userPw);
    return "member/login";
  }

  @GetMapping("/list")
  public String list(@RequestParam int page) {
    System.out.println("page : " + page);
    return "member/list";
  }

  //@RequestMapping(method = RequestMethod.GET, path = "/member/delete") // 옛날 방식
  @GetMapping("/delete")
  public String delete() {
    return "delete";
  }

  /** Controller + ResponseBody = RestController */
  @GetMapping("/toJson01")
  @ResponseBody
  public String toJson() {
    return "Hello Json";
  }
}
