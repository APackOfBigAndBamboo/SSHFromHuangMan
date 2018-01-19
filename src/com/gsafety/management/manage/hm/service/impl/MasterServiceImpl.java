package com.gsafety.management.manage.hm.service.impl;

import com.gsafety.management.manage.hm.dao.MasterDao;
import com.gsafety.management.manage.hm.service.MasterService;
import com.gsafety.management.pojo.Master;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("masterServiceImpl")
public class MasterServiceImpl implements MasterService {
    @Resource(name = "masterDaoImpl")
    private MasterDao masterDao;

    public void addManagement(Master master) {
        masterDao.addManagement(master);
    }

    public void deleteManagementById(Master master) {
        masterDao.deleteManagementById(master);
    }

    public void updateManagement(Master master) {
        masterDao.updateManagement(master);
    }

    public Master getManagementById(Integer id) {
        return masterDao.getManagementById(id);
    }

    public List<Master> getManagement() {
        return masterDao.getManagement();
    }
}
