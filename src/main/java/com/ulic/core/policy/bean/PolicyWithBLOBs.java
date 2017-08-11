package com.ulic.core.policy.bean;

import java.io.Serializable;

public class PolicyWithBLOBs extends Policy implements Serializable {
    private String policyContent;

    private String responseData;

    private static final long serialVersionUID = 1L;

    public String getPolicyContent() {
        return policyContent;
    }

    public void setPolicyContent(String policyContent) {
        this.policyContent = policyContent == null ? null : policyContent.trim();
    }

    public String getResponseData() {
        return responseData;
    }

    public void setResponseData(String responseData) {
        this.responseData = responseData == null ? null : responseData.trim();
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
        PolicyWithBLOBs other = (PolicyWithBLOBs) that;
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
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getPolicyContent() == null ? other.getPolicyContent() == null : this.getPolicyContent().equals(other.getPolicyContent()))
            && (this.getResponseData() == null ? other.getResponseData() == null : this.getResponseData().equals(other.getResponseData()));
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
        result = prime * result + ((getPolicyContent() == null) ? 0 : getPolicyContent().hashCode());
        result = prime * result + ((getResponseData() == null) ? 0 : getResponseData().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", policyContent=").append(policyContent);
        sb.append(", responseData=").append(responseData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}