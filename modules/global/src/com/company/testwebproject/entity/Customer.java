package com.company.testwebproject.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

/*GPAREDES*/
/*GROVI 123*/

@Table(name = "TESTWEBPROJECT_CUSTOMER")
@Entity(name = "testwebproject_Customer")
public class Customer extends StandardEntity {
    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Email(message = "Email not valid", regexp = ".*")
    @NotNull
    @Column(name = "EMAIL", nullable = false)
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        /*-------*/
        name = "Giovanni"
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
