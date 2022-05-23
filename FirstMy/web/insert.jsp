
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>

<html>
<head>
    <title>inserdata</title>
</head>
<body>

<h1>  Insert data into database</h1>

<html:form action="/in"  >

     <tr>

         <td>First Name</td>
         <td><html:text property="firstName"/></td>


     </tr>
    <tr>
        <td>Last Name</td>
        <td><html:text property="lastName"/></td>

    </tr>

    <tr>
        <td><html:submit value="Insert"/></td>
        <td><html:reset value="Reset"/></td>
    </tr>
</html:form>




<html:form action="/view" >


    <tr>
        <td><html:submit value="view record"/></td>

    </tr>



</html:form>


<html:form action="/delete" >

    <tr>

        <td>First Name</td>
        <td><html:text property="firstName"/></td>


    </tr>


    <tr>
        <td><html:submit value="delete record"/></td>
        <td><html:reset value="Reset"/></td>

    </tr>



</html:form>


<html:form action="/update" >

    <tr>

        <td>Enter name to update</td>
        <td><html:text property="firstName"/></td>


    </tr>


    <tr>
        <td><html:submit value="update record"/></td>
        <td><html:reset value="Reset"/></td>

    </tr>



</html:form>






</body>
</html>
