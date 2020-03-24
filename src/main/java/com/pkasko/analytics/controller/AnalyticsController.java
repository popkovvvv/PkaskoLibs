package com.pkasko.analytics.controller;

import com.pkasko.analytics.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyticsController {

    @Autowired
    AnalyticsService analyticsService;

    @GetMapping("/get/accounts/cat-transfer/{type}")
    public void main(@PathVariable Boolean type) {
       // analyticsService.getListAccountsByTransfer(type);
    }
}
