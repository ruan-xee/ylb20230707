package com.rxee.dataservice.mapper;

import com.rxee.entity.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_user
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    @Delete({
        "delete from u_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_user
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    @Insert({
        "insert into u_user (id, phone, ",
        "login_password, name, ",
        "id_card, add_time, ",
        "last_login_time, header_image)",
        "values (#{id,jdbcType=INTEGER}, #{phone,jdbcType=VARCHAR}, ",
        "#{loginPassword,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{idCard,jdbcType=VARCHAR}, #{addTime,jdbcType=TIMESTAMP}, ",
        "#{lastLoginTime,jdbcType=TIMESTAMP}, #{headerImage,jdbcType=VARCHAR})"
    })
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_user
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_user
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    @Select({
        "select",
        "id, phone, login_password, name, id_card, add_time, last_login_time, header_image",
        "from u_user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.rxee.backend.mapper.UserMapper.BaseResultMap")
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_user
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table u_user
     *
     * @mbg.generated Sat Jul 08 01:57:23 CST 2023
     */
    @Update({
        "update u_user",
        "set phone = #{phone,jdbcType=VARCHAR},",
          "login_password = #{loginPassword,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "id_card = #{idCard,jdbcType=VARCHAR},",
          "add_time = #{addTime,jdbcType=TIMESTAMP},",
          "last_login_time = #{lastLoginTime,jdbcType=TIMESTAMP},",
          "header_image = #{headerImage,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}