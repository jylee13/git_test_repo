package com.example.demo.member.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.member.entity.Member;
import com.example.demo.member.service.MemberService;

import jakarta.validation.Valid;

@RestController
public class MemberController {
  private final MemberService memberService;

  public MemberController(MemberService memberService) {
    this.memberService = memberService;
  }

  @PostMapping("/api/member-email")
  public ResponseEntity<String> findUserEmail(@RequestBody @Valid String username) {
    Member member = memberService.findMemberByUsername(username);
    return new ResponseEntity<>(
        member.getEmail(),
        HttpStatus.valueOf(HttpStatus.OK.value()));
  }
}
