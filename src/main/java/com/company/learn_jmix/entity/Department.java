package com.company.learn_jmix.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.Version;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@JmixEntity
@Table(name = "DEPARTMENT", indexes = {
        @Index(name = "IDX_DEPARTMENT_HR_MANAGER", columnList = "HR_MANAGER_ID")
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_DEPARTMENT_UNQ", columnNames = {"NAME"})
})
@Entity
public class Department {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;
    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;
    @JoinColumn(name = "HR_MANAGER_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private User hrManager;
    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public User getHrManager() {
        return hrManager;
    }

    public void setHrManager(User hrManager) {
        this.hrManager = hrManager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}