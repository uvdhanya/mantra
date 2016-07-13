<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.List"%>

<%@ page import="com.litmus7.model.Member"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

</head>

<body>

<%

List<Member> members = (List<Member>) request.getAttribute( "members" );

%>

<%

for (Member member : members) {

pageContext.setAttribute("firstname", member.getFirstName() );

%>

<div>${firstname}</div>

<%

}

%>

</body>

</html>