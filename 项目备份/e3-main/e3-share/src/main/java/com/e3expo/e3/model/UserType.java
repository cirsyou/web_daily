package com.e3expo.e3.model;

import java.io.Serializable;
public class UserType implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dic_user_type.id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dic_user_type.user_type_name
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private String userTypeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dic_user_type.is_valid
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer isValid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dic_user_type.update_time
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Long updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dic_user_type.id
     *
     * @return the value of dic_user_type.id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dic_user_type.id
     *
     * @param id the value for dic_user_type.id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dic_user_type.user_type_name
     *
     * @return the value of dic_user_type.user_type_name
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public String getUserTypeName() {
        return userTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dic_user_type.user_type_name
     *
     * @param userTypeName the value for dic_user_type.user_type_name
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dic_user_type.is_valid
     *
     * @return the value of dic_user_type.is_valid
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dic_user_type.is_valid
     *
     * @param isValid the value for dic_user_type.is_valid
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dic_user_type.update_time
     *
     * @return the value of dic_user_type.update_time
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dic_user_type.update_time
     *
     * @param updateTime the value for dic_user_type.update_time
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}