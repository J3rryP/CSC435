<!DOCTYPE html>
<html>
   <head>
      <meta name="layout" content="main" />
      <title>
         <h2>Food Suggestor</h2>
      </title>
   </head>
   <body>
      <div class="jumbotron">
         <form class="form-signin" action=similar method="get" >
            <h2 class="form-signin-heading">Hello ${name}</h2>
            <label for="inputEmail" class="sr-only">Search for a Food.</label>
            <input type="text" id="query" class="form-control" name="query" placeholder="Search for a Food" required autofocus>
            <br>
         </form>
         <g:if test = "${url != null}">
          <iframe</iframe>
            <div class="container-fluid">
            <% url.each { ex -> %>

               <iframe</iframe>
               &nbsp;
            <%}%>
                </div>
         </g:if>
      </div>



      <br>Had enough?
      <li><a href="${createLink(uri: '/bye')}">Logout</a></li>
   </body>
</html>
