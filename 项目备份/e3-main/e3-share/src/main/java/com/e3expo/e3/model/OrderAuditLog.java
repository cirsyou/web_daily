package com.e3expo.e3.model;

import java.io.Serializable;
public class OrderAuditLog implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_order_audit_log.id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_order_audit_log.designer_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer designerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_order_audit_log.order_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_order_audit_log.status
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_order_audit_log.update_time
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Long updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_order_audit_log.user_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_order_audit_log.audit_time
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Long auditTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_order_audit_log.message
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private String message;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column te_order_audit_log.node_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    private Integer nodeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_order_audit_log.id
     *
     * @return the value of te_order_audit_log.id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_order_audit_log.id
     *
     * @param id the value for te_order_audit_log.id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_order_audit_log.designer_id
     *
     * @return the value of te_order_audit_log.designer_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getDesignerId() {
        return designerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_order_audit_log.designer_id
     *
     * @param designerId the value for te_order_audit_log.designer_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setDesignerId(Integer designerId) {
        this.designerId = designerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_order_audit_log.order_id
     *
     * @return the value of te_order_audit_log.order_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_order_audit_log.order_id
     *
     * @param orderId the value for te_order_audit_log.order_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_order_audit_log.status
     *
     * @return the value of te_order_audit_log.status
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_order_audit_log.status
     *
     * @param status the value for te_order_audit_log.status
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_order_audit_log.update_time
     *
     * @return the value of te_order_audit_log.update_time
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_order_audit_log.update_time
     *
     * @param updateTime the value for te_order_audit_log.update_time
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_order_audit_log.user_id
     *
     * @return the value of te_order_audit_log.user_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_order_audit_log.user_id
     *
     * @param userId the value for te_order_audit_log.user_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_order_audit_log.audit_time
     *
     * @return the value of te_order_audit_log.audit_time
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Long getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_order_audit_log.audit_time
     *
     * @param auditTime the value for te_order_audit_log.audit_time
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setAuditTime(Long auditTime) {
        this.auditTime = auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_order_audit_log.message
     *
     * @return the value of te_order_audit_log.message
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_order_audit_log.message
     *
     * @param message the value for te_order_audit_log.message
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column te_order_audit_log.node_id
     *
     * @return the value of te_order_audit_log.node_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public Integer getNodeId() {
        return nodeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column te_order_audit_log.node_id
     *
     * @param nodeId the value for te_order_audit_log.node_id
     *
     * @mbggenerated Tue Nov 07 16:26:13 CST 2017
     */
    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }
}