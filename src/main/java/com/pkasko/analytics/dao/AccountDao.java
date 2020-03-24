package com.pkasko.analytics.dao;

import com.pkasko.analytics.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountDao extends JpaRepository<Account, Long> {
    @Override
    List<Account> findAll();

}
