package com.elixir.mvc.service;

import com.elixir.mvc.commons.UserVO;

import java.util.List;

public interface UserService {

    UserVO getUser();

    List<UserVO> getUserList();
}
