/**
 * Nexus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.lists.accounting_2014_2;

public class Nexus  extends com.netsuite.webservices.platform.core_2014_2.Record  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2014_2.types.Country country;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef state;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef taxAgency;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef taxAgencyPst;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef taxCode;

    private java.lang.String description;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Nexus() {
    }

    public Nexus(
           java.lang.String[] nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           com.netsuite.webservices.platform.common_2014_2.types.Country country,
           com.netsuite.webservices.platform.core_2014_2.RecordRef state,
           com.netsuite.webservices.platform.core_2014_2.RecordRef taxAgency,
           com.netsuite.webservices.platform.core_2014_2.RecordRef taxAgencyPst,
           com.netsuite.webservices.platform.core_2014_2.RecordRef taxCode,
           java.lang.String description) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.country = country;
        this.state = state;
        this.taxAgency = taxAgency;
        this.taxAgencyPst = taxAgencyPst;
        this.taxCode = taxCode;
        this.description = description;
    }


    /**
     * Gets the country value for this Nexus.
     * 
     * @return country
     */
    public com.netsuite.webservices.platform.common_2014_2.types.Country getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Nexus.
     * 
     * @param country
     */
    public void setCountry(com.netsuite.webservices.platform.common_2014_2.types.Country country) {
        this.country = country;
    }


    /**
     * Gets the state value for this Nexus.
     * 
     * @return state
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getState() {
        return state;
    }


    /**
     * Sets the state value for this Nexus.
     * 
     * @param state
     */
    public void setState(com.netsuite.webservices.platform.core_2014_2.RecordRef state) {
        this.state = state;
    }


    /**
     * Gets the taxAgency value for this Nexus.
     * 
     * @return taxAgency
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getTaxAgency() {
        return taxAgency;
    }


    /**
     * Sets the taxAgency value for this Nexus.
     * 
     * @param taxAgency
     */
    public void setTaxAgency(com.netsuite.webservices.platform.core_2014_2.RecordRef taxAgency) {
        this.taxAgency = taxAgency;
    }


    /**
     * Gets the taxAgencyPst value for this Nexus.
     * 
     * @return taxAgencyPst
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getTaxAgencyPst() {
        return taxAgencyPst;
    }


    /**
     * Sets the taxAgencyPst value for this Nexus.
     * 
     * @param taxAgencyPst
     */
    public void setTaxAgencyPst(com.netsuite.webservices.platform.core_2014_2.RecordRef taxAgencyPst) {
        this.taxAgencyPst = taxAgencyPst;
    }


    /**
     * Gets the taxCode value for this Nexus.
     * 
     * @return taxCode
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this Nexus.
     * 
     * @param taxCode
     */
    public void setTaxCode(com.netsuite.webservices.platform.core_2014_2.RecordRef taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the description value for this Nexus.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Nexus.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the internalId value for this Nexus.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Nexus.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Nexus.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Nexus.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nexus)) return false;
        Nexus other = (Nexus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.taxAgency==null && other.getTaxAgency()==null) || 
             (this.taxAgency!=null &&
              this.taxAgency.equals(other.getTaxAgency()))) &&
            ((this.taxAgencyPst==null && other.getTaxAgencyPst()==null) || 
             (this.taxAgencyPst!=null &&
              this.taxAgencyPst.equals(other.getTaxAgencyPst()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getTaxAgency() != null) {
            _hashCode += getTaxAgency().hashCode();
        }
        if (getTaxAgencyPst() != null) {
            _hashCode += getTaxAgencyPst().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
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
        new org.apache.axis.description.TypeDesc(Nexus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "Nexus"));
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
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2014_2.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAgency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "taxAgency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAgencyPst");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "taxAgencyPst"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2014_2.lists.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
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
