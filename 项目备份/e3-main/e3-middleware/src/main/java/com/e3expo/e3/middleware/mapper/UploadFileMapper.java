package com.e3expo.e3.middleware.mapper;

import com.e3expo.e3.model.UploadFile;

import java.util.List;

public interface UploadFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_upload_file
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_upload_file
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int insert(UploadFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_upload_file
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int insertSelective(UploadFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_upload_file
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    UploadFile selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_upload_file
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int updateByPrimaryKeySelective(UploadFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table te_upload_file
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    int updateByPrimaryKey(UploadFile record);

    /**
     * 批量插入
     *
     * @param uploadFiles
     */
    void batchInsert(List<UploadFile> uploadFiles);

    /**
     * 根据uploadId删除
     *
     * @param uploadIdList
     */
    void deleteByUploadId(List<Integer> uploadIdList);
}