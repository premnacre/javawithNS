/**
 * ManufacturingRoutingSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2014_2;

public class ManufacturingRoutingSearchBasic  extends com.netsuite.webservices.platform.core_2014_2.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField autoCalculateLag;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] externalId;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId;

    private com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isDefault;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isInactive;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] subsidiary;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] item;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField lagAmount;

    private java.lang.String[] lagType;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField lagUnits;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] location;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] manufacturingCostTemplate;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] manufacturingWorkCenter;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField memo;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField name;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField operationName;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField operationYield;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField runRate;

    private com.netsuite.webservices.platform.core_2014_2.SearchLongField sequence;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField setupTime;

    private com.netsuite.webservices.platform.core_2014_2.SearchCustomField[] customFieldList;

    public ManufacturingRoutingSearchBasic() {
    }

    public ManufacturingRoutingSearchBasic(
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField autoCalculateLag,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] externalId,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId,
           com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isDefault,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isInactive,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] subsidiary,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] item,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField lagAmount,
           java.lang.String[] lagType,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField lagUnits,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] location,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] manufacturingCostTemplate,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] manufacturingWorkCenter,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField memo,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField name,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField operationName,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField operationYield,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField runRate,
           com.netsuite.webservices.platform.core_2014_2.SearchLongField sequence,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField setupTime,
           com.netsuite.webservices.platform.core_2014_2.SearchCustomField[] customFieldList) {
        this.autoCalculateLag = autoCalculateLag;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isDefault = isDefault;
        this.isInactive = isInactive;
        this.subsidiary = subsidiary;
        this.item = item;
        this.lagAmount = lagAmount;
        this.lagType = lagType;
        this.lagUnits = lagUnits;
        this.location = location;
        this.manufacturingCostTemplate = manufacturingCostTemplate;
        this.manufacturingWorkCenter = manufacturingWorkCenter;
        this.memo = memo;
        this.name = name;
        this.operationName = operationName;
        this.operationYield = operationYield;
        this.runRate = runRate;
        this.sequence = sequence;
        this.setupTime = setupTime;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the autoCalculateLag value for this ManufacturingRoutingSearchBasic.
     * 
     * @return autoCalculateLag
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getAutoCalculateLag() {
        return autoCalculateLag;
    }


    /**
     * Sets the autoCalculateLag value for this ManufacturingRoutingSearchBasic.
     * 
     * @param autoCalculateLag
     */
    public void setAutoCalculateLag(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField autoCalculateLag) {
        this.autoCalculateLag = autoCalculateLag;
    }


    /**
     * Gets the externalId value for this ManufacturingRoutingSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ManufacturingRoutingSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2014_2.RecordRef[] externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this ManufacturingRoutingSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this ManufacturingRoutingSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2014_2.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this ManufacturingRoutingSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ManufacturingRoutingSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this ManufacturingRoutingSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this ManufacturingRoutingSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isDefault value for this ManufacturingRoutingSearchBasic.
     * 
     * @return isDefault
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getIsDefault() {
        return isDefault;
    }


    /**
     * Sets the isDefault value for this ManufacturingRoutingSearchBasic.
     * 
     * @param isDefault
     */
    public void setIsDefault(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isDefault) {
        this.isDefault = isDefault;
    }


    /**
     * Gets the isInactive value for this ManufacturingRoutingSearchBasic.
     * 
     * @return isInactive
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this ManufacturingRoutingSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the subsidiary value for this ManufacturingRoutingSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this ManufacturingRoutingSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2014_2.RecordRef[] subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the item value for this ManufacturingRoutingSearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this ManufacturingRoutingSearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2014_2.RecordRef[] item) {
        this.item = item;
    }


    /**
     * Gets the lagAmount value for this ManufacturingRoutingSearchBasic.
     * 
     * @return lagAmount
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getLagAmount() {
        return lagAmount;
    }


    /**
     * Sets the lagAmount value for this ManufacturingRoutingSearchBasic.
     * 
     * @param lagAmount
     */
    public void setLagAmount(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField lagAmount) {
        this.lagAmount = lagAmount;
    }


    /**
     * Gets the lagType value for this ManufacturingRoutingSearchBasic.
     * 
     * @return lagType
     */
    public java.lang.String[] getLagType() {
        return lagType;
    }


    /**
     * Sets the lagType value for this ManufacturingRoutingSearchBasic.
     * 
     * @param lagType
     */
    public void setLagType(java.lang.String[] lagType) {
        this.lagType = lagType;
    }


    /**
     * Gets the lagUnits value for this ManufacturingRoutingSearchBasic.
     * 
     * @return lagUnits
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getLagUnits() {
        return lagUnits;
    }


    /**
     * Sets the lagUnits value for this ManufacturingRoutingSearchBasic.
     * 
     * @param lagUnits
     */
    public void setLagUnits(com.netsuite.webservices.platform.core_2014_2.SearchStringField lagUnits) {
        this.lagUnits = lagUnits;
    }


    /**
     * Gets the location value for this ManufacturingRoutingSearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ManufacturingRoutingSearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2014_2.RecordRef[] location) {
        this.location = location;
    }


    /**
     * Gets the manufacturingCostTemplate value for this ManufacturingRoutingSearchBasic.
     * 
     * @return manufacturingCostTemplate
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getManufacturingCostTemplate() {
        return manufacturingCostTemplate;
    }


    /**
     * Sets the manufacturingCostTemplate value for this ManufacturingRoutingSearchBasic.
     * 
     * @param manufacturingCostTemplate
     */
    public void setManufacturingCostTemplate(com.netsuite.webservices.platform.core_2014_2.RecordRef[] manufacturingCostTemplate) {
        this.manufacturingCostTemplate = manufacturingCostTemplate;
    }


    /**
     * Gets the manufacturingWorkCenter value for this ManufacturingRoutingSearchBasic.
     * 
     * @return manufacturingWorkCenter
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getManufacturingWorkCenter() {
        return manufacturingWorkCenter;
    }


    /**
     * Sets the manufacturingWorkCenter value for this ManufacturingRoutingSearchBasic.
     * 
     * @param manufacturingWorkCenter
     */
    public void setManufacturingWorkCenter(com.netsuite.webservices.platform.core_2014_2.RecordRef[] manufacturingWorkCenter) {
        this.manufacturingWorkCenter = manufacturingWorkCenter;
    }


    /**
     * Gets the memo value for this ManufacturingRoutingSearchBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this ManufacturingRoutingSearchBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2014_2.SearchStringField memo) {
        this.memo = memo;
    }


    /**
     * Gets the name value for this ManufacturingRoutingSearchBasic.
     * 
     * @return name
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getName() {
        return name;
    }


    /**
     * Sets the name value for this ManufacturingRoutingSearchBasic.
     * 
     * @param name
     */
    public void setName(com.netsuite.webservices.platform.core_2014_2.SearchStringField name) {
        this.name = name;
    }


    /**
     * Gets the operationName value for this ManufacturingRoutingSearchBasic.
     * 
     * @return operationName
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getOperationName() {
        return operationName;
    }


    /**
     * Sets the operationName value for this ManufacturingRoutingSearchBasic.
     * 
     * @param operationName
     */
    public void setOperationName(com.netsuite.webservices.platform.core_2014_2.SearchStringField operationName) {
        this.operationName = operationName;
    }


    /**
     * Gets the operationYield value for this ManufacturingRoutingSearchBasic.
     * 
     * @return operationYield
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getOperationYield() {
        return operationYield;
    }


    /**
     * Sets the operationYield value for this ManufacturingRoutingSearchBasic.
     * 
     * @param operationYield
     */
    public void setOperationYield(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField operationYield) {
        this.operationYield = operationYield;
    }


    /**
     * Gets the runRate value for this ManufacturingRoutingSearchBasic.
     * 
     * @return runRate
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getRunRate() {
        return runRate;
    }


    /**
     * Sets the runRate value for this ManufacturingRoutingSearchBasic.
     * 
     * @param runRate
     */
    public void setRunRate(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField runRate) {
        this.runRate = runRate;
    }


    /**
     * Gets the sequence value for this ManufacturingRoutingSearchBasic.
     * 
     * @return sequence
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchLongField getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this ManufacturingRoutingSearchBasic.
     * 
     * @param sequence
     */
    public void setSequence(com.netsuite.webservices.platform.core_2014_2.SearchLongField sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the setupTime value for this ManufacturingRoutingSearchBasic.
     * 
     * @return setupTime
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getSetupTime() {
        return setupTime;
    }


    /**
     * Sets the setupTime value for this ManufacturingRoutingSearchBasic.
     * 
     * @param setupTime
     */
    public void setSetupTime(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField setupTime) {
        this.setupTime = setupTime;
    }


    /**
     * Gets the customFieldList value for this ManufacturingRoutingSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchCustomField[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ManufacturingRoutingSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2014_2.SearchCustomField[] customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManufacturingRoutingSearchBasic)) return false;
        ManufacturingRoutingSearchBasic other = (ManufacturingRoutingSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.autoCalculateLag==null && other.getAutoCalculateLag()==null) || 
             (this.autoCalculateLag!=null &&
              this.autoCalculateLag.equals(other.getAutoCalculateLag()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isDefault==null && other.getIsDefault()==null) || 
             (this.isDefault!=null &&
              this.isDefault.equals(other.getIsDefault()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.lagAmount==null && other.getLagAmount()==null) || 
             (this.lagAmount!=null &&
              this.lagAmount.equals(other.getLagAmount()))) &&
            ((this.lagType==null && other.getLagType()==null) || 
             (this.lagType!=null &&
              java.util.Arrays.equals(this.lagType, other.getLagType()))) &&
            ((this.lagUnits==null && other.getLagUnits()==null) || 
             (this.lagUnits!=null &&
              this.lagUnits.equals(other.getLagUnits()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.manufacturingCostTemplate==null && other.getManufacturingCostTemplate()==null) || 
             (this.manufacturingCostTemplate!=null &&
              java.util.Arrays.equals(this.manufacturingCostTemplate, other.getManufacturingCostTemplate()))) &&
            ((this.manufacturingWorkCenter==null && other.getManufacturingWorkCenter()==null) || 
             (this.manufacturingWorkCenter!=null &&
              java.util.Arrays.equals(this.manufacturingWorkCenter, other.getManufacturingWorkCenter()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.operationName==null && other.getOperationName()==null) || 
             (this.operationName!=null &&
              this.operationName.equals(other.getOperationName()))) &&
            ((this.operationYield==null && other.getOperationYield()==null) || 
             (this.operationYield!=null &&
              this.operationYield.equals(other.getOperationYield()))) &&
            ((this.runRate==null && other.getRunRate()==null) || 
             (this.runRate!=null &&
              this.runRate.equals(other.getRunRate()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.setupTime==null && other.getSetupTime()==null) || 
             (this.setupTime!=null &&
              this.setupTime.equals(other.getSetupTime()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              java.util.Arrays.equals(this.customFieldList, other.getCustomFieldList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAutoCalculateLag() != null) {
            _hashCode += getAutoCalculateLag().hashCode();
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsDefault() != null) {
            _hashCode += getIsDefault().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLagAmount() != null) {
            _hashCode += getLagAmount().hashCode();
        }
        if (getLagType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLagType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLagType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLagUnits() != null) {
            _hashCode += getLagUnits().hashCode();
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturingCostTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturingCostTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturingCostTemplate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturingWorkCenter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturingWorkCenter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturingWorkCenter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOperationName() != null) {
            _hashCode += getOperationName().hashCode();
        }
        if (getOperationYield() != null) {
            _hashCode += getOperationYield().hashCode();
        }
        if (getRunRate() != null) {
            _hashCode += getRunRate().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getSetupTime() != null) {
            _hashCode += getSetupTime().hashCode();
        }
        if (getCustomFieldList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomFieldList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomFieldList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManufacturingRoutingSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "ManufacturingRoutingSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoCalculateLag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "autoCalculateLag"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "isDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "lagAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "lagType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "lagUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingCostTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "manufacturingCostTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturingWorkCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "manufacturingWorkCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "operationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationYield");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "operationYield"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "runRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "setupTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchCustomField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "customField"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
