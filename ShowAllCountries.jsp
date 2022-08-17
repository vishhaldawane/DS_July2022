<%@page import="java.util.ArrayList, com.ds.Country"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> ShowAllCountries.jsp is invoked </h1>
	
		<% ArrayList<Country> cntList = ( ArrayList<Country>)request.getAttribute("theCntLst"); %>
		
		<form action='countryJDBC'>
			<TABLE border=5 cellspacing=5 cellpadding=5>
			
			<TH>Country</TH>
			<TH>Capital</TH>
			<TH>Prime Minister</TH>
			<TH>Population</TH>
			<TH>Currency</TH>
			
			<TR>
			<TD><input type=text name='countryName'></TD>
			<TD><input type=text name='capitalName'></TD>
			<TD><input type=text name='pmName'></TD>
			<TD><input type=text name='population'></TD>
			<TD><input type=text name='currency'></TD>
			<TD><input type=submit name=submit style='font-size:16px; text-align:center; padding: 15px 32px; color:white; background-color:blue' value='Add'></TD>
			</TR>
			
			

			<% for(Country theCountry : cntList) { %>
				<TR>
				<TD style='font-size:20px; text-align:center; padding: 5px 10px; color:black; background-color:pink'><%=theCountry.getName()%></TD>
				<TD style='font-size:20px; text-align:center; padding: 5px 10px; color:black; background-color:pink'><%=theCountry.getCapital()%></TD>
				<TD> <input style='font-size:20px; text-align:center; padding: 5px 10px; color:black; background-color:pink' type=text name='pmName' value="<%=theCountry.getPrimeMinister()%>"></TD>
				<TD style='font-size:20px; text-align:center; padding: 5px 10px; color:black; background-color:pink'><%=theCountry.getPopulation()%></TD>
				<TD style='font-size:20px; text-align:center; padding: 5px 10px; color:black; background-color:pink'><%=theCountry.getCurrency()%></TD>
				
				<TD><input type=submit name=submit style='font-size:16px; text-align:center; padding: 15px 32px; color:white; background-color:green' value='Edit'>   </TD>
				<TD><input type=submit name=submit style='font-size:16px; text-align:center; padding: 15px 32px; color:white; background-color:red' value='Delete'> </TD>

				</TR>

			<% }%>
			</TABLE>
			</form>

</body>
</html>