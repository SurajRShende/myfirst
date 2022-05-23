
<%@ page import="com.model.User" %>
<%@ page import="com.form.insertform" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<html>
<head>
    <title>updatedata</title>
</head>



<body>

<h1>  Update data into database</h1>

<form action="./finalupdate.do" >

<tr>

    <td>First Name</td>
    <td><input type="text" name="firstName" value="<%=request.getAttribute("fname")%>" /></td>


</tr>

<tr>
    <td>Last Name</td>
    <td><input type="text" name="lastName" value="<%=request.getAttribute("lname")%>" /></td>

</tr>

    <td><input type= "submit" value="update record"/></td>
    <td><input type="reset"  value="Reset"/></td>
</form>
<%--<% insertform l1=new insertform();%>--%>

<%--<html:form action="/finalupdate">--%>
    <%--<tr>--%>

        <%--<td>First Name</td>--%>
        <%--<td><html:text property="firstName" value="<%=l1.getFirstName()%>" /></td>--%>


    <%--</tr>--%>

    <%--<tr>--%>
        <%--<td>Last Name</td>--%>
        <%--<td><html:text property="lastName" value="<%=l1.getLastName()%>" /></td>--%>

    <%--</tr>--%>

<%--<tr>--%>
    <%--<td><html:submit value="update record"/></td>--%>
    <%--<td><html:reset value="Reset"/></td>--%>

<%--</tr>--%>
<%--</html:form>--%>

</body>
</html>



