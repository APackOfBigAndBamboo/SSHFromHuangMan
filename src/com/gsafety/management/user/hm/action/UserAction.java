package com.gsafety.management.user.hm.action;

import com.gsafety.management.pojo.User;
import com.gsafety.management.user.hm.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport implements ModelDriven {
    private User user = new User();

    @Resource(name = "userServiceImpl")
    private UserService userService;

    public String logon() {
        User logon = userService.logon(user);
        ActionContext.getContext().getSession().put("user", logon);
        if (logon != null) {
            if ("可用".equals(logon.getAccountStatus())) {
                if ("管理员".equals(logon.getAccountType())) {
                    user.setPassword("");
                    return "manage-success";
                } else if ("部署员".equals(logon.getAccountType())) {
                    user.setPassword("");
                    return "deploy-success";
                } else {
                    user.setPassword("");
                    return "demonstration-success";
                }
            }
        }
        return ERROR;
    }

    public String resetPassword() {
        String id = ServletActionContext.getRequest().getParameter("id");
        user = userService.getUserById(Integer.parseInt(id));
        user.setPassword("123456");
        userService.updateUser(user);
        return SUCCESS;
    }

    public String addUser() {
        userService.addUser(user);
        return SUCCESS;
    }

    public String updateUser() {
        if (user.getPassword() == null || "".equals(user.getPassword().trim())) {
            user.setPassword("123");
        }
        userService.updateUser(user);
        return SUCCESS;
    }

    public String updatePassword() {
        return SUCCESS;
    }

    public String getUser() {
        String id = ServletActionContext.getRequest().getParameter("id");
        user = userService.getUserById(Integer.parseInt(id));
        if (user != null) {
            ServletActionContext.getRequest().setAttribute("user", user);
        }
        return SUCCESS;
    }

    public String getUserByAccount() {
        String account = ServletActionContext.getRequest().getParameter("id");
        List<User> list = userService.getUserByAccount(account);
        if (list != null) {
            ServletActionContext.getRequest().setAttribute("list", list);
        }
        return INPUT;
    }

    public String getList() {
        List<User> list = userService.getUsers();
        ServletActionContext.getRequest().setAttribute("list", list);
        return SUCCESS;
    }

    public Object getModel() {
        return user;
    }
}
