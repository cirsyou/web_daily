package com.e3expo.e3.model;

import java.io.Serializable;
public class Appeal implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_appeal.id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_appeal.order_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_appeal.designer_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer designerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_appeal.company_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer companyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_appeal.appeal_type
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer appealType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_appeal.appeal_msg
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private String appealMsg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_appeal.link_men
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private String linkMen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_appeal.link_phone
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private String linkPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_appeal.status
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_appeal.handler_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer handlerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_appeal.remark
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_appeal.create_time
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Long createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_appeal.update_time
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Long updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_appeal.id
     *
     * @return the value of te_appeal.id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_appeal.id
     *
     * @param id the value for te_appeal.id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_appeal.order_id
     *
     * @return the value of te_appeal.order_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_appeal.order_id
     *
     * @param orderId the value for te_appeal.order_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_appeal.designer_id
     *
     * @return the value of te_appeal.designer_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getDesignerId() {
        return designerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_appeal.designer_id
     *
     * @param designerId the value for te_appeal.designer_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setDesignerId(Integer designerId) {
        this.designerId = designerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_appeal.company_id
     *
     * @return the value of te_appeal.company_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_appeal.company_id
     *
     * @param companyId the value for te_appeal.company_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_appeal.appeal_type
     *
     * @return the value of te_appeal.appeal_type
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getAppealType() {
        return appealType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_appeal.appeal_type
     *
     * @param appealType the value for te_appeal.appeal_type
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setAppealType(Integer appealType) {
        this.appealType = appealType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_appeal.appeal_msg
     *
     * @return the value of te_appeal.appeal_msg
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public String getAppealMsg() {
        return appealMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_appeal.appeal_msg
     *
     * @param appealMsg the value for te_appeal.appeal_msg
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setAppealMsg(String appealMsg) {
        this.appealMsg = appealMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_appeal.link_men
     *
     * @return the value of te_appeal.link_men
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public String getLinkMen() {
        return linkMen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_appeal.link_men
     *
     * @param linkMen the value for te_appeal.link_men
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setLinkMen(String linkMen) {
        this.linkMen = linkMen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_appeal.link_phone
     *
     * @return the value of te_appeal.link_phone
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public String getLinkPhone() {
        return linkPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_appeal.link_phone
     *
     * @param linkPhone the value for te_appeal.link_phone
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_appeal.status
     *
     * @return the value of te_appeal.status
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_appeal.status
     *
     * @param status the value for te_appeal.status
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_appeal.handler_id
     *
     * @return the value of te_appeal.handler_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getHandlerId() {
        return handlerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_appeal.handler_id
     *
     * @param handlerId the value for te_appeal.handler_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setHandlerId(Integer handlerId) {
        this.handlerId = handlerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_appeal.remark
     *
     * @return the value of te_appeal.remark
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_appeal.remark
     *
     * @param remark the value for te_appeal.remark
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_appeal.create_time
     *
     * @return the value of te_appeal.create_time
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_appeal.create_time
     *
     * @param createTime the value for te_appeal.create_time
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_appeal.update_time
     *
     * @return the value of te_appeal.update_time
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_appeal.update_time
     *
     * @param updateTime the value for te_appeal.update_time
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}