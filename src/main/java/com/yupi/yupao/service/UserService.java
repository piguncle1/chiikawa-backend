package com.yupi.yupao.service;

import com.yupi.yupao.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.yupi.yupao.constant.UserConstant.ADMIN_ROLE;
import static com.yupi.yupao.constant.UserConstant.USER_LOGIN_STATE;

/**
* @author cat
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-03-07 15:33:33
*/
public interface UserService extends IService<User> {


    /**
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword
     * @return
     */
    long userRegister(String userAccount,String userPassword,String checkPassword,String planetCode);


    User userLogin(String userAccount, String userPassword, HttpServletRequest request);


    User getSafetyUser(User originUser);

    int userLogout(HttpServletRequest request);

    /**
     * 根据标签搜索用户
     * @param tagList
     * @return
     */
    List<User> searchUsersByTags(List<String> tagList);

    int updateUser(User user,User loginUser);

    User getLoginUser(HttpServletRequest request);

    boolean isAdmin(HttpServletRequest request);

    boolean isAdmin(User loginUser);

    List<User> matchUsers(long num, User user);
}
