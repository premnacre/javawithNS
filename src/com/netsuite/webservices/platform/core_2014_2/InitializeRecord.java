/**
 * InitializeRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.core_2014_2;

public class InitializeRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.types.InitializeType type;

    private com.netsuite.webservices.platform.core_2014_2.InitializeRef reference;

    private com.netsuite.webservices.platform.core_2014_2.InitializeAuxRef auxReference;

    private com.netsuite.webservices.platform.core_2014_2.InitializeRef[] referenceList;

    public InitializeRecord() {
    }

    public InitializeRecord(
           com.netsuite.webservices.platform.core_2014_2.types.InitializeType type,
           com.netsuite.webservices.platform.core_2014_2.InitializeRef reference,
           com.netsuite.webservices.platform.core_2014_2.InitializeAuxRef auxReference,
           com.netsuite.webservices.platform.core_2014_2.InitializeRef[] referenceList) {
           this.type = type;
           this.reference = reference;
           this.auxReference = auxReference;
           this.referenceList = referenceList;
    }


    /**
     * Gets the type value for this InitializeRecord.
     * 
     * @return type
     */
    public com.netsuite.webservices.platform.core_2014_2.types.InitializeType getType() {
        return type;
    }


    /**
     * Sets the type value for this InitializeRecord.
     * 
     * @param type
     */
    public void setType(com.netsuite.webservices.platform.core_2014_2.types.InitializeType type) {
        this.type = type;
    }


    /**
     * Gets the reference value for this InitializeRecord.
     * 
     * @return reference
     */
    public com.netsuite.webservices.platform.core_2014_2.InitializeRef getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this InitializeRecord.
     * 
     * @param reference
     */
    public void setReference(com.netsuite.webservices.platform.core_2014_2.InitializeRef reference) {
        this.reference = reference;
    }


    /**
     * Gets the auxReference value for this InitializeRecord.
     * 
     * @return auxReference
     */
    public com.netsuite.webservices.platform.core_2014_2.InitializeAuxRef getAuxReference() {
        return auxReference;
    }


    /**
     * Sets the auxReference value for this InitializeRecord.
     * 
     * @param auxReference
     */
    public void setAuxReference(com.netsuite.webservices.platform.core_2014_2.InitializeAuxRef auxReference) {
        this.auxReference = auxReference;
    }


    /**
     * Gets the referenceList value for this InitializeRecord.
     * 
     * @return referenceList
     */
    public com.netsuite.webservices.platform.core_2014_2.InitializeRef[] getReferenceList() {
        return referenceList;
    }


    /**
     * Sets the referenceList value for this InitializeRecord.
     * 
     * @param referenceList
     */
    public void setReferenceList(com.netsuite.webservices.platform.core_2014_2.InitializeRef[] referenceList) {
        this.referenceList = referenceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitializeRecord)) return false;
        InitializeRecord other = (InitializeRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.auxReference==null && other.getAuxReference()==null) || 
             (this.auxReference!=null &&
              this.auxReference.equals(other.getAuxReference()))) &&
            ((this.referenceList==null && other.getReferenceList()==null) || 
             (this.referenceList!=null &&
              java.util.Arrays.equals(this.referenceList, other.getReferenceList())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getAuxReference() != null) {
            _hashCode += getAuxReference().hashCode();
        }
        if (getReferenceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReferenceList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReferenceList(), i);
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
        new org.apache.axis.description.TypeDesc(InitializeRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "InitializeRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.core_2014_2.platform.webservices.netsuite.com", "InitializeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "InitializeRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auxReference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "auxReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "InitializeAuxRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "referenceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "InitializeRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "initializeRef"));
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
