package model;

import java.sql.Timestamp;

public class UserModel extends AbstractModel {

    private String userName;
    private String fullName;
    private String password;
    private int status;
    private Long roleId;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public Long getRoleId() {
        return roleId;
    }

    public int getStatus() {
        return status;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public String getFullName() {
        return fullName;
    }
}
