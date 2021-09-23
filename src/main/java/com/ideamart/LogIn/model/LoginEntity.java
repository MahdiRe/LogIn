package com.ideamart.LogIn.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "login", schema = "test", catalog = "")
public class LoginEntity {
    private String logName;
    private String fName;
    private String lName;
    private String password;

    @Id
    @Column(name = "logName")
    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    @Basic
    @Column(name = "fName")
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Basic
    @Column(name = "lName")
    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginEntity that = (LoginEntity) o;
        return Objects.equals(logName, that.logName) &&
                Objects.equals(fName, that.fName) &&
                Objects.equals(lName, that.lName) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logName, fName, lName, password);
    }
}
