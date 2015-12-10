/**
 * GetCurrencyRateResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2014_2;

public class GetCurrencyRateResult  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.StatusDetail[] status;

    private com.netsuite.webservices.platform.core_2014_2.CurrencyRate[] currencyRateList;

    public GetCurrencyRateResult() {
    }

    public GetCurrencyRateResult(
           com.netsuite.webservices.platform.core_2014_2.StatusDetail[] status,
           com.netsuite.webservices.platform.core_2014_2.CurrencyRate[] currencyRateList) {
           this.status = status;
           this.currencyRateList = currencyRateList;
    }


    /**
     * Gets the status value for this GetCurrencyRateResult.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2014_2.StatusDetail[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetCurrencyRateResult.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2014_2.StatusDetail[] status) {
        this.status = status;
    }


    /**
     * Gets the currencyRateList value for this GetCurrencyRateResult.
     * 
     * @return currencyRateList
     */
    public com.netsuite.webservices.platform.core_2014_2.CurrencyRate[] getCurrencyRateList() {
        return currencyRateList;
    }


    /**
     * Sets the currencyRateList value for this GetCurrencyRateResult.
     * 
     * @param currencyRateList
     */
    public void setCurrencyRateList(com.netsuite.webservices.platform.core_2014_2.CurrencyRate[] currencyRateList) {
        this.currencyRateList = currencyRateList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCurrencyRateResult)) return false;
        GetCurrencyRateResult other = (GetCurrencyRateResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.currencyRateList==null && other.getCurrencyRateList()==null) || 
             (this.currencyRateList!=null &&
              java.util.Arrays.equals(this.currencyRateList, other.getCurrencyRateList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrencyRateList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrencyRateList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrencyRateList(), i);
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
        new org.apache.axis.description.TypeDesc(GetCurrencyRateResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "GetCurrencyRateResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyRateList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "currencyRateList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "CurrencyRate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "currencyRate"));
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
