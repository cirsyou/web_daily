package com.e3expo.e3.middleware.mapper;

import com.e3expo.e3.model.DesignerFileType;

public interface DesignerFileTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_designer_file_type
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_designer_file_type
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int insert(DesignerFileType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_designer_file_type
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int insertSelective(DesignerFileType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_designer_file_type
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    DesignerFileType selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_designer_file_type
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int updateByPrimaryKeySelective(DesignerFileType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dic_designer_file_type
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int updateByPrimaryKey(DesignerFileType record);
}