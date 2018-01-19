package com.gsafety.management.manage.hm.action;

import com.gsafety.management.manage.hm.service.MasterService;
import com.gsafety.management.pojo.Master;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller("manageAction")
@Scope("prototype")
public class ManageAction extends ActionSupport implements ModelDriven {
    private Master master = new Master();

    @Resource(name = "masterServiceImpl")
    private MasterService masterService;

    public String getManagement() {
        List<Master> list = masterService.getManagement();
        if (list != null) {
            ServletActionContext.getRequest().setAttribute("list", list);
        }
        return SUCCESS;
    }

    public String getManagementById() {
        String id = ServletActionContext.getRequest().getParameter("id");
        master = masterService.getManagementById(Integer.parseInt(id));
        ServletActionContext.getRequest().setAttribute("master", master);
        return SUCCESS;
    }

    public String addMaster() {
        masterService.addManagement(master);
        return SUCCESS;
    }

    public String deleteMaster() {
        String id = ServletActionContext.getRequest().getParameter("id");
        Master master = masterService.getManagementById(Integer.parseInt(id));
        masterService.deleteManagementById(master);
        return SUCCESS;
    }

    public String updateMaster() {
        masterService.updateManagement(master);
        return SUCCESS;
    }

    public Object getModel() {
        return master;
    }
}
