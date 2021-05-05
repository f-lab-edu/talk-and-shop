package com.flab.demo.controller;

import com.flab.demo.domain.Member;
import com.flab.demo.service.MemberService;
import com.flab.demo.system.Authentification;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final Authentification authentification;

    @PostMapping("/members")
    public Member join(@Valid @RequestBody Member member) {
        return memberService.join(member);
    }

    @GetMapping("/members/{id}")
    public Member getById(@PathVariable("id") String id) {
        return memberService.getById(id);
    }

    @PostMapping("/members/login")
    public void login(@Valid @RequestBody Member member) {
        authentification.login(member);
    }
}
