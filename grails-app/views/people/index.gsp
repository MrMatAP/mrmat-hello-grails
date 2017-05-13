<!DOCTYPE html>
<html>
    <head>
        <title>People Index</title>
    </head>
    <body>

        <table>
          <thead>
            <tr>
              <th>id</th>
              <th>Name</th>
              <th>Surname</th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            <% people.each { p -> %>
              <tr>
                <td><%= p.id %></td>
                <td><%= p.name %></td>
                <td><%= p.surname %></td>
                <td>
                    <g:link action='show' id='${p.id}'>Show</g:link>
                    <g:link action='edit' id='${p.id}'>Edit</g:link>
                    <g:link action='delete' id='${p.id}'>Delete</g:link>
                </td>
              </tr>
            <% } %>
          </tbody>
        </table>
        <g:link action='create'>Create</g:link>

    </body>
</html>



