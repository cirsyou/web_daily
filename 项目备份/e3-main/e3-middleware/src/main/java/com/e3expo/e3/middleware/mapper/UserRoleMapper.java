package com.e3expo.e3.middleware.mapper;

import com.e3expo.e3.model.UserRole;

public interface UserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_role
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_role
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int insert(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_role
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int insertSelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_role
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    UserRole selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_role
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int updateByPrimaryKeySelective(UserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tr_user_role
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int updateByPrimaryKey(UserRole record);
}