package com.jjang051.demo.controller;

import com.jjang051.demo.dto.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/member")
public class MemberController {

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
}
