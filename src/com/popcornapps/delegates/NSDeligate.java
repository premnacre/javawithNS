package com.popcornapps.delegates;

import java.rmi.RemoteException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.netsuite.webservices.lists.relationships_2014_2.Customer;
import com.netsuite.webservices.lists.relationships_2014_2.CustomerSearch;
import com.netsuite.webservices.lists.relationships_2014_2.JobSearchAdvanced;
import com.netsuite.webservices.platform.common_2014_2.CustomRecordSearchBasic;
import com.netsuite.webservices.platform.common_2014_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.core_2014_2.GetSavedSearchRecord;
import com.netsuite.webservices.platform.core_2014_2.GetSavedSearchResult;
import com.netsuite.webservices.platform.core_2014_2.RecordRef;
import com.netsuite.webservices.platform.core_2014_2.SearchResult;
import com.netsuite.webservices.platform.core_2014_2.SearchStringField;
import com.netsuite.webservices.platform.core_2014_2.types.SearchRecordType;
import com.netsuite.webservices.platform.core_2014_2.types.SearchStringFieldOperator;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRecordCountFault;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRequestLimitFault;
import com.netsuite.webservices.platform.faults_2014_2.ExceededRequestSizeFault;
import com.netsuite.webservices.platform.faults_2014_2.ExceededUsageLimitFault;
import com.netsuite.webservices.platform.faults_2014_2.InvalidCredentialsFault;
import com.netsuite.webservices.platform.faults_2014_2.InvalidSessionFault;
import com.netsuite.webservices.platform.faults_2014_2.UnexpectedErrorFault;
import com.netsuite.webservices.platform.messages_2014_2.ReadResponse;
import com.netsuite.webservices.platform.messages_2014_2.SessionResponse;
import com.netsuite.webservices.platform.messages_2014_2.WriteResponse;
import com.netsuite.webservices.platform_2014_2.NetSuitePortType;
import com.netsuite.webservices.setup.customization_2014_2.CustomRecordSearch;

public class NSDeligate {
	NetSuitePortType port;
	GsonBuilder builder = new GsonBuilder();
	Gson gson = builder.create();
	public NSDeligate(NetSuitePortType port) {
		this.port=port;
	}
	
	public SearchResult SearchData(String searchData)
	throws ExceededRequestSizeFault, InvalidCredentialsFault,
	ExceededUsageLimitFault, ExceededRequestLimitFault,
	ExceededRecordCountFault, UnexpectedErrorFault,
	InvalidSessionFault, RemoteException {
		CustomerSearch custSearch = new CustomerSearch();
		CustomerSearchBasic custSearchBasic = new CustomerSearchBasic();
		SearchStringField entityId = new SearchStringField();
		entityId.setOperator(SearchStringFieldOperator.contains);
		entityId.setSearchValue(searchData);
		custSearchBasic.setEntityId(entityId);
		custSearch.setBasic(custSearchBasic);
		SearchResult result = port.search(custSearch);
		return result;
	}
	public SearchResult CustomSearchData(String searchData, String id) throws ExceededRequestSizeFault, InvalidCredentialsFault, ExceededUsageLimitFault, ExceededRequestLimitFault, ExceededRecordCountFault, UnexpectedErrorFault, InvalidSessionFault, RemoteException {

		CustomRecordSearch customRecordSearch = new CustomRecordSearch();
		CustomRecordSearchBasic customRecordSearchBasic = new CustomRecordSearchBasic();
		RecordRef recordRef = new RecordRef();
		recordRef.setInternalId(id);
		customRecordSearchBasic.setRecType(recordRef);
		SearchStringField customRecordName = new SearchStringField();
		customRecordName.setOperator(SearchStringFieldOperator.is);
		customRecordName.setSearchValue(searchData);
		customRecordSearchBasic.setName(customRecordName);
		customRecordSearch.setBasic(customRecordSearchBasic);
		SearchResult result = port.search(customRecordSearch);
		return result;
	}		
	public SearchResult JobSearchData() throws ExceededRequestSizeFault, InvalidCredentialsFault, ExceededUsageLimitFault, ExceededRequestLimitFault, ExceededRecordCountFault, UnexpectedErrorFault, InvalidSessionFault, RemoteException {
		GetSavedSearchRecord record = new GetSavedSearchRecord();
		SearchRecordType srt = SearchRecordType.job;
		record.setSearchType(srt);
		GetSavedSearchResult result = port.getSavedSearch(record);
		RecordRef[] rec = result.getRecordRefList();
		JobSearchAdvanced advanced = new JobSearchAdvanced();
		advanced.setSavedSearchId(rec[0].getInternalId());
		SearchResult response = port.search(advanced);
		System.out.println("JobSearchAdvanced: " + gson.toJson(response));
		return response;
	}	
	public ReadResponse getData(RecordRef recordRef)
	throws ExceededRequestSizeFault, InvalidCredentialsFault,
	ExceededUsageLimitFault, ExceededRequestLimitFault,
	ExceededRecordCountFault, UnexpectedErrorFault,
	InvalidSessionFault, RemoteException {
		ReadResponse response = port.get(recordRef);
		return response;
	}
	
	public WriteResponse deleteCustomRecord(RecordRef recordRef)
		throws ExceededRequestSizeFault, InvalidCredentialsFault,
		ExceededUsageLimitFault, ExceededRequestLimitFault,
		ExceededRecordCountFault, UnexpectedErrorFault,
		InvalidSessionFault, RemoteException {
		/*
		 * CustomRecordRef customRecordRef = new CustomRecordRef();
		 * customRecordRef.setTypeId("-2"); customRecordRef.setInternalId(id);
		 */
		WriteResponse status = port.delete(recordRef);
		return status;
	}

	public WriteResponse addRecord(Customer customer)
			throws ExceededRequestSizeFault, InvalidCredentialsFault,
			ExceededUsageLimitFault, ExceededRequestLimitFault,
			ExceededRecordCountFault, UnexpectedErrorFault,
			InvalidSessionFault, RemoteException {
		System.out.println("adding...");
		WriteResponse response = port.add(customer);
		return response;
	}

	public WriteResponse updateRecord(Customer customer)
			throws ExceededRequestSizeFault, InvalidCredentialsFault,
			ExceededUsageLimitFault, ExceededRequestLimitFault,
			ExceededRecordCountFault, UnexpectedErrorFault,
			InvalidSessionFault, RemoteException {
		System.out.println("updating...");
		WriteResponse response = port.update(customer);
		return response;
	}
	
	public SessionResponse LogoutAction() throws ExceededRequestLimitFault,
	UnexpectedErrorFault, InvalidSessionFault, RemoteException {
		SessionResponse sResponse = port.logout();
		return sResponse;
	}
	
	
}
