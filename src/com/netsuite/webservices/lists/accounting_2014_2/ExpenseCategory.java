/**
 * ExpenseCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2014_2;

public class ExpenseCategory  extends com.netsuite.webservices.platform.core_2014_2.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.RecordRef customForm;

    private java.lang.String name;

    private java.lang.String description;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef expenseAcct;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean rateRequired;

    private java.lang.Double defaultRate;

    private com.netsuite.webservices.lists.accounting_2014_2.ExpenseCategoryRates[] ratesList;

    private com.netsuite.webservices.lists.accounting_2014_2.Translation[] translationsList;

    private com.netsuite.webservices.platform.core_2014_2.CustomFieldRef[] customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public ExpenseCategory() {
    }

    public ExpenseCategory(
           java.lang.String[] nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.core_2014_2.RecordRef customForm,
           java.lang.String name,
           java.lang.String description,
           com.netsuite.webservices.platform.core_2014_2.RecordRef expenseAcct,
           java.lang.Boolean isInactive,
           java.lang.Boolean rateRequired,
           java.lang.Double defaultRate,
           com.netsuite.webservices.lists.accounting_2014_2.ExpenseCategoryRates[] ratesList,
           com.netsuite.webservices.lists.accounting_2014_2.Translation[] translationsList,
           com.netsuite.webservices.platform.core_2014_2.CustomFieldRef[] customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.name = name;
        this.description = description;
        this.expenseAcct = expenseAcct;
        this.isInactive = isInactive;
        this.rateRequired = rateRequired;
        this.defaultRate = defaultRate;
        this.ratesList = ratesList;
        this.translationsList = translationsList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this ExpenseCategory.
     * 
     * @return customForm
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this ExpenseCategory.
     * 
     * @param customForm
     */
    public void setCustomForm(com.netsuite.webservices.platform.core_2014_2.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the name value for this ExpenseCategory.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ExpenseCategory.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this ExpenseCategory.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ExpenseCategory.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the expenseAcct value for this ExpenseCategory.
     * 
     * @return expenseAcct
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getExpenseAcct() {
        return expenseAcct;
    }


    /**
     * Sets the expenseAcct value for this ExpenseCategory.
     * 
     * @param expenseAcct
     */
    public void setExpenseAcct(com.netsuite.webservices.platform.core_2014_2.RecordRef expenseAcct) {
        this.expenseAcct = expenseAcct;
    }


    /**
     * Gets the isInactive value for this ExpenseCategory.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this ExpenseCategory.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the rateRequired value for this ExpenseCategory.
     * 
     * @return rateRequired
     */
    public java.lang.Boolean getRateRequired() {
        return rateRequired;
    }


    /**
     * Sets the rateRequired value for this ExpenseCategory.
     * 
     * @param rateRequired
     */
    public void setRateRequired(java.lang.Boolean rateRequired) {
        this.rateRequired = rateRequired;
    }


    /**
     * Gets the defaultRate value for this ExpenseCategory.
     * 
     * @return defaultRate
     */
    public java.lang.Double getDefaultRate() {
        return defaultRate;
    }


    /**
     * Sets the defaultRate value for this ExpenseCategory.
     * 
     * @param defaultRate
     */
    public void setDefaultRate(java.lang.Double defaultRate) {
        this.defaultRate = defaultRate;
    }


    /**
     * Gets the ratesList value for this ExpenseCategory.
     * 
     * @return ratesList
     */
    public com.netsuite.webservices.lists.accounting_2014_2.ExpenseCategoryRates[] getRatesList() {
        return ratesList;
    }


    /**
     * Sets the ratesList value for this ExpenseCategory.
     * 
     * @param ratesList
     */
    public void setRatesList(com.netsuite.webservices.lists.accounting_2014_2.ExpenseCategoryRates[] ratesList) {
        this.ratesList = ratesList;
    }


    /**
     * Gets the translationsList value for this ExpenseCategory.
     * 
     * @return translationsList
     */
    public com.netsuite.webservices.lists.accounting_2014_2.Translation[] getTranslationsList() {
        return translationsList;
    }


    /**
     * Sets the translationsList value for this ExpenseCategory.
     * 
     * @param translationsList
     */
    public void setTranslationsList(com.netsuite.webservices.lists.accounting_2014_2.Translation[] translationsList) {
        this.translationsList = translationsList;
    }


    /**
     * Gets the customFieldList value for this ExpenseCategory.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2014_2.CustomFieldRef[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ExpenseCategory.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2014_2.CustomFieldRef[] customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this ExpenseCategory.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ExpenseCategory.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this ExpenseCategory.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ExpenseCategory.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpenseCategory)) return false;
        ExpenseCategory other = (ExpenseCategory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.expenseAcct==null && other.getExpenseAcct()==null) || 
             (this.expenseAcct!=null &&
              this.expenseAcct.equals(other.getExpenseAcct()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.rateRequired==null && other.getRateRequired()==null) || 
             (this.rateRequired!=null &&
              this.rateRequired.equals(other.getRateRequired()))) &&
            ((this.defaultRate==null && other.getDefaultRate()==null) || 
             (this.defaultRate!=null &&
              this.defaultRate.equals(other.getDefaultRate()))) &&
            ((this.ratesList==null && other.getRatesList()==null) || 
             (this.ratesList!=null &&
              java.util.Arrays.equals(this.ratesList, other.getRatesList()))) &&
            ((this.translationsList==null && other.getTranslationsList()==null) || 
             (this.translationsList!=null &&
              java.util.Arrays.equals(this.translationsList, other.getTranslationsList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              java.util.Arrays.equals(this.customFieldList, other.getCustomFieldList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
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
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExpenseAcct() != null) {
            _hashCode += getExpenseAcct().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getRateRequired() != null) {
            _hashCode += getRateRequired().hashCode();
        }
        if (getDefaultRate() != null) {
            _hashCode += getDefaultRate().hashCode();
        }
        if (getRatesList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRatesList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRatesList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranslationsList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranslationsList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranslationsList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpenseCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "ExpenseCategory"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "expenseAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "rateRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "defaultRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "ratesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "ExpenseCategoryRates"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "expenseCategoryRates"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "Translation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "translation"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "CustomFieldRef"));
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
