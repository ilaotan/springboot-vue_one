package com.lcw.one.sys.service;

import com.lcw.one.sys.dao.SysMenuEODao;
import com.lcw.one.sys.entity.SysMenuEO;
import com.lcw.one.util.service.TreeEntityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuEOService extends TreeEntityService<SysMenuEODao, SysMenuEO, String> {

    @Override
    public SysMenuEO getTopEntity() {
        return get("1");
    }

    @Override
    public List<SysMenuEO> findAll() {
        return dao.findAll();
    }

    public List<SysMenuEO> listSysMenuEOByUserId(String userId) {
        return dao.listSysMenuEOByUserId(userId);
    }

    public void updateSort(String id, Integer sort) {
        dao.updateSort(id, sort);
    }
}
