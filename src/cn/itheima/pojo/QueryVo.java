package cn.itheima.pojo;

import java.util.List;

/**
 * author: zzw5005
 * date: 2018/6/22 19:31
 */


public class QueryVo {
    private User user;

    private List<Integer>  ids;

    public User getUser(){
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}
