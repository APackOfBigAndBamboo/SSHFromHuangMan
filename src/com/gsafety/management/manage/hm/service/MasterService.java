package com.gsafety.management.manage.hm.service;

import com.gsafety.management.pojo.Master;

import java.util.List;

public interface MasterService {
    void addManagement(Master master);

    void deleteManagementById(Master master);

    void updateManagement(Master master);

    Master getManagementById(Integer id);

    List<Master> getManagement();
}
