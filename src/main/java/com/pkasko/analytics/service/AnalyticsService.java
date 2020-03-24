package com.pkasko.analytics.service;

import com.pkasko.analytics.dao.AccountDao;
import com.pkasko.analytics.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class AnalyticsService {

    @Autowired
    AccountDao accountDao;

    @PostConstruct
    public void getListAccountsByTransfer() {
        System.out.println(accountDao.findAll());
    }
}
