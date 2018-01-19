package com.gsafety.management.user.hm.interceptor;

import com.gsafety.management.pojo.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class LogonInterceptor implements Interceptor {

    public void destroy() {
    }

    public void init() {
    }

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        String name = actionInvocation.getInvocationContext().getName();
        if (name.equals("logon")) {
            return actionInvocation.invoke();
        } else {
            ActionContext actionContext = actionInvocation.getInvocationContext();
            User user = (User) actionContext.getSession().get("user");
            if (user == null) {
                return "logon";
            } else {
                return actionInvocation.invoke();
            }
        }
    }
}
