package com.gsafety.management.deploy.hm.dao;

import com.gsafety.management.pojo.Deploy;

import java.util.List;

public interface DeployDao {
    void addDeploy(Deploy deploy);

    void deleteDeployById(Integer id);

    void updateDeploy(Deploy deploy);

    Deploy getDeployById(Integer id);

    Deploy getDeployByName(String systemName);

    List<Deploy> getDeploys();
}
