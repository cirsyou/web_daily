package com.e3expo.e3.model;

import java.io.Serializable;
public class PaymentType implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dic_payment_type.id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dic_payment_type.name
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dic_payment_type.is_valid
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer isValid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dic_payment_type.id
     *
     * @return the value of dic_payment_type.id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dic_payment_type.id
     *
     * @param id the value for dic_payment_type.id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dic_payment_type.name
     *
     * @return the value of dic_payment_type.name
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dic_payment_type.name
     *
     * @param name the value for dic_payment_type.name
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dic_payment_type.is_valid
     *
     * @return the value of dic_payment_type.is_valid
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getIsValid() {
        return isValid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dic_payment_type.is_valid
     *
     * @param isValid the value for dic_payment_type.is_valid
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }
}