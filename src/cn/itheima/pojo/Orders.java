package cn.itheima.pojo;

import java.util.Date;

/**
 * author: zzw5005
 * date: 2018/6/22 21:06
 */


public class Orders {
    private Integer id;

    private Integer userId;

    private String number;

    private Date createtimer;

    private String note;

    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreatetimer() {
        return createtimer;
    }

    public void setCreatetimer(Date createtimer) {
        this.createtimer = createtimer;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
