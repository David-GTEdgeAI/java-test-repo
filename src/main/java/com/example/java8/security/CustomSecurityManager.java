package com.example.java8.security;

import java.security.Permission;

public class CustomSecurityManager extends SecurityManager {
    @Override
    public void checkPermission(Permission perm) {
        // Java 8 specific security manager implementation
        // This approach was deprecated in Java 17
    }

    @Override
    public void checkRead(String file) {
        super.checkRead(file);
    }
}
