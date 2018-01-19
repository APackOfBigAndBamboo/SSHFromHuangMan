package com.gsafety.management.deploy.hm.service;

import com.gsafety.management.pojo.Deploy;

import java.util.List;

public interface DeployService {
    void addDeploy(Deploy deploy);

    void deleteDeployById(Integer id);

    void updateDeploy(Deploy deploy);

    Deploy getDeployById(Integer id);

    Deploy getDeployByName(String systemName);

    List<Deploy> getDeploys();
}
