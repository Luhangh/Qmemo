package com.luch.qmemo.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * @author: lh on 2018/8/10 17:33.
 * Email:luchefg@gmail.com
 * Description: 总收支
 */
@Entity
public class Balance {


    @Id
    private Long id;

    /**
     * 用户id
     */
    private String userId;


    /**
     * 总余额
     */
    private String balance;



    /**
     * 总支出
     */
    private String spending;




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


    @Generated(hash = 1658578386)
    public Balance(Long id, String userId, String balance, String spending,
            String createTime, String motifyTime, String remark) {
        this.id = id;
        this.userId = userId;
        this.balance = balance;
        this.spending = spending;
        this.createTime = createTime;
        this.motifyTime = motifyTime;
        this.remark = remark;
    }


    @Generated(hash = 942283129)
    public Balance() {
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


    public String getBalance() {
        return this.balance;
    }


    public void setBalance(String balance) {
        this.balance = balance;
    }


    public String getSpending() {
        return this.spending;
    }


    public void setSpending(String spending) {
        this.spending = spending;
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
