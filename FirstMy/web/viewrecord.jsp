<%@ page import="com.form.insertform" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>

<h3>All Records:</h3>



    <fieldset>
        <%
            int i = 1;
            ArrayList<insertform> list = (ArrayList) request.getAttribute("list");
            if(list==null){
                System.out.println("list is null");
            }
        %>

        <%
            for (insertform  u : list) {
        %>


        <pre>    first name : <%=u.getFirstName()%>                  last name : <%=u.getLastName()%> </pre>
        <br>





        <%
            }
        %>

    </fieldset>

