package com.luch.qmemo.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Transient;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author: lh on 2018/8/10 17:45.
 * Email:luchefg@gmail.com
 * Description: 用户信息表
 */
@Entity
public class User {
    @Id
    private Long id;

    /**
     * 用户名字
     */
    private String name;


    /**
     * 用户名字
     */
    private String portrait;

    /**
     * 用户密码
     */
    private String password;


    /**
     * 手机号
     */
    private String phone;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;


    /**
     * 备注
     */
    private String remark;


    @Transient //临时存储数据
    private int tempUsageCount; // not persisted

    @Generated(hash = 1979229936)
    public User(Long id, String name, String portrait, String password,
            String phone, String province, String city, String area,
            String remark) {
        this.id = id;
        this.name = name;
        this.portrait = portrait;
        this.password = password;
        this.phone = phone;
        this.province = province;
        this.city = city;
        this.area = area;
        this.remark = remark;
    }

    @Generated(hash = 586692638)
    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTempUsageCount() {
        return tempUsageCount;
    }

    public void setTempUsageCount(int tempUsageCount) {
        this.tempUsageCount = tempUsageCount;
    }

    public String getPortrait() {
        return this.portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}