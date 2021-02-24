package com.flab.demo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@NoArgsConstructor
public class LoginUserRequestDto {

    @Email
    @NotBlank(message = "로그인 시 이메일은 필수값입니다.")
    private String email;

    @NotBlank(message = "로그인 시 패스워드는 필수값입니다.")
    private String password;

    @Builder
    public LoginUserRequestDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public LoginUserRequestDto toDto(String encodedPassword) {
        return LoginUserRequestDto.builder()
                .email(this.email)
                .password(encodedPassword)
                .build();
    }
}
