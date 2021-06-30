package com.flab.demo.exception.member;

import com.flab.demo.exception.BusinessException;
import org.springframework.http.HttpStatus;

public class NotFoundMemberException extends BusinessException {

    public NotFoundMemberException() {
        super("사용자를 찾을 수 없습니다.", HttpStatus.BAD_REQUEST);
    }
}
