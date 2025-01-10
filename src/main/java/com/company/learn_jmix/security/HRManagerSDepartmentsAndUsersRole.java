package com.company.learn_jmix.security;

import io.jmix.security.role.annotation.RowLevelRole;

@RowLevelRole(name = "HR manager’s departments and users", code = HRManagerSDepartmentsAndUsersRole.CODE)
public interface HRManagerSDepartmentsAndUsersRole {
    String CODE = "hr-manager’s-departments-and-users";
}