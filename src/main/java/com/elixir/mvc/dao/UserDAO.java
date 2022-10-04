package com.elixir.mvc.dao;

import com.elixir.mvc.commons.UserVO;

import java.util.List;

public interface UserDAO {

    //테스트 유저 불러오기
    UserVO getUser();

    List<UserVO> getUserList();

}
