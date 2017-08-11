package com.ulic.core.policy.bean;

import java.io.Serializable;
import java.util.Date;

public class ExtendInfo implements Serializable {
    private String productMetadataId;

    private String extendChargeField;

    private Double premiumRatio;

    private Integer premiumAcceptRule;

    private Double amountRatio;

    private Integer amountAcceptRule;

    private String creator;

    private Date createdTime;

    private String editor;

    private Date updatedTime;

    private static final long serialVersionUID = 1L;

    public String getProductMetadataId() {
        return productMetadataId;
    }

    public void setProductMetadataId(String productMetadataId) {
        this.productMetadataId = productMetadataId == null ? null : productMetadataId.trim();
    }

    public String getExtendChargeField() {
        return extendChargeField;
    }

    public void setExtendChargeField(String extendChargeField) {
        this.extendChargeField = extendChargeField == null ? null : extendChargeField.trim();
    }

    public Double getPremiumRatio() {
        return premiumRatio;
    }

    public void setPremiumRatio(Double premiumRatio) {
        this.premiumRatio = premiumRatio;
    }

    public Integer getPremiumAcceptRule() {
        return premiumAcceptRule;
    }

    public void setPremiumAcceptRule(Integer premiumAcceptRule) {
        this.premiumAcceptRule = premiumAcceptRule;
    }

    public Double getAmountRatio() {
        return amountRatio;
    }

    public void setAmountRatio(Double amountRatio) {
        this.amountRatio = amountRatio;
    }

    public Integer getAmountAcceptRule() {
        return amountAcceptRule;
    }

    public void setAmountAcceptRule(Integer amountAcceptRule) {
        this.amountAcceptRule = amountAcceptRule;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
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
        ExtendInfo other = (ExtendInfo) that;
        return (this.getProductMetadataId() == null ? other.getProductMetadataId() == null : this.getProductMetadataId().equals(other.getProductMetadataId()))
            && (this.getExtendChargeField() == null ? other.getExtendChargeField() == null : this.getExtendChargeField().equals(other.getExtendChargeField()))
            && (this.getPremiumRatio() == null ? other.getPremiumRatio() == null : this.getPremiumRatio().equals(other.getPremiumRatio()))
            && (this.getPremiumAcceptRule() == null ? other.getPremiumAcceptRule() == null : this.getPremiumAcceptRule().equals(other.getPremiumAcceptRule()))
            && (this.getAmountRatio() == null ? other.getAmountRatio() == null : this.getAmountRatio().equals(other.getAmountRatio()))
            && (this.getAmountAcceptRule() == null ? other.getAmountAcceptRule() == null : this.getAmountAcceptRule().equals(other.getAmountAcceptRule()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getEditor() == null ? other.getEditor() == null : this.getEditor().equals(other.getEditor()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductMetadataId() == null) ? 0 : getProductMetadataId().hashCode());
        result = prime * result + ((getExtendChargeField() == null) ? 0 : getExtendChargeField().hashCode());
        result = prime * result + ((getPremiumRatio() == null) ? 0 : getPremiumRatio().hashCode());
        result = prime * result + ((getPremiumAcceptRule() == null) ? 0 : getPremiumAcceptRule().hashCode());
        result = prime * result + ((getAmountRatio() == null) ? 0 : getAmountRatio().hashCode());
        result = prime * result + ((getAmountAcceptRule() == null) ? 0 : getAmountAcceptRule().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        result = prime * result + ((getEditor() == null) ? 0 : getEditor().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productMetadataId=").append(productMetadataId);
        sb.append(", extendChargeField=").append(extendChargeField);
        sb.append(", premiumRatio=").append(premiumRatio);
        sb.append(", premiumAcceptRule=").append(premiumAcceptRule);
        sb.append(", amountRatio=").append(amountRatio);
        sb.append(", amountAcceptRule=").append(amountAcceptRule);
        sb.append(", creator=").append(creator);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", editor=").append(editor);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}