<!DOCTYPE html>
<html>
    <head>
        <title>People Index</title>
    </head>
    <body>

        <p>Id: <%= person.id %></p>
        <p>Name: <%= person.name %></p>
        <p>Surname: <%= person.surname %></p>
        <g:link action='index'>Index</g:link>
        <g:link action='edit'>Edit</g:link>

    </body>
</html>
