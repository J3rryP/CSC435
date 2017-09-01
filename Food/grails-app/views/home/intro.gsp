<!doctype html>



<html>
<head>
    <meta name="layout" content="main"/>

</head>
<body>
        <div class="jumbotron">
            <h2 class="form-signin-heading">Define you</h2>
            </div>
      <form class="form" action=nuser method="post" >


        <g:if test = "${genres != null}">
           <% genres.each { ex -> %>
             <input type="submit" class="btn btn-large active" value="${ex}" params="[name : ${ex}]" id="fish" class="form-control" name="fish">

              &nbsp;
           <%}%>
        </g:if>

        <script>
      function myFunction(name) {
        <g:link params="[name: 'title']"
        action="addGenres">Book List</g:link>
      }
      </script>

      </form>
        <div class="jumbotron">
        <button class="btn btn-sm btn-primary" type="submit" name="newUser" value="newUser" id="newUser">Finish up</button>
      </div>
  <h4>${flash.message}</h4>
</body>
</html>
