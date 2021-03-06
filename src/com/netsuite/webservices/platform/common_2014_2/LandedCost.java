/**
 * LandedCost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2014_2;

public class LandedCost  extends com.netsuite.webservices.platform.core_2014_2.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2014_2.LandedCostData[] landedCostDataList;

    public LandedCost() {
    }

    public LandedCost(
           java.lang.String[] nullFieldList,
           com.netsuite.webservices.platform.common_2014_2.LandedCostData[] landedCostDataList) {
        super(
            nullFieldList);
        this.landedCostDataList = landedCostDataList;
    }


    /**
     * Gets the landedCostDataList value for this LandedCost.
     * 
     * @return landedCostDataList
     */
    public com.netsuite.webservices.platform.common_2014_2.LandedCostData[] getLandedCostDataList() {
        return landedCostDataList;
    }


    /**
     * Sets the landedCostDataList value for this LandedCost.
     * 
     * @param landedCostDataList
     */
    public void setLandedCostDataList(com.netsuite.webservices.platform.common_2014_2.LandedCostData[] landedCostDataList) {
        this.landedCostDataList = landedCostDataList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LandedCost)) return false;
        LandedCost other = (LandedCost) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.landedCostDataList==null && other.getLandedCostDataList()==null) || 
             (this.landedCostDataList!=null &&
              java.util.Arrays.equals(this.landedCostDataList, other.getLandedCostDataList())));
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
        if (getLandedCostDataList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLandedCostDataList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLandedCostDataList(), i);
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
        new org.apache.axis.description.TypeDesc(LandedCost.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "LandedCost"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landedCostDataList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "landedCostDataList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "LandedCostData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "landedCostData"));
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
