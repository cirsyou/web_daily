package com.e3expo.e3.middleware.mapper;

import com.e3expo.e3.model.Receivables;

public interface ReceivablesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_receivables
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_receivables
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int insert(Receivables record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_receivables
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int insertSelective(Receivables record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_receivables
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    Receivables selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_receivables
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int updateByPrimaryKeySelective(Receivables record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_receivables
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int updateByPrimaryKey(Receivables record);
}