package com.rxee.dataservice.mapper;

import com.rxee.entity.FinanceAccount;
import org.apache.ibatis.annotations.*;

public interface FinanceAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    @Delete({
        "delete from u_finance_account",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    @Insert({
        "insert into u_finance_account (id, uid, ",
        "available_money)",
        "values (#{id,jdbcType=INTEGER}, #{uid,jdbcType=INTEGER}, ",
        "#{availableMoney,jdbcType=DECIMAL})"
    })
    int insert(FinanceAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    int insertSelective(FinanceAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    @Select({
        "select",
        "id, uid, available_money",
        "from u_finance_account",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.rxee.backend.mapper.FinanceAccountMapper.BaseResultMap")
    FinanceAccount selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    int updateByPrimaryKeySelective(FinanceAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_finance_account
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    @Update({
        "update u_finance_account",
        "set uid = #{uid,jdbcType=INTEGER},",
          "available_money = #{availableMoney,jdbcType=DECIMAL}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FinanceAccount record);
}