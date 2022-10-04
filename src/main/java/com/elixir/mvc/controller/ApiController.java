package com.elixir.mvc.controller;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.elixir.mvc.commons.UserVO;
import com.elixir.mvc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping(value = "/api", produces = "application/json; charset=utf8")
public class ApiController {

    @Inject
    UserService us;

    @GetMapping("/test")
    public String test() {
        System.out.println("요청받음...");
        return "테스트 성공입니다.";
    }

    @GetMapping("/getUser")
    public UserVO getUser() {
        UserVO user = us.getUser();
        System.out.println(user);
        System.out.println("유저정보 요청...");
        return user;
    }

    @GetMapping("/getUserList")
    public List<UserVO> getUserList() {
        List<UserVO> userList = us.getUserList();
        return userList;
    }

}
