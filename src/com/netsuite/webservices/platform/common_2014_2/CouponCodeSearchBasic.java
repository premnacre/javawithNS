/**
 * CouponCodeSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2014_2;

public class CouponCodeSearchBasic  extends com.netsuite.webservices.platform.core_2014_2.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.SearchStringField code;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField dateSent;

    private com.netsuite.webservices.platform.core_2014_2.SearchLongField id;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId;

    private com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] promotion;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] recipient;

    private com.netsuite.webservices.platform.core_2014_2.SearchLongField useCount;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField used;

    public CouponCodeSearchBasic() {
    }

    public CouponCodeSearchBasic(
           com.netsuite.webservices.platform.core_2014_2.SearchStringField code,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField dateSent,
           com.netsuite.webservices.platform.core_2014_2.SearchLongField id,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId,
           com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] promotion,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] recipient,
           com.netsuite.webservices.platform.core_2014_2.SearchLongField useCount,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField used) {
        this.code = code;
        this.dateSent = dateSent;
        this.id = id;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.promotion = promotion;
        this.recipient = recipient;
        this.useCount = useCount;
        this.used = used;
    }


    /**
     * Gets the code value for this CouponCodeSearchBasic.
     * 
     * @return code
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getCode() {
        return code;
    }


    /**
     * Sets the code value for this CouponCodeSearchBasic.
     * 
     * @param code
     */
    public void setCode(com.netsuite.webservices.platform.core_2014_2.SearchStringField code) {
        this.code = code;
    }


    /**
     * Gets the dateSent value for this CouponCodeSearchBasic.
     * 
     * @return dateSent
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getDateSent() {
        return dateSent;
    }


    /**
     * Sets the dateSent value for this CouponCodeSearchBasic.
     * 
     * @param dateSent
     */
    public void setDateSent(com.netsuite.webservices.platform.core_2014_2.SearchDateField dateSent) {
        this.dateSent = dateSent;
    }


    /**
     * Gets the id value for this CouponCodeSearchBasic.
     * 
     * @return id
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchLongField getId() {
        return id;
    }


    /**
     * Sets the id value for this CouponCodeSearchBasic.
     * 
     * @param id
     */
    public void setId(com.netsuite.webservices.platform.core_2014_2.SearchLongField id) {
        this.id = id;
    }


    /**
     * Gets the internalId value for this CouponCodeSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CouponCodeSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this CouponCodeSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this CouponCodeSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the promotion value for this CouponCodeSearchBasic.
     * 
     * @return promotion
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getPromotion() {
        return promotion;
    }


    /**
     * Sets the promotion value for this CouponCodeSearchBasic.
     * 
     * @param promotion
     */
    public void setPromotion(com.netsuite.webservices.platform.core_2014_2.RecordRef[] promotion) {
        this.promotion = promotion;
    }


    /**
     * Gets the recipient value for this CouponCodeSearchBasic.
     * 
     * @return recipient
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this CouponCodeSearchBasic.
     * 
     * @param recipient
     */
    public void setRecipient(com.netsuite.webservices.platform.core_2014_2.RecordRef[] recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the useCount value for this CouponCodeSearchBasic.
     * 
     * @return useCount
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchLongField getUseCount() {
        return useCount;
    }


    /**
     * Sets the useCount value for this CouponCodeSearchBasic.
     * 
     * @param useCount
     */
    public void setUseCount(com.netsuite.webservices.platform.core_2014_2.SearchLongField useCount) {
        this.useCount = useCount;
    }


    /**
     * Gets the used value for this CouponCodeSearchBasic.
     * 
     * @return used
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getUsed() {
        return used;
    }


    /**
     * Sets the used value for this CouponCodeSearchBasic.
     * 
     * @param used
     */
    public void setUsed(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField used) {
        this.used = used;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CouponCodeSearchBasic)) return false;
        CouponCodeSearchBasic other = (CouponCodeSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.dateSent==null && other.getDateSent()==null) || 
             (this.dateSent!=null &&
              this.dateSent.equals(other.getDateSent()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.promotion==null && other.getPromotion()==null) || 
             (this.promotion!=null &&
              java.util.Arrays.equals(this.promotion, other.getPromotion()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              java.util.Arrays.equals(this.recipient, other.getRecipient()))) &&
            ((this.useCount==null && other.getUseCount()==null) || 
             (this.useCount!=null &&
              this.useCount.equals(other.getUseCount()))) &&
            ((this.used==null && other.getUsed()==null) || 
             (this.used!=null &&
              this.used.equals(other.getUsed())));
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getDateSent() != null) {
            _hashCode += getDateSent().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
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
        if (getPromotion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromotion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromotion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecipient() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipient());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipient(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseCount() != null) {
            _hashCode += getUseCount().hashCode();
        }
        if (getUsed() != null) {
            _hashCode += getUsed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CouponCodeSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "CouponCodeSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateSent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "dateSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("promotion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "promotion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "useCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("used");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "used"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
