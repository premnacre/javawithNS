package com.popcornapps.form.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.netsuite.webservices.platform.core_2014_2.SearchResult;
import com.netsuite.webservices.platform.core_2014_2.SearchRow;
import com.netsuite.webservices.platform_2014_2.NetSuitePortType;
import com.popcornapps.delegates.NSDeligate;

/**
 * Servlet implementation class SearchForm
 */
public class SearchForm extends HttpServlet {
	NetSuitePortType port;
	GsonBuilder builder = new GsonBuilder();
	Gson gson = builder.create();
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		port = (NetSuitePortType) session.getAttribute("loginSuccess");
		NSDeligate deligate=new NSDeligate(port);
		try {
			RequestDispatcher rd = request.getRequestDispatcher("/Method.jsp");
			rd.include(request, response);

			String searchData = request.getParameter("searchData");
			String operation=request.getParameter("operation");
			SearchResult result=null;
			if ("cSearch".equals(operation)) {
				String id = request.getParameter("id");
				result = deligate.CustomSearchData(searchData, id);
			} else if ("sSearch".equals(operation)) {
				result = deligate.JobSearchData();
			} else {
				result = deligate.SearchData(searchData);
			}
			out.println("Total Record: " + result.getTotalRecords());
			if (result.getStatus().length>0) {
				out.print(result.getStatus()[0].getMessage());
			}else{
				
				out.println("<br/> <table border='1'><tr><td>SNo.</td><td align='center'>Customer Information: </td></tr>");
				//Record[] record = result.getRecordList();
				SearchRow[] record = result.getSearchRowList();
				
				String js=gson.toJson(record);
				System.out.println("jsp pages:"+js);
				
				if (result.getTotalRecords() < 1) {
					out.print("<tr><td colspan='2' align='center'> <font color='green'>No Record Found... </font></td></tr>");
				} else {
					for (int i = 0; record!=null && i < record.length; i++) {
						out.print("<tr><td>" + (i + 1) + "</td><td>"
								+  record[i] + "</td></tr>");
					}
				}
				out.print("</table> <br/><br/>");
				out.print(" <div id='footer' align='center'> "
								+ "<p class='text-muted'>&#169; 2014 PopcornApps. All rights reserved</p>"
								+ "</div>");
			}
		} catch (Exception e) {
			out.print("<div align='center'>");
			e.printStackTrace();
			out.print("<br/><font color='red'>connection has timed out</font><br/></div>");
		}
		
		out.print("<br/><br/> <div id='footer' align='center'> "
						+ "<p class='text-muted'>&#169; 2014 PopcornApps. All rights reserved</p>"
						+ "</div>");
	}
/*
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
		customRecordName.setOperator(SearchStringFieldOperator.contains);
		customRecordName.setSearchValue(searchData);
		customRecordSearchBasic.setName(customRecordName);
		customRecordSearch.setBasic(customRecordSearchBasic);
		// Invoke search() web services operation
		SearchResult result = port.search(customRecordSearch);
		System.out.println(gson.toJson(result));
		return result;
	}
	
*/
}
