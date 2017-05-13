<!DOCTYPE html>
<html>
    <head>
        <title>People Index</title>
    </head>
    <body>

        <g:form name="personForm" url="[controller: 'people', action: 'save']">
            <g:textField name="name"/>
            <g:textField name="surname"/>
            <g:actionSubmit value="Save"/>
        </g:form>

    </body>
</html>