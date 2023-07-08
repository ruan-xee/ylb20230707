package com.rxee.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class BidInfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_bid_info.id
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_bid_info.prod_id
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private Integer prodId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_bid_info.uid
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_bid_info.bid_money
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private BigDecimal bidMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_bid_info.bid_time
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private Date bidTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_bid_info.bid_status
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private Integer bidStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table b_bid_info
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_bid_info.id
     *
     * @return the value of b_bid_info.id
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public BidInfo withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_bid_info.id
     *
     * @param id the value for b_bid_info.id
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_bid_info.prod_id
     *
     * @return the value of b_bid_info.prod_id
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public Integer getProdId() {
        return prodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public BidInfo withProdId(Integer prodId) {
        this.setProdId(prodId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_bid_info.prod_id
     *
     * @param prodId the value for b_bid_info.prod_id
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_bid_info.uid
     *
     * @return the value of b_bid_info.uid
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public BidInfo withUid(Integer uid) {
        this.setUid(uid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_bid_info.uid
     *
     * @param uid the value for b_bid_info.uid
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_bid_info.bid_money
     *
     * @return the value of b_bid_info.bid_money
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public BigDecimal getBidMoney() {
        return bidMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public BidInfo withBidMoney(BigDecimal bidMoney) {
        this.setBidMoney(bidMoney);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_bid_info.bid_money
     *
     * @param bidMoney the value for b_bid_info.bid_money
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public void setBidMoney(BigDecimal bidMoney) {
        this.bidMoney = bidMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_bid_info.bid_time
     *
     * @return the value of b_bid_info.bid_time
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public Date getBidTime() {
        return bidTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public BidInfo withBidTime(Date bidTime) {
        this.setBidTime(bidTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_bid_info.bid_time
     *
     * @param bidTime the value for b_bid_info.bid_time
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public void setBidTime(Date bidTime) {
        this.bidTime = bidTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_bid_info.bid_status
     *
     * @return the value of b_bid_info.bid_status
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public Integer getBidStatus() {
        return bidStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public BidInfo withBidStatus(Integer bidStatus) {
        this.setBidStatus(bidStatus);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_bid_info.bid_status
     *
     * @param bidStatus the value for b_bid_info.bid_status
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public void setBidStatus(Integer bidStatus) {
        this.bidStatus = bidStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", prodId=").append(prodId);
        sb.append(", uid=").append(uid);
        sb.append(", bidMoney=").append(bidMoney);
        sb.append(", bidTime=").append(bidTime);
        sb.append(", bidStatus=").append(bidStatus);
        sb.append("]");
        return sb.toString();
    }
}