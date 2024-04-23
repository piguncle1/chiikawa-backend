package com.yupi.yupao.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @author cat
 */
@Data
public class UserLoginRequset implements Serializable {
    private static final long serialVersionUID = 3191241716373120793L;

    private String userAccount;
    private String userPassword;

}
