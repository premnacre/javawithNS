/**
 * SearchDateField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2014_2;

public class SearchDateField  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.types.SearchDate predefinedSearchValue;

    private java.util.Calendar searchValue;

    private java.util.Calendar searchValue2;

    private com.netsuite.webservices.platform.core_2014_2.types.SearchDateFieldOperator operator;  // attribute

    public SearchDateField() {
    }

    public SearchDateField(
           com.netsuite.webservices.platform.core_2014_2.types.SearchDate predefinedSearchValue,
           java.util.Calendar searchValue,
           java.util.Calendar searchValue2,
           com.netsuite.webservices.platform.core_2014_2.types.SearchDateFieldOperator operator) {
           this.predefinedSearchValue = predefinedSearchValue;
           this.searchValue = searchValue;
           this.searchValue2 = searchValue2;
           this.operator = operator;
    }


    /**
     * Gets the predefinedSearchValue value for this SearchDateField.
     * 
     * @return predefinedSearchValue
     */
    public com.netsuite.webservices.platform.core_2014_2.types.SearchDate getPredefinedSearchValue() {
        return predefinedSearchValue;
    }


    /**
     * Sets the predefinedSearchValue value for this SearchDateField.
     * 
     * @param predefinedSearchValue
     */
    public void setPredefinedSearchValue(com.netsuite.webservices.platform.core_2014_2.types.SearchDate predefinedSearchValue) {
        this.predefinedSearchValue = predefinedSearchValue;
    }


    /**
     * Gets the searchValue value for this SearchDateField.
     * 
     * @return searchValue
     */
    public java.util.Calendar getSearchValue() {
        return searchValue;
    }


    /**
     * Sets the searchValue value for this SearchDateField.
     * 
     * @param searchValue
     */
    public void setSearchValue(java.util.Calendar searchValue) {
        this.searchValue = searchValue;
    }


    /**
     * Gets the searchValue2 value for this SearchDateField.
     * 
     * @return searchValue2
     */
    public java.util.Calendar getSearchValue2() {
        return searchValue2;
    }


    /**
     * Sets the searchValue2 value for this SearchDateField.
     * 
     * @param searchValue2
     */
    public void setSearchValue2(java.util.Calendar searchValue2) {
        this.searchValue2 = searchValue2;
    }


    /**
     * Gets the operator value for this SearchDateField.
     * 
     * @return operator
     */
    public com.netsuite.webservices.platform.core_2014_2.types.SearchDateFieldOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this SearchDateField.
     * 
     * @param operator
     */
    public void setOperator(com.netsuite.webservices.platform.core_2014_2.types.SearchDateFieldOperator operator) {
        this.operator = operator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchDateField)) return false;
        SearchDateField other = (SearchDateField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.predefinedSearchValue==null && other.getPredefinedSearchValue()==null) || 
             (this.predefinedSearchValue!=null &&
              this.predefinedSearchValue.equals(other.getPredefinedSearchValue()))) &&
            ((this.searchValue==null && other.getSearchValue()==null) || 
             (this.searchValue!=null &&
              this.searchValue.equals(other.getSearchValue()))) &&
            ((this.searchValue2==null && other.getSearchValue2()==null) || 
             (this.searchValue2!=null &&
              this.searchValue2.equals(other.getSearchValue2()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator())));
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
        if (getPredefinedSearchValue() != null) {
            _hashCode += getPredefinedSearchValue().hashCode();
        }
        if (getSearchValue() != null) {
            _hashCode += getSearchValue().hashCode();
        }
        if (getSearchValue2() != null) {
            _hashCode += getSearchValue2().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchDateField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("operator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        attrField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2014_2.platform.webservices.netsuite.com", "SearchDateFieldOperator"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predefinedSearchValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "predefinedSearchValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2014_2.platform.webservices.netsuite.com", "SearchDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchValue2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
