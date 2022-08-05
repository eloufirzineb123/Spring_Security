<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>Spring MVC Form</title>
    </head>
    ?
    <body>
        <h2>Registration</h2>
        <c:if test="${param.success}">
            <h1>You've successfully registered !</h1>
        </c:if>
        <form:form method="POST" modelAttribute="user">
            <fieldset>
                <form:label path="firstName">Firstname</form:label>
                <form:input path="firstName" type="text" class="form-control"
                            required="required" />
                <form:errors path="firstName" cssClass="text-warning" />
            </fieldset>
            <fieldset>
                <form:label path="lastName">Lastname</form:label>
                <form:input path="lastName" type="text" class="form-control"
                            required="required" />
                <form:errors path="lastName" cssClass="text-warning" />
            </fieldset>
            <fieldset>
                <form:label path="email">Email</form:label>
                <form:input path="email" type="email" class="form-control"
                            required="required" />
                <form:errors path="email" cssClass="text-warning" />
            </fieldset>
            <fieldset>
                <form:label path="password">Password</form:label>
                <form:input path="password" type="password" class="form-control"
                            required="required" />
                <form:errors path="password" cssClass="text-warning" />
            </fieldset>
            <button type="submit">Register</button>
        </form:form>
             </body></html>
   
    ?
