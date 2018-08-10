package com.luch.qmemo.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author: lh on 2018/8/10 17:19.
 * Email:luchefg@gmail.com
 * Description: 笔记
 */
@Entity
public class Note {

    @Id
    private String id;

    /**
     * 标题
     */
    private String title;


    /**
     * 内容
     */
    private String account;


    /**
     * 创建时间
     */
    private String createTime;


    /**
     * 修改时间
     */
    private String motifyTime;


    /**
     * 天气描述
     */
    private String weather;

    /**
     * 备注
     */
    private String remark;

    @Generated(hash = 1520233041)
    public Note(String id, String title, String account, String createTime,
            String motifyTime, String weather, String remark) {
        this.id = id;
        this.title = title;
        this.account = account;
        this.createTime = createTime;
        this.motifyTime = motifyTime;
        this.weather = weather;
        this.remark = remark;
    }

    @Generated(hash = 1272611929)
    public Note() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAccount() {
        return this.account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getMotifyTime() {
        return this.motifyTime;
    }

    public void setMotifyTime(String motifyTime) {
        this.motifyTime = motifyTime;
    }

    public String getWeather() {
        return this.weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
