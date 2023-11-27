package com.example.demo.member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@Table
public class Member {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(nullable = false, length = 20)
  private String username;
  @Column(nullable = false, columnDefinition = "TEXT")
  private String password;
  @Column(nullable = false, length = 30)
  private String name;
  @Column(nullable = false, length = 320)
  private String email;
  @Column(nullable = false, length = 20, name = "phone_number")
  private String phoneNumber;
  @Column(nullable = false, length = 50)
  private String address;
  @Column(nullable = false, length = 50, name = "address_detail")
  private String addressDetail;
  @Column(nullable = false, name = "agree_term1")
  private Boolean agreeTerm1;
  @Column(nullable = false, name = "agree_term2")
  private Boolean agreeTerm2;
  @Column(nullable = false, name = "agree_term3")
  private Boolean agreeTerm3;
  @Column(nullable = false, name = "agree_term4")
  private Boolean agreeTerm4;
}

