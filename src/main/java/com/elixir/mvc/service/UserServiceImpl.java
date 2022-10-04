package com.elixir.mvc.service;

import com.elixir.mvc.commons.UserVO;
import com.elixir.mvc.dao.UserDAO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Inject
    UserDAO userDAO;

    @Override
    public UserVO getUser() {
        UserVO user = userDAO.getUser();
        return user;
    }

    @Override
    public List<UserVO> getUserList() {
        List<UserVO> userList = userDAO.getUserList();
        return userList;
    }
}
