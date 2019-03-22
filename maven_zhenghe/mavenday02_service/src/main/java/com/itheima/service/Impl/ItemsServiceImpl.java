package com.itheima.service.Impl;

import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.itheima.dao.ItmeDao;
import com.itheima.domain.Items;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItmeDao itmeDao;
    @Override
    public Items findById(Integer id) {
        Items items = itmeDao.findById(id);
        return items;
    }


}
