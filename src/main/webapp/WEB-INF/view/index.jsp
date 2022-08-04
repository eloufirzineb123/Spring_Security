<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            <h1>"Hello World zineb!"</h1>
            
            
            <security:authorize access="isAuthenticated()">
                <p>
                    User :<security:authentication property="principal.username"/>
                    <br><!-- comment -->
                    Role (s)  <security:authentication property="principal.authorities"/>
                </p>
               </security:authorize >
            
            
                <security:authorize access="hasRole('MANAGER')">
                    <p>
                        <a href="/teams"> Teams Management</a>
                    </p>
                </security:authorize >
                
                 <security:authorize access="hasRole('ADMIN')">
                    <p>
                        <a href="/system"> IT System</a>
                    </p>
                </security:authorize >
                <hr><!-- comment -->
                
                 <security:authorize access="isAuthenticated()">
                    <form:form  action ="/logout" method="POST">
                        <input type="submit" value ="Logout"/>
                        </form:form >
                </security:authorize >
                
                
        </body>
    </html>

