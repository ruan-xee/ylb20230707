package com.rxee.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class IncomeRecord implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_income_record.id
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_income_record.uid
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_income_record.prod_id
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private Integer prodId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_income_record.bid_id
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private Integer bidId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_income_record.bid_money
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private BigDecimal bidMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_income_record.income_date
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private Date incomeDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_income_record.income_money
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private BigDecimal incomeMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column b_income_record.income_status
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private Integer incomeStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table b_income_record
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_income_record.id
     *
     * @return the value of b_income_record.id
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_income_record
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public IncomeRecord withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_income_record.id
     *
     * @param id the value for b_income_record.id
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_income_record.uid
     *
     * @return the value of b_income_record.uid
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_income_record
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public IncomeRecord withUid(Integer uid) {
        this.setUid(uid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_income_record.uid
     *
     * @param uid the value for b_income_record.uid
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_income_record.prod_id
     *
     * @return the value of b_income_record.prod_id
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public Integer getProdId() {
        return prodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_income_record
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public IncomeRecord withProdId(Integer prodId) {
        this.setProdId(prodId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_income_record.prod_id
     *
     * @param prodId the value for b_income_record.prod_id
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_income_record.bid_id
     *
     * @return the value of b_income_record.bid_id
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public Integer getBidId() {
        return bidId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_income_record
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public IncomeRecord withBidId(Integer bidId) {
        this.setBidId(bidId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_income_record.bid_id
     *
     * @param bidId the value for b_income_record.bid_id
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public void setBidId(Integer bidId) {
        this.bidId = bidId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_income_record.bid_money
     *
     * @return the value of b_income_record.bid_money
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public BigDecimal getBidMoney() {
        return bidMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_income_record
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public IncomeRecord withBidMoney(BigDecimal bidMoney) {
        this.setBidMoney(bidMoney);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_income_record.bid_money
     *
     * @param bidMoney the value for b_income_record.bid_money
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public void setBidMoney(BigDecimal bidMoney) {
        this.bidMoney = bidMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_income_record.income_date
     *
     * @return the value of b_income_record.income_date
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public Date getIncomeDate() {
        return incomeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_income_record
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public IncomeRecord withIncomeDate(Date incomeDate) {
        this.setIncomeDate(incomeDate);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_income_record.income_date
     *
     * @param incomeDate the value for b_income_record.income_date
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public void setIncomeDate(Date incomeDate) {
        this.incomeDate = incomeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_income_record.income_money
     *
     * @return the value of b_income_record.income_money
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public BigDecimal getIncomeMoney() {
        return incomeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_income_record
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public IncomeRecord withIncomeMoney(BigDecimal incomeMoney) {
        this.setIncomeMoney(incomeMoney);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_income_record.income_money
     *
     * @param incomeMoney the value for b_income_record.income_money
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public void setIncomeMoney(BigDecimal incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column b_income_record.income_status
     *
     * @return the value of b_income_record.income_status
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public Integer getIncomeStatus() {
        return incomeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_income_record
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public IncomeRecord withIncomeStatus(Integer incomeStatus) {
        this.setIncomeStatus(incomeStatus);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column b_income_record.income_status
     *
     * @param incomeStatus the value for b_income_record.income_status
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    public void setIncomeStatus(Integer incomeStatus) {
        this.incomeStatus = incomeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_income_record
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
        sb.append(", uid=").append(uid);
        sb.append(", prodId=").append(prodId);
        sb.append(", bidId=").append(bidId);
        sb.append(", bidMoney=").append(bidMoney);
        sb.append(", incomeDate=").append(incomeDate);
        sb.append(", incomeMoney=").append(incomeMoney);
        sb.append(", incomeStatus=").append(incomeStatus);
        sb.append("]");
        return sb.toString();
    }
}