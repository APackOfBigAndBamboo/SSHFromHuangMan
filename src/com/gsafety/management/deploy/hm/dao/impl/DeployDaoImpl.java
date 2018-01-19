package com.gsafety.management.deploy.hm.dao.impl;

import com.gsafety.management.deploy.hm.dao.DeployDao;
import com.gsafety.management.pojo.Deploy;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("deployDaoImpl")
public class DeployDaoImpl implements DeployDao {
    @Resource(name = "hibernateTemplate")
    private HibernateTemplate hibernateTemplate;

    public void addDeploy(Deploy deploy) {
        hibernateTemplate.save(deploy);
    }

    public void deleteDeployById(Integer id) {
        hibernateTemplate.delete(id);
    }

    public void updateDeploy(Deploy deploy) {
        hibernateTemplate.update(deploy);
    }

    public Deploy getDeployById(Integer id) {
        List<Deploy> list = (List<Deploy>) hibernateTemplate.find("from Deploy d LEFT OUTER JOIN FETCH d.master where d.id = ?", id);
        return list.size() > 0 ? list.get(0) : null;
    }

    public Deploy getDeployByName(String systemName) {
        return null;
    }

    public List<Deploy> getDeploys() {
        List<Deploy> list = (List<Deploy>) hibernateTemplate.find("from Deploy d LEFT OUTER JOIN FETCH d.master");
        return list.size() > 0 ? list : null;
    }
}
