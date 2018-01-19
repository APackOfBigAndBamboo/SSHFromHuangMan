package com.gsafety.management.deploy.hm.action;

import com.gsafety.management.deploy.hm.service.DeployService;
import com.gsafety.management.pojo.Deploy;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller("deployAction")
@Scope("prototype")
public class DeployAction extends ActionSupport implements ModelDriven {
    private Deploy deploy = new Deploy();

    @Resource(name = "deployServiceImpl")
    private DeployService deployService;

    public String getDeploys() {
        List<Deploy> list = deployService.getDeploys();
        if (list != null) {
            ServletActionContext.getRequest().setAttribute("list", list);
        }
        return SUCCESS;
    }

    public String getDeployByIp() {
        String id = ServletActionContext.getRequest().getParameter("id");
        deploy = deployService.getDeployById(Integer.parseInt(id));
        ServletActionContext.getRequest().setAttribute("deploy", deploy);
        return SUCCESS;
    }

    public String getDeployByName() {
        String id = ServletActionContext.getRequest().getParameter("id");
        deploy = deployService.getDeployById(Integer.parseInt(id));
        ServletActionContext.getRequest().setAttribute("deploy", deploy);
        return SUCCESS;
    }

    public Object getModel() {
        return deploy;
    }
}
