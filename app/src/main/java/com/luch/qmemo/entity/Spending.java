package com.luch.qmemo.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author: lh on 2018/8/10 17:33.
 * Email:luchefg@gmail.com
 * Description: 支出记录
 */
@Entity
public class Spending {


    @Id
    private Long id;

    /**
     * 用户id
     */
    private String userId;


    /**
     * 金额
     */
    private String amount;



    /**
     * 支出类型
     */
    private String channel;


    /**
     * 创建时间
     */
    private String createTime;


    /**
     * 修改时间
     */
    private String motifyTime;


    /**
     * 备注
     */
    private String remark;


    @Generated(hash = 2132686460)
    public Spending(Long id, String userId, String amount, String channel,
            String createTime, String motifyTime, String remark) {
        this.id = id;
        this.userId = userId;
        this.amount = amount;
        this.channel = channel;
        this.createTime = createTime;
        this.motifyTime = motifyTime;
        this.remark = remark;
    }


    @Generated(hash = 2056300050)
    public Spending() {
    }


    public Long getId() {
        return this.id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getUserId() {
        return this.userId;
    }


    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getAmount() {
        return this.amount;
    }


    public void setAmount(String amount) {
        this.amount = amount;
    }


    public String getChannel() {
        return this.channel;
    }


    public void setChannel(String channel) {
        this.channel = channel;
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


    public String getRemark() {
        return this.remark;
    }


    public void setRemark(String remark) {
        this.remark = remark;
    }

}
