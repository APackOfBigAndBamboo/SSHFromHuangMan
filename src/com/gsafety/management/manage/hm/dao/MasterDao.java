package com.gsafety.management.manage.hm.dao;

import com.gsafety.management.pojo.Master;

import java.util.List;

public interface MasterDao {
    void addManagement(Master master);

    void deleteManagementById(Master master);

    void updateManagement(Master master);

    Master getManagementById(Integer id);

    List<Master> getManagement();
}
