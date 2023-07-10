package com.rxee.dataservice.mapper;

import com.rxee.api.entity.BidInfo;
import org.apache.ibatis.annotations.*;

import java.math.BigDecimal;

public interface BidInfoMapper {

    // 查询成交总金额
    BigDecimal selectSumBidMoney();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    @Delete({
        "delete from b_bid_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    @Insert({
        "insert into b_bid_info (id, prod_id, ",
        "uid, bid_money, bid_time, ",
        "bid_status)",
        "values (#{id,jdbcType=INTEGER}, #{prodId,jdbcType=INTEGER}, ",
        "#{uid,jdbcType=INTEGER}, #{bidMoney,jdbcType=DECIMAL}, #{bidTime,jdbcType=TIMESTAMP}, ",
        "#{bidStatus,jdbcType=INTEGER})"
    })
    int insert(BidInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    int insertSelective(BidInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    @Select({
        "select",
        "id, prod_id, uid, bid_money, bid_time, bid_status",
        "from b_bid_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.rxee.backend.mapper.BidInfoMapper.BaseResultMap")
    BidInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    int updateByPrimaryKeySelective(BidInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_bid_info
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    @Update({
        "update b_bid_info",
        "set prod_id = #{prodId,jdbcType=INTEGER},",
          "uid = #{uid,jdbcType=INTEGER},",
          "bid_money = #{bidMoney,jdbcType=DECIMAL},",
          "bid_time = #{bidTime,jdbcType=TIMESTAMP},",
          "bid_status = #{bidStatus,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BidInfo record);
}