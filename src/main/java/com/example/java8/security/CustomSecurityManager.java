package com.example.java8.security;

import java.security.Permission;

public class CustomSecurityManager extends SecurityManager {
    @Override
    public void checkPermission(Permission perm) {
        // Java 17 specific security manager implementation
        // This approach is no longer deprecated
        super.checkPermission(perm);
    }

    @Override
    public void checkRead(String file) {
        super.checkRead(file);
    }
}