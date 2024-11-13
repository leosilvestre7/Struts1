/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.struts1.action;

import com.mycompany.struts1.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Leo
 */
public class HelloWorldAction extends ActionSupport {
    private MessageStore messageStore;
    
    public String execute() {
        messageStore = new MessageStore();
        return SUCCESS;
    }
    
    public MessageStore getMessageStore() {
        return messageStore;
    }
}
