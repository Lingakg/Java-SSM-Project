package com.soecode.lyf.dao;

import com.soecode.lyf.entity.Zip;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ZipCodeDao {
    List<Zip> queryAll();
}
