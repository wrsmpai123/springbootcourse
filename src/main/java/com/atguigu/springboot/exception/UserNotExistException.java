package com.atguigu.springboot.exception;

/**
 * @author WR
 * @create 2020-10-10 10:24
 */
public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("用户不存在");
    }
}
