package com.company.learn_jmix.security;

import io.jmix.security.role.annotation.ResourceRole;

@ResourceRole(name = "HR Manager", code = HRManagerRole.CODE)
public interface HRManagerRole {
    String CODE = "hr-manager";
}