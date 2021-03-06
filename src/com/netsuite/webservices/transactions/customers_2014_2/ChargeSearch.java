/**
 * ChargeSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.transactions.customers_2014_2;

public class ChargeSearch  extends com.netsuite.webservices.platform.core_2014_2.SearchRecord  implements java.io.Serializable {
    private com.netsuite.webservices.platform.common_2014_2.ChargeSearchBasic basic;

    private com.netsuite.webservices.platform.common_2014_2.TransactionSearchBasic invoiceJoin;

    private com.netsuite.webservices.platform.common_2014_2.JobSearchBasic jobJoin;

    private com.netsuite.webservices.platform.common_2014_2.TransactionSearchBasic salesOrderJoin;

    private com.netsuite.webservices.platform.common_2014_2.TimeBillSearchBasic timeJoin;

    private com.netsuite.webservices.platform.common_2014_2.TransactionSearchBasic transactionJoin;

    private com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic userJoin;

    private com.netsuite.webservices.platform.common_2014_2.CustomSearchJoin[] customSearchJoin;

    public ChargeSearch() {
    }

    public ChargeSearch(
           com.netsuite.webservices.platform.common_2014_2.ChargeSearchBasic basic,
           com.netsuite.webservices.platform.common_2014_2.TransactionSearchBasic invoiceJoin,
           com.netsuite.webservices.platform.common_2014_2.JobSearchBasic jobJoin,
           com.netsuite.webservices.platform.common_2014_2.TransactionSearchBasic salesOrderJoin,
           com.netsuite.webservices.platform.common_2014_2.TimeBillSearchBasic timeJoin,
           com.netsuite.webservices.platform.common_2014_2.TransactionSearchBasic transactionJoin,
           com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic userJoin,
           com.netsuite.webservices.platform.common_2014_2.CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.invoiceJoin = invoiceJoin;
        this.jobJoin = jobJoin;
        this.salesOrderJoin = salesOrderJoin;
        this.timeJoin = timeJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.customSearchJoin = customSearchJoin;
    }


    /**
     * Gets the basic value for this ChargeSearch.
     * 
     * @return basic
     */
    public com.netsuite.webservices.platform.common_2014_2.ChargeSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this ChargeSearch.
     * 
     * @param basic
     */
    public void setBasic(com.netsuite.webservices.platform.common_2014_2.ChargeSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the invoiceJoin value for this ChargeSearch.
     * 
     * @return invoiceJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.TransactionSearchBasic getInvoiceJoin() {
        return invoiceJoin;
    }


    /**
     * Sets the invoiceJoin value for this ChargeSearch.
     * 
     * @param invoiceJoin
     */
    public void setInvoiceJoin(com.netsuite.webservices.platform.common_2014_2.TransactionSearchBasic invoiceJoin) {
        this.invoiceJoin = invoiceJoin;
    }


    /**
     * Gets the jobJoin value for this ChargeSearch.
     * 
     * @return jobJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.JobSearchBasic getJobJoin() {
        return jobJoin;
    }


    /**
     * Sets the jobJoin value for this ChargeSearch.
     * 
     * @param jobJoin
     */
    public void setJobJoin(com.netsuite.webservices.platform.common_2014_2.JobSearchBasic jobJoin) {
        this.jobJoin = jobJoin;
    }


    /**
     * Gets the salesOrderJoin value for this ChargeSearch.
     * 
     * @return salesOrderJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.TransactionSearchBasic getSalesOrderJoin() {
        return salesOrderJoin;
    }


    /**
     * Sets the salesOrderJoin value for this ChargeSearch.
     * 
     * @param salesOrderJoin
     */
    public void setSalesOrderJoin(com.netsuite.webservices.platform.common_2014_2.TransactionSearchBasic salesOrderJoin) {
        this.salesOrderJoin = salesOrderJoin;
    }


    /**
     * Gets the timeJoin value for this ChargeSearch.
     * 
     * @return timeJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.TimeBillSearchBasic getTimeJoin() {
        return timeJoin;
    }


    /**
     * Sets the timeJoin value for this ChargeSearch.
     * 
     * @param timeJoin
     */
    public void setTimeJoin(com.netsuite.webservices.platform.common_2014_2.TimeBillSearchBasic timeJoin) {
        this.timeJoin = timeJoin;
    }


    /**
     * Gets the transactionJoin value for this ChargeSearch.
     * 
     * @return transactionJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this ChargeSearch.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(com.netsuite.webservices.platform.common_2014_2.TransactionSearchBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the userJoin value for this ChargeSearch.
     * 
     * @return userJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this ChargeSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(com.netsuite.webservices.platform.common_2014_2.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the customSearchJoin value for this ChargeSearch.
     * 
     * @return customSearchJoin
     */
    public com.netsuite.webservices.platform.common_2014_2.CustomSearchJoin[] getCustomSearchJoin() {
        return customSearchJoin;
    }


    /**
     * Sets the customSearchJoin value for this ChargeSearch.
     * 
     * @param customSearchJoin
     */
    public void setCustomSearchJoin(com.netsuite.webservices.platform.common_2014_2.CustomSearchJoin[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public com.netsuite.webservices.platform.common_2014_2.CustomSearchJoin getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, com.netsuite.webservices.platform.common_2014_2.CustomSearchJoin _value) {
        this.customSearchJoin[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeSearch)) return false;
        ChargeSearch other = (ChargeSearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.invoiceJoin==null && other.getInvoiceJoin()==null) || 
             (this.invoiceJoin!=null &&
              this.invoiceJoin.equals(other.getInvoiceJoin()))) &&
            ((this.jobJoin==null && other.getJobJoin()==null) || 
             (this.jobJoin!=null &&
              this.jobJoin.equals(other.getJobJoin()))) &&
            ((this.salesOrderJoin==null && other.getSalesOrderJoin()==null) || 
             (this.salesOrderJoin!=null &&
              this.salesOrderJoin.equals(other.getSalesOrderJoin()))) &&
            ((this.timeJoin==null && other.getTimeJoin()==null) || 
             (this.timeJoin!=null &&
              this.timeJoin.equals(other.getTimeJoin()))) &&
            ((this.transactionJoin==null && other.getTransactionJoin()==null) || 
             (this.transactionJoin!=null &&
              this.transactionJoin.equals(other.getTransactionJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.customSearchJoin==null && other.getCustomSearchJoin()==null) || 
             (this.customSearchJoin!=null &&
              java.util.Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin())));
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
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getInvoiceJoin() != null) {
            _hashCode += getInvoiceJoin().hashCode();
        }
        if (getJobJoin() != null) {
            _hashCode += getJobJoin().hashCode();
        }
        if (getSalesOrderJoin() != null) {
            _hashCode += getSalesOrderJoin().hashCode();
        }
        if (getTimeJoin() != null) {
            _hashCode += getTimeJoin().hashCode();
        }
        if (getTransactionJoin() != null) {
            _hashCode += getTransactionJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getCustomSearchJoin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomSearchJoin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomSearchJoin(), i);
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
        new org.apache.axis.description.TypeDesc(ChargeSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "ChargeSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "ChargeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "invoiceJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "JobSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOrderJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "salesOrderJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "timeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2014_2.transactions.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "CustomSearchJoin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
