package com.example.java8.security;

import java.security.Permission;

public class CustomSecurityManager extends SecurityManager {
    @Override
    public void checkPermission(Permission perm) {
        // Security manager implementation
    }

    @Override
    public void checkRead(String file) {
        super.checkRead(file);
    }
}