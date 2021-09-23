package com.ideamart.LogIn.model;

public class LoginAuth {
    private String logName;
    private String password;

    public LoginAuth(String logName, String password) {
        this.logName = logName;
        this.password = password;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
