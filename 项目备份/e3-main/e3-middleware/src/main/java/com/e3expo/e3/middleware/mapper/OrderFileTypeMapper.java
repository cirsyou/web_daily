package com.e3expo.e3.middleware.mapper;

import com.e3expo.e3.model.OrderFileType;

public interface OrderFileTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_order_file_type
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_order_file_type
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int insert(OrderFileType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_order_file_type
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int insertSelective(OrderFileType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_order_file_type
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    OrderFileType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_order_file_type
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int updateByPrimaryKeySelective(OrderFileType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_order_file_type
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int updateByPrimaryKey(OrderFileType record);
}