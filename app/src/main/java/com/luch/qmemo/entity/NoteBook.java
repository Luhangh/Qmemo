package com.luch.qmemo.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author: lh on 2018/8/10 17:05.
 * Email:luchefg@gmail.com
 * Description: 笔记本
 */

@Entity
public class NoteBook {

    @Id
    private String id;

    /**
     * 笔记本名字
     */
    private String Name;

    /**
     * 笔记数量
     */
    private String num;

    /**
     * 用户名字
     */
    private String userId;


    /**
     * 笔记本封面
     */
    private String cover;

    /**
     * 备注
     */
    private String remark;


    @Generated(hash = 2120986777)
    public NoteBook(String id, String Name, String num, String userId, String cover,
            String remark) {
        this.id = id;
        this.Name = Name;
        this.num = num;
        this.userId = userId;
        this.cover = cover;
        this.remark = remark;
    }


    @Generated(hash = 2066935268)
    public NoteBook() {
    }


    public String getId() {
        return this.id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return this.Name;
    }


    public void setName(String Name) {
        this.Name = Name;
    }


    public String getNum() {
        return this.num;
    }


    public void setNum(String num) {
        this.num = num;
    }


    public String getUserId() {
        return this.userId;
    }


    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getCover() {
        return this.cover;
    }


    public void setCover(String cover) {
        this.cover = cover;
    }


    public String getRemark() {
        return this.remark;
    }


    public void setRemark(String remark) {
        this.remark = remark;
    }



}
