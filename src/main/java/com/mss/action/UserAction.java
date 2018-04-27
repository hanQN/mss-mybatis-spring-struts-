package com.mss.action;

import com.mss.bean.User;
import com.mss.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by 123 on 2018/4/27.
 */
@Controller
@Scope("prototype")
public class UserAction extends ActionSupport {
    private static final long serialVersionUID = 1L;

    @Resource
    private IUserService userService;
    private User user;
    private List<User> userlist;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<User> userlist) {
        this.userlist = userlist;
    }

    public String addUser(){
        userService.addUser(user);
        return SUCCESS;
    }

    public String deleteUser(){
        userService.delUser(user.getId());
        return SUCCESS;
    }

    public String getAllUser(){
        userService.getAllUser();
        return "list";
    }

    public void validate(){
        System.out.println("对action中的所有方法进行校验");
    }

    //直接返回一个字符串
    public String getUserById() throws IOException{
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("the char");//返回的字符串
        out.flush();
        out.close();
        return SUCCESS;
    }
}
