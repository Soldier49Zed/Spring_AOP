package com.houx.database_test.pojo;

/**
 * @Author: HouX
 * @Date: 2020/11/21
 * @Description:
 */
public class Role {
    private Long id;
    private String roleName;
    private String note;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getRoleName() {
        return roleName;
    }
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
}
