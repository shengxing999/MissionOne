package com.wp.sm.mapper;

import com.wp.sm.beans.User;

import java.util.List;

public interface UserMapper {

    public int insertUser(User user) throws Exception;

    public boolean updateUser(User user) throws Exception;

    public boolean deleteUser(int id) throws Exception;

    public User selectUserById(int id) throws Exception;

    public List<User> selectAllUser() throws Exception;

    public String selectUserByName(User user) throws Exception;
}