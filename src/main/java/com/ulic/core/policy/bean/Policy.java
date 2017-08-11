package com.ulic.core.policy.bean;

import java.io.Serializable;
import java.util.Date;

public class Policy implements Serializable {
    private String policyId;

    private String productMetadataId;

    private String channelId;

    private String tradeProposalId;

    private String tradeType;

    private Long tradeCost;

    private Integer onlinePay;

    private String parentPolicyId;

    private Integer policyStatus;

    private Date acceptedTime;

    private Date startedTime;

    private Date endedTime;

    private Date cancelTime;

    private String clientIp;

    private String handlerServer;

    private Date createdTime;

    private Date updatedTime;

    private Long amount;

    private static final long serialVersionUID = 1L;

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId == null ? null : policyId.trim();
    }

    public String getProductMetadataId() {
        return productMetadataId;
    }

    public void setProductMetadataId(String productMetadataId) {
        this.productMetadataId = productMetadataId == null ? null : productMetadataId.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getTradeProposalId() {
        return tradeProposalId;
    }

    public void setTradeProposalId(String tradeProposalId) {
        this.tradeProposalId = tradeProposalId == null ? null : tradeProposalId.trim();
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public Long getTradeCost() {
        return tradeCost;
    }

    public void setTradeCost(Long tradeCost) {
        this.tradeCost = tradeCost;
    }

    public Integer getOnlinePay() {
        return onlinePay;
    }

    public void setOnlinePay(Integer onlinePay) {
        this.onlinePay = onlinePay;
    }

    public String getParentPolicyId() {
        return parentPolicyId;
    }

    public void setParentPolicyId(String parentPolicyId) {
        this.parentPolicyId = parentPolicyId == null ? null : parentPolicyId.trim();
    }

    public Integer getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(Integer policyStatus) {
        this.policyStatus = policyStatus;
    }

    public Date getAcceptedTime() {
        return acceptedTime;
    }

    public void setAcceptedTime(Date acceptedTime) {
        this.acceptedTime = acceptedTime;
    }

    public Date getStartedTime() {
        return startedTime;
    }

    public void setStartedTime(Date startedTime) {
        this.startedTime = startedTime;
    }

    public Date getEndedTime() {
        return endedTime;
    }

    public void setEndedTime(Date endedTime) {
        this.endedTime = endedTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    public String getHandlerServer() {
        return handlerServer;
    }

    public void setHandlerServer(String handlerServer) {
        this.handlerServer = handlerServer == null ? null : handlerServer.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Policy other = (Policy) that;
        return (this.getPolicyId() == null ? other.getPolicyId() == null : this.getPolicyId().equals(other.getPolicyId()))
            && (this.getProductMetadataId() == null ? other.getProductMetadataId() == null : this.getProductMetadataId().equals(other.getProductMetadataId()))
            && (this.getChannelId() == null ? other.getChannelId() == null : this.getChannelId().equals(other.getChannelId()))
            && (this.getTradeProposalId() == null ? other.getTradeProposalId() == null : this.getTradeProposalId().equals(other.getTradeProposalId()))
            && (this.getTradeType() == null ? other.getTradeType() == null : this.getTradeType().equals(other.getTradeType()))
            && (this.getTradeCost() == null ? other.getTradeCost() == null : this.getTradeCost().equals(other.getTradeCost()))
            && (this.getOnlinePay() == null ? other.getOnlinePay() == null : this.getOnlinePay().equals(other.getOnlinePay()))
            && (this.getParentPolicyId() == null ? other.getParentPolicyId() == null : this.getParentPolicyId().equals(other.getParentPolicyId()))
            && (this.getPolicyStatus() == null ? other.getPolicyStatus() == null : this.getPolicyStatus().equals(other.getPolicyStatus()))
            && (this.getAcceptedTime() == null ? other.getAcceptedTime() == null : this.getAcceptedTime().equals(other.getAcceptedTime()))
            && (this.getStartedTime() == null ? other.getStartedTime() == null : this.getStartedTime().equals(other.getStartedTime()))
            && (this.getEndedTime() == null ? other.getEndedTime() == null : this.getEndedTime().equals(other.getEndedTime()))
            && (this.getCancelTime() == null ? other.getCancelTime() == null : this.getCancelTime().equals(other.getCancelTime()))
            && (this.getClientIp() == null ? other.getClientIp() == null : this.getClientIp().equals(other.getClientIp()))
            && (this.getHandlerServer() == null ? other.getHandlerServer() == null : this.getHandlerServer().equals(other.getHandlerServer()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        result = prime * result + ((getProductMetadataId() == null) ? 0 : getProductMetadataId().hashCode());
        result = prime * result + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        result = prime * result + ((getTradeProposalId() == null) ? 0 : getTradeProposalId().hashCode());
        result = prime * result + ((getTradeType() == null) ? 0 : getTradeType().hashCode());
        result = prime * result + ((getTradeCost() == null) ? 0 : getTradeCost().hashCode());
        result = prime * result + ((getOnlinePay() == null) ? 0 : getOnlinePay().hashCode());
        result = prime * result + ((getParentPolicyId() == null) ? 0 : getParentPolicyId().hashCode());
        result = prime * result + ((getPolicyStatus() == null) ? 0 : getPolicyStatus().hashCode());
        result = prime * result + ((getAcceptedTime() == null) ? 0 : getAcceptedTime().hashCode());
        result = prime * result + ((getStartedTime() == null) ? 0 : getStartedTime().hashCode());
        result = prime * result + ((getEndedTime() == null) ? 0 : getEndedTime().hashCode());
        result = prime * result + ((getCancelTime() == null) ? 0 : getCancelTime().hashCode());
        result = prime * result + ((getClientIp() == null) ? 0 : getClientIp().hashCode());
        result = prime * result + ((getHandlerServer() == null) ? 0 : getHandlerServer().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", policyId=").append(policyId);
        sb.append(", productMetadataId=").append(productMetadataId);
        sb.append(", channelId=").append(channelId);
        sb.append(", tradeProposalId=").append(tradeProposalId);
        sb.append(", tradeType=").append(tradeType);
        sb.append(", tradeCost=").append(tradeCost);
        sb.append(", onlinePay=").append(onlinePay);
        sb.append(", parentPolicyId=").append(parentPolicyId);
        sb.append(", policyStatus=").append(policyStatus);
        sb.append(", acceptedTime=").append(acceptedTime);
        sb.append(", startedTime=").append(startedTime);
        sb.append(", endedTime=").append(endedTime);
        sb.append(", cancelTime=").append(cancelTime);
        sb.append(", clientIp=").append(clientIp);
        sb.append(", handlerServer=").append(handlerServer);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", amount=").append(amount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}