<!DOCTYPE html>
<html>
    <head>
        <title>People Index</title>
    </head>
    <body>

        <g:form name="personForm" url="[controller: 'people', action: 'update']">
            <input type='hidden' name='id' value='${person.id}'/>
            <g:textField name="name" value="${person.name}"/>
            <g:textField name="surname" value="${person.surname}"/>
            <g:actionSubmit value="Update"/>
        </g:form>

    </body>
</html>