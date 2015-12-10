/**
 * GlobalSubscriptionStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2014_2.types;

public class GlobalSubscriptionStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GlobalSubscriptionStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __confirmedOptIn = "_confirmedOptIn";
    public static final java.lang.String __confirmedOptOut = "_confirmedOptOut";
    public static final java.lang.String __softOptIn = "_softOptIn";
    public static final java.lang.String __softOptOut = "_softOptOut";
    public static final GlobalSubscriptionStatus _confirmedOptIn = new GlobalSubscriptionStatus(__confirmedOptIn);
    public static final GlobalSubscriptionStatus _confirmedOptOut = new GlobalSubscriptionStatus(__confirmedOptOut);
    public static final GlobalSubscriptionStatus _softOptIn = new GlobalSubscriptionStatus(__softOptIn);
    public static final GlobalSubscriptionStatus _softOptOut = new GlobalSubscriptionStatus(__softOptOut);
    public java.lang.String getValue() { return _value_;}
    public static GlobalSubscriptionStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GlobalSubscriptionStatus enumeration = (GlobalSubscriptionStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GlobalSubscriptionStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalSubscriptionStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.common_2014_2.platform.webservices.netsuite.com", "GlobalSubscriptionStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
