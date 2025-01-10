package com.company.learn_jmix.security;

import com.company.learn_jmix.entity.Department;
import io.jmix.security.role.annotation.JpqlRowLevelPolicy;
import io.jmix.security.role.annotation.RowLevelRole;

@RowLevelRole(name = "HR manager’s departments and users", code = HRManagerSDepartmentsAndUsersRole.CODE)
public interface HRManagerSDepartmentsAndUsersRole {
    String CODE = "hr-manager-rl";

    @JpqlRowLevelPolicy(entityClass = Department.class, where = "{E}.hrManager.id = :current_user_id")
    void department();
}