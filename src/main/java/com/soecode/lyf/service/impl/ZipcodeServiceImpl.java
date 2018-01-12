package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.ZipCodeDao;
import com.soecode.lyf.entity.Zip;
import com.soecode.lyf.service.ZipcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZipcodeServiceImpl implements ZipcodeService {

    @Autowired
    private ZipCodeDao zipCodeDao;

    @Override
    public List<Zip> queryAll() {
        return zipCodeDao.queryAll();
    }
}
