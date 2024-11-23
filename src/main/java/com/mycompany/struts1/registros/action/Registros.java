/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.struts1.registros.action;

import com.mycompany.struts1.register.action.*;
import com.mycompany.struts1.model.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author leoru
 */
public class Registros extends ActionSupport {

    private static final long serialVersionUID = 1L;

    private User userBean;

    public String execute() throws Exception {
        return SUCCESS;
    }

    public User getUserBean() {
        return userBean;
    }

    public void setUserBean(User user) {
        userBean = user;
    }

    public void validate() {
        if (userBean.getFirstName().length() == 0) {
            addFieldError("userBean.firstName", "First name is required.");
        }

        if (userBean.getEmail().length() == 0) {
            addFieldError("userBean.email", "Email is required.");
        }

        if (userBean.getAge() < 18) {
            addFieldError("userBean.age", "Age is required and must be 18 or older");
        }
    }

}
