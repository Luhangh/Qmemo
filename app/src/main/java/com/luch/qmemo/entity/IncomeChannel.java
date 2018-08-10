package com.luch.qmemo.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author: lh on 2018/8/10 17:45.
 * Email:luchefg@gmail.com
 * Description: 收入渠道
 */

@Entity
public class IncomeChannel {

    @Id
    private String id;


    /**
     * 名字
     */
    private String name;


    /**
     * 备注
     */
    private String remark;


    @Generated(hash = 866254411)
    public IncomeChannel(String id, String name, String remark) {
        this.id = id;
        this.name = name;
        this.remark = remark;
    }


    @Generated(hash = 975218640)
    public IncomeChannel() {
    }


    public String getId() {
        return this.id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getRemark() {
        return this.remark;
    }


    public void setRemark(String remark) {
        this.remark = remark;
    }


}
