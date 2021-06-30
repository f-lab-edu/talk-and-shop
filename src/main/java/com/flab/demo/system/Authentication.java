package com.flab.demo.system;

import com.flab.demo.domain.AuthMember;
import com.flab.demo.dto.member.LoginMemberRequestDto;

public interface Authentication {

    public void login(LoginMemberRequestDto loginMemberRequestDto);

    public String getLoginMemberEmail();

    public Long getLoginMemberId();

    public AuthMember getLoginMember();
}
