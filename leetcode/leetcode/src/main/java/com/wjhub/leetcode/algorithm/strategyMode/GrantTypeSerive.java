package com.wjhub.leetcode.algorithm.strategyMode;

import org.springframework.stereotype.Service;

@Service
public class GrantTypeSerive {
    public String redPaper(String resourceId) {
        System.out.println("resourceId = " + resourceId);
        return resourceId + "redPaper";
    }

    public String shopping(String resourceId) {
        System.out.println("resourceId = " + resourceId);
        return resourceId + "shopping";
    }

    public String QQVip(String resourceId) {
        System.out.println("resourceId = " + resourceId);
        return resourceId + "QQVip";
    }
}
