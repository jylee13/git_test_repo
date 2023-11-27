package com.example.demo.member.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.member.entity.Member;
import com.example.demo.member.repository.MemberRepository;

@Service
@Transactional
public class MemberService {

  private final MemberRepository memberRepository;

  public MemberService(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }

  @Transactional(readOnly = true)
  public Member findMemberByUsername(String username) {
    return memberRepository
        .findByUsername(username)
        .orElseThrow();
  }

}
