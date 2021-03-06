/**
 * TimeBillSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.netsuite.webservices.platform.common_2014_2;

public class TimeBillSearchBasic  extends com.netsuite.webservices.platform.core_2014_2.SearchRecordBasic  implements java.io.Serializable {
    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField approved;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField billable;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] _class;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] customer;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField date;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField dateCreated;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] department;

    private com.netsuite.webservices.platform.core_2014_2.SearchDoubleField duration;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] employee;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField exempt;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] externalId;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField externalIdString;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId;

    private com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] item;

    private com.netsuite.webservices.platform.core_2014_2.SearchDateField lastModified;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] location;

    private com.netsuite.webservices.platform.core_2014_2.SearchStringField memo;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField paidByPayroll;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField paidExternally;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] payItem;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField productive;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField status;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] subsidiary;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] temporaryLocalJurisdiction;

    private com.netsuite.webservices.platform.core_2014_2.RecordRef[] temporaryStateJurisdiction;

    private java.lang.String[] type;

    private com.netsuite.webservices.platform.core_2014_2.SearchBooleanField utilized;

    private com.netsuite.webservices.platform.core_2014_2.SearchCustomField[] customFieldList;

    public TimeBillSearchBasic() {
    }

    public TimeBillSearchBasic(
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField approved,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField billable,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] _class,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] customer,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField date,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField dateCreated,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] department,
           com.netsuite.webservices.platform.core_2014_2.SearchDoubleField duration,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] employee,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField exempt,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] externalId,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField externalIdString,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId,
           com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] item,
           com.netsuite.webservices.platform.core_2014_2.SearchDateField lastModified,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] location,
           com.netsuite.webservices.platform.core_2014_2.SearchStringField memo,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField paidByPayroll,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField paidExternally,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] payItem,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField productive,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField status,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] subsidiary,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] temporaryLocalJurisdiction,
           com.netsuite.webservices.platform.core_2014_2.RecordRef[] temporaryStateJurisdiction,
           java.lang.String[] type,
           com.netsuite.webservices.platform.core_2014_2.SearchBooleanField utilized,
           com.netsuite.webservices.platform.core_2014_2.SearchCustomField[] customFieldList) {
        this.approved = approved;
        this.billable = billable;
        this._class = _class;
        this.customer = customer;
        this.date = date;
        this.dateCreated = dateCreated;
        this.department = department;
        this.duration = duration;
        this.employee = employee;
        this.exempt = exempt;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.item = item;
        this.lastModified = lastModified;
        this.location = location;
        this.memo = memo;
        this.paidByPayroll = paidByPayroll;
        this.paidExternally = paidExternally;
        this.payItem = payItem;
        this.productive = productive;
        this.status = status;
        this.subsidiary = subsidiary;
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
        this.type = type;
        this.utilized = utilized;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the approved value for this TimeBillSearchBasic.
     * 
     * @return approved
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getApproved() {
        return approved;
    }


    /**
     * Sets the approved value for this TimeBillSearchBasic.
     * 
     * @param approved
     */
    public void setApproved(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField approved) {
        this.approved = approved;
    }


    /**
     * Gets the billable value for this TimeBillSearchBasic.
     * 
     * @return billable
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getBillable() {
        return billable;
    }


    /**
     * Sets the billable value for this TimeBillSearchBasic.
     * 
     * @param billable
     */
    public void setBillable(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField billable) {
        this.billable = billable;
    }


    /**
     * Gets the _class value for this TimeBillSearchBasic.
     * 
     * @return _class
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TimeBillSearchBasic.
     * 
     * @param _class
     */
    public void set_class(com.netsuite.webservices.platform.core_2014_2.RecordRef[] _class) {
        this._class = _class;
    }


    /**
     * Gets the customer value for this TimeBillSearchBasic.
     * 
     * @return customer
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this TimeBillSearchBasic.
     * 
     * @param customer
     */
    public void setCustomer(com.netsuite.webservices.platform.core_2014_2.RecordRef[] customer) {
        this.customer = customer;
    }


    /**
     * Gets the date value for this TimeBillSearchBasic.
     * 
     * @return date
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getDate() {
        return date;
    }


    /**
     * Sets the date value for this TimeBillSearchBasic.
     * 
     * @param date
     */
    public void setDate(com.netsuite.webservices.platform.core_2014_2.SearchDateField date) {
        this.date = date;
    }


    /**
     * Gets the dateCreated value for this TimeBillSearchBasic.
     * 
     * @return dateCreated
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this TimeBillSearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(com.netsuite.webservices.platform.core_2014_2.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the department value for this TimeBillSearchBasic.
     * 
     * @return department
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TimeBillSearchBasic.
     * 
     * @param department
     */
    public void setDepartment(com.netsuite.webservices.platform.core_2014_2.RecordRef[] department) {
        this.department = department;
    }


    /**
     * Gets the duration value for this TimeBillSearchBasic.
     * 
     * @return duration
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDoubleField getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this TimeBillSearchBasic.
     * 
     * @param duration
     */
    public void setDuration(com.netsuite.webservices.platform.core_2014_2.SearchDoubleField duration) {
        this.duration = duration;
    }


    /**
     * Gets the employee value for this TimeBillSearchBasic.
     * 
     * @return employee
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this TimeBillSearchBasic.
     * 
     * @param employee
     */
    public void setEmployee(com.netsuite.webservices.platform.core_2014_2.RecordRef[] employee) {
        this.employee = employee;
    }


    /**
     * Gets the exempt value for this TimeBillSearchBasic.
     * 
     * @return exempt
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getExempt() {
        return exempt;
    }


    /**
     * Sets the exempt value for this TimeBillSearchBasic.
     * 
     * @param exempt
     */
    public void setExempt(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField exempt) {
        this.exempt = exempt;
    }


    /**
     * Gets the externalId value for this TimeBillSearchBasic.
     * 
     * @return externalId
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TimeBillSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(com.netsuite.webservices.platform.core_2014_2.RecordRef[] externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this TimeBillSearchBasic.
     * 
     * @return externalIdString
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this TimeBillSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(com.netsuite.webservices.platform.core_2014_2.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this TimeBillSearchBasic.
     * 
     * @return internalId
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TimeBillSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(com.netsuite.webservices.platform.core_2014_2.RecordRef[] internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this TimeBillSearchBasic.
     * 
     * @return internalIdNumber
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this TimeBillSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(com.netsuite.webservices.platform.core_2014_2.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the item value for this TimeBillSearchBasic.
     * 
     * @return item
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this TimeBillSearchBasic.
     * 
     * @param item
     */
    public void setItem(com.netsuite.webservices.platform.core_2014_2.RecordRef[] item) {
        this.item = item;
    }


    /**
     * Gets the lastModified value for this TimeBillSearchBasic.
     * 
     * @return lastModified
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchDateField getLastModified() {
        return lastModified;
    }


    /**
     * Sets the lastModified value for this TimeBillSearchBasic.
     * 
     * @param lastModified
     */
    public void setLastModified(com.netsuite.webservices.platform.core_2014_2.SearchDateField lastModified) {
        this.lastModified = lastModified;
    }


    /**
     * Gets the location value for this TimeBillSearchBasic.
     * 
     * @return location
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TimeBillSearchBasic.
     * 
     * @param location
     */
    public void setLocation(com.netsuite.webservices.platform.core_2014_2.RecordRef[] location) {
        this.location = location;
    }


    /**
     * Gets the memo value for this TimeBillSearchBasic.
     * 
     * @return memo
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchStringField getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this TimeBillSearchBasic.
     * 
     * @param memo
     */
    public void setMemo(com.netsuite.webservices.platform.core_2014_2.SearchStringField memo) {
        this.memo = memo;
    }


    /**
     * Gets the paidByPayroll value for this TimeBillSearchBasic.
     * 
     * @return paidByPayroll
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getPaidByPayroll() {
        return paidByPayroll;
    }


    /**
     * Sets the paidByPayroll value for this TimeBillSearchBasic.
     * 
     * @param paidByPayroll
     */
    public void setPaidByPayroll(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField paidByPayroll) {
        this.paidByPayroll = paidByPayroll;
    }


    /**
     * Gets the paidExternally value for this TimeBillSearchBasic.
     * 
     * @return paidExternally
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getPaidExternally() {
        return paidExternally;
    }


    /**
     * Sets the paidExternally value for this TimeBillSearchBasic.
     * 
     * @param paidExternally
     */
    public void setPaidExternally(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField paidExternally) {
        this.paidExternally = paidExternally;
    }


    /**
     * Gets the payItem value for this TimeBillSearchBasic.
     * 
     * @return payItem
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getPayItem() {
        return payItem;
    }


    /**
     * Sets the payItem value for this TimeBillSearchBasic.
     * 
     * @param payItem
     */
    public void setPayItem(com.netsuite.webservices.platform.core_2014_2.RecordRef[] payItem) {
        this.payItem = payItem;
    }


    /**
     * Gets the productive value for this TimeBillSearchBasic.
     * 
     * @return productive
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getProductive() {
        return productive;
    }


    /**
     * Sets the productive value for this TimeBillSearchBasic.
     * 
     * @param productive
     */
    public void setProductive(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField productive) {
        this.productive = productive;
    }


    /**
     * Gets the status value for this TimeBillSearchBasic.
     * 
     * @return status
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TimeBillSearchBasic.
     * 
     * @param status
     */
    public void setStatus(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField status) {
        this.status = status;
    }


    /**
     * Gets the subsidiary value for this TimeBillSearchBasic.
     * 
     * @return subsidiary
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this TimeBillSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(com.netsuite.webservices.platform.core_2014_2.RecordRef[] subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the temporaryLocalJurisdiction value for this TimeBillSearchBasic.
     * 
     * @return temporaryLocalJurisdiction
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getTemporaryLocalJurisdiction() {
        return temporaryLocalJurisdiction;
    }


    /**
     * Sets the temporaryLocalJurisdiction value for this TimeBillSearchBasic.
     * 
     * @param temporaryLocalJurisdiction
     */
    public void setTemporaryLocalJurisdiction(com.netsuite.webservices.platform.core_2014_2.RecordRef[] temporaryLocalJurisdiction) {
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
    }


    /**
     * Gets the temporaryStateJurisdiction value for this TimeBillSearchBasic.
     * 
     * @return temporaryStateJurisdiction
     */
    public com.netsuite.webservices.platform.core_2014_2.RecordRef[] getTemporaryStateJurisdiction() {
        return temporaryStateJurisdiction;
    }


    /**
     * Sets the temporaryStateJurisdiction value for this TimeBillSearchBasic.
     * 
     * @param temporaryStateJurisdiction
     */
    public void setTemporaryStateJurisdiction(com.netsuite.webservices.platform.core_2014_2.RecordRef[] temporaryStateJurisdiction) {
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
    }


    /**
     * Gets the type value for this TimeBillSearchBasic.
     * 
     * @return type
     */
    public java.lang.String[] getType() {
        return type;
    }


    /**
     * Sets the type value for this TimeBillSearchBasic.
     * 
     * @param type
     */
    public void setType(java.lang.String[] type) {
        this.type = type;
    }


    /**
     * Gets the utilized value for this TimeBillSearchBasic.
     * 
     * @return utilized
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchBooleanField getUtilized() {
        return utilized;
    }


    /**
     * Sets the utilized value for this TimeBillSearchBasic.
     * 
     * @param utilized
     */
    public void setUtilized(com.netsuite.webservices.platform.core_2014_2.SearchBooleanField utilized) {
        this.utilized = utilized;
    }


    /**
     * Gets the customFieldList value for this TimeBillSearchBasic.
     * 
     * @return customFieldList
     */
    public com.netsuite.webservices.platform.core_2014_2.SearchCustomField[] getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this TimeBillSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(com.netsuite.webservices.platform.core_2014_2.SearchCustomField[] customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeBillSearchBasic)) return false;
        TimeBillSearchBasic other = (TimeBillSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.approved==null && other.getApproved()==null) || 
             (this.approved!=null &&
              this.approved.equals(other.getApproved()))) &&
            ((this.billable==null && other.getBillable()==null) || 
             (this.billable!=null &&
              this.billable.equals(other.getBillable()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              java.util.Arrays.equals(this.customer, other.getCustomer()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              java.util.Arrays.equals(this.employee, other.getEmployee()))) &&
            ((this.exempt==null && other.getExempt()==null) || 
             (this.exempt!=null &&
              this.exempt.equals(other.getExempt()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.lastModified==null && other.getLastModified()==null) || 
             (this.lastModified!=null &&
              this.lastModified.equals(other.getLastModified()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.paidByPayroll==null && other.getPaidByPayroll()==null) || 
             (this.paidByPayroll!=null &&
              this.paidByPayroll.equals(other.getPaidByPayroll()))) &&
            ((this.paidExternally==null && other.getPaidExternally()==null) || 
             (this.paidExternally!=null &&
              this.paidExternally.equals(other.getPaidExternally()))) &&
            ((this.payItem==null && other.getPayItem()==null) || 
             (this.payItem!=null &&
              java.util.Arrays.equals(this.payItem, other.getPayItem()))) &&
            ((this.productive==null && other.getProductive()==null) || 
             (this.productive!=null &&
              this.productive.equals(other.getProductive()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.temporaryLocalJurisdiction==null && other.getTemporaryLocalJurisdiction()==null) || 
             (this.temporaryLocalJurisdiction!=null &&
              java.util.Arrays.equals(this.temporaryLocalJurisdiction, other.getTemporaryLocalJurisdiction()))) &&
            ((this.temporaryStateJurisdiction==null && other.getTemporaryStateJurisdiction()==null) || 
             (this.temporaryStateJurisdiction!=null &&
              java.util.Arrays.equals(this.temporaryStateJurisdiction, other.getTemporaryStateJurisdiction()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
            ((this.utilized==null && other.getUtilized()==null) || 
             (this.utilized!=null &&
              this.utilized.equals(other.getUtilized()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              java.util.Arrays.equals(this.customFieldList, other.getCustomFieldList())));
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
        if (getApproved() != null) {
            _hashCode += getApproved().hashCode();
        }
        if (getBillable() != null) {
            _hashCode += getBillable().hashCode();
        }
        if (get_class() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_class());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_class(), i);
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDepartment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getEmployee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployee(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExempt() != null) {
            _hashCode += getExempt().hashCode();
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
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
        if (getLastModified() != null) {
            _hashCode += getLastModified().hashCode();
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getPaidByPayroll() != null) {
            _hashCode += getPaidByPayroll().hashCode();
        }
        if (getPaidExternally() != null) {
            _hashCode += getPaidExternally().hashCode();
        }
        if (getPayItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductive() != null) {
            _hashCode += getProductive().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemporaryLocalJurisdiction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTemporaryLocalJurisdiction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTemporaryLocalJurisdiction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemporaryStateJurisdiction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTemporaryStateJurisdiction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTemporaryStateJurisdiction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUtilized() != null) {
            _hashCode += getUtilized().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeBillSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "billable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "class"));
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
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exempt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "exempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "lastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidByPayroll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "paidByPayroll"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidExternally");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "paidExternally"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "productive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryLocalJurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "temporaryLocalJurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryStateJurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "temporaryStateJurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "searchValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "utilized"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2014_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2014_2.platform.webservices.netsuite.com", "SearchCustomField"));
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
