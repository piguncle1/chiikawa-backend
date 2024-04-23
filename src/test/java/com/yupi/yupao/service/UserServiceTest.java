package com.yupi.yupao.service;
import java.util.Arrays;
import java.util.List;

import com.yupi.yupao.model.domain.User;
//import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author cat
 */
@MapperScan("com.yupi.yupao.mapper")
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;




    @Test
    public void testAddUser(){
        User user = new User();
        user.setUsername("cxd");
        user.setUserAccount("yupi");
        user.setAvatarUrl("https://www.baidu.com/img/flexible/logo/pc/result.png");
        user.setGender(0);
        user.setUserPassword("12345678");
        user.setPhone("123");
        user.setEmail("123@163.com");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }


    @Test
    public void testSearchUsersByTags(){
        List<String> tagNameList = Arrays.asList("java","python");
        List<User> userList = userService.searchUsersByTags(tagNameList);
//        Assert.assertNotNull(userList);
    }

    @Test
    void userRegister() {
        String userAccount = "hailan";
        String userPassword = "12345678";
        String checkPassword = "12345678";
        String planetCode = "88";

        long result = userService.userRegister(userAccount, userPassword, checkPassword,planetCode);


    }
}