package com.flab.demo.domain;

import com.flab.demo.enums.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AuthMember {

    private Long id;
    private String email;
    private Role role;

    public AuthMember(Member member){
        this.id = member.getId();
        this.email = member.getEmail();
        this.role = member.getRole();
    }
}