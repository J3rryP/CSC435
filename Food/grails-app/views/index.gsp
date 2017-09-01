<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Food Suggestor</title>
</head>
<body>
        <div class="jumbotron">
      <form class="form-signin" action=welcome method="post" >
        <h2 class="form-signin-heading">Sign in</h2>

        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="text" id="email" class="form-control" name="email" value="" maxlength="233" placeholder="Email address" required autofocus >

        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="password" class="form-control" name="password" value="" maxlength="64" placeholder="Password" required >

        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit" name="Login" value="Login" id="Login">Sign in</button>
        <br>Don't have an account? <li><a href="${createLink(uri: 'register')}">Sign up</a></li>
  </div>
  <h4>${flash.message}</h4>
</body>
</html>