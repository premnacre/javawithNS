/**
 * PricingSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2014_2;

public class PricingSearchBasic  extends com.netsuite.webservices.platform.core_2014_2.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField assignedPriceLevel;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] currency;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] customer;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId;

    private com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] item;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField maximumQuantity;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField minimumQuantity;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] priceLevel;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField rate;

    public PricingSearchBasic() {
    }

    public PricingSearchBasic(
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField assignedPriceLevel,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] currency,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] customer,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId,
           com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] item,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField maximumQuantity,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField minimumQuantity,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] priceLevel,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField rate) {
        this.assignedPriceLevel = assignedPriceLevel;
        this.currency = currency;
        this.customer = customer;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.item = item;
        this.maximumQuantity = maximumQuantity;
        this.minimumQuantity = minimumQuantity;
        this.priceLevel = priceLevel;
        this.rate = rate;
    }


    /**
     * Gets the assignedPriceLevel value for this PricingSearchBasic.
     * 
     * @return assignedPriceLevel
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getAssignedPriceLevel() {
        return assignedPriceLevel;
    }


    /**
     * Sets the assignedPriceLevel value for this PricingSearchBasic.
     * 
     * @param assignedPriceLevel
     */
    public void setAssignedPriceLevel(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField assignedPriceLevel) {
        this.assignedPriceLevel = assignedPriceLevel;
    }


    /**
     * Gets the currency value for this PricingSearchBasic.
     * 
     * @return currency
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this PricingSearchBasic.
     * 
     * @param currency
     */
    public void setCurrency(com.netsuite.webservices.platform.core_2014_2.RecordRef[] currency) {
        this.currency = currency;
    }


    /**
     * Gets the customer value for this PricingSearchBasic.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this PricingSearchBasic.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2014_2.RecordRef[] customer) {
        this.customer = customer;
    }


    /**
     * Gets the internalId value for this PricingSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PricingSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this PricingSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this PricingSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the item value for this PricingSearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this PricingSearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2014_2.RecordRef[] item) {
        this.item = item;
    }


    /**
     * Gets the maximumQuantity value for this PricingSearchBasic.
     * 
     * @return maximumQuantity
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getMaximumQuantity() {
        return maximumQuantity;
    }


    /**
     * Sets the maximumQuantity value for this PricingSearchBasic.
     * 
     * @param maximumQuantity
     */
    public void setMaximumQuantity(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }


    /**
     * Gets the minimumQuantity value for this PricingSearchBasic.
     * 
     * @return minimumQuantity
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getMinimumQuantity() {
        return minimumQuantity;
    }


    /**
     * Sets the minimumQuantity value for this PricingSearchBasic.
     * 
     * @param minimumQuantity
     */
    public void setMinimumQuantity(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }


    /**
     * Gets the priceLevel value for this PricingSearchBasic.
     * 
     * @return priceLevel
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getPriceLevel() {
        return priceLevel;
    }


    /**
     * Sets the priceLevel value for this PricingSearchBasic.
     * 
     * @param priceLevel
     */
    public void setPriceLevel(com.netsuite.webservices.platform.core_2014_2.RecordRef[] priceLevel) {
        this.priceLevel = priceLevel;
    }


    /**
     * Gets the rate value for this PricingSearchBasic.
     * 
     * @return rate
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this PricingSearchBasic.
     * 
     * @param rate
     */
    public void setRate(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField rate) {
        this.rate = rate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PricingSearchBasic)) return false;
        PricingSearchBasic other = (PricingSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assignedPriceLevel==null && other.getAssignedPriceLevel()==null) || 
             (this.assignedPriceLevel!=null &&
              this.assignedPriceLevel.equals(other.getAssignedPriceLevel()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              java.util.Arrays.equals(this.customer, other.getCustomer()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.maximumQuantity==null && other.getMaximumQuantity()==null) || 
             (this.maximumQuantity!=null &&
              this.maximumQuantity.equals(other.getMaximumQuantity()))) &&
            ((this.minimumQuantity==null && other.getMinimumQuantity()==null) || 
             (this.minimumQuantity!=null &&
              this.minimumQuantity.equals(other.getMinimumQuantity()))) &&
            ((this.priceLevel==null && other.getPriceLevel()==null) || 
             (this.priceLevel!=null &&
              java.util.Arrays.equals(this.priceLevel, other.getPriceLevel()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate())));
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
        if (getAssignedPriceLevel() != null) {
            _hashCode += getAssignedPriceLevel().hashCode();
        }
        if (getCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getMaximumQuantity() != null) {
            _hashCode += getMaximumQuantity().hashCode();
        }
        if (getMinimumQuantity() != null) {
            _hashCode += getMinimumQuantity().hashCode();
        }
        if (getPriceLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriceLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriceLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PricingSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "PricingSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedPriceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "assignedPriceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "maximumQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "minimumQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "priceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
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
