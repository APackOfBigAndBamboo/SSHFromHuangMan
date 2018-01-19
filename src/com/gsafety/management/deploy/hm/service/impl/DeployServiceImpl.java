package com.gsafety.management.deploy.hm.service.impl;

import com.gsafety.management.deploy.hm.dao.DeployDao;
import com.gsafety.management.deploy.hm.service.DeployService;
import com.gsafety.management.pojo.Deploy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("deployServiceImpl")
public class DeployServiceImpl implements DeployService {
    @Resource(name = "deployDaoImpl")
    private DeployDao deployDao;

    public void addDeploy(Deploy deploy) {
        deployDao.addDeploy(deploy);
    }

    public void deleteDeployById(Integer id) {
        deployDao.deleteDeployById(id);
    }

    public void updateDeploy(Deploy deploy) {
        deployDao.updateDeploy(deploy);
    }

    public Deploy getDeployById(Integer id) {
        return deployDao.getDeployById(id);
    }

    public Deploy getDeployByName(String systemName) {
        return deployDao.getDeployByName(systemName);
    }

    public List<Deploy> getDeploys() {
        return deployDao.getDeploys();
    }
}
