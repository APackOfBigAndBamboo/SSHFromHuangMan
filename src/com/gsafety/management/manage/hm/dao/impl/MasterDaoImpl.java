package com.gsafety.management.manage.hm.dao.impl;

import com.gsafety.management.manage.hm.dao.MasterDao;
import com.gsafety.management.pojo.Master;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("masterDaoImpl")
public class MasterDaoImpl implements MasterDao {
    @Resource(name = "hibernateTemplate")
    private HibernateTemplate hibernateTemplate;

    public void addManagement(Master master) {
        hibernateTemplate.save(master);
    }

    public void deleteManagementById(Master master) {
        hibernateTemplate.delete(master);
    }

    public void updateManagement(Master master) {
        hibernateTemplate.saveOrUpdate(master);
    }

    public Master getManagementById(Integer id) {
        List<Master> list = (List<Master>) hibernateTemplate.find("from Master where id = ?", id);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<Master> getManagement() {
        return (List<Master>) hibernateTemplate.find("from Master");
    }
}
