<!DOCTYPE html>
<html>
   <head>
      <meta name="layout" content="main" />
      <g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
   </head>
   <body>
      <div class="jumbotron">

         <g:if test="${flash.message}">
            <div class="message" role="status">${flash.message}</div>
         </g:if>
         <g:hasErrors bean="${this.user}">
            <ul class="errors" role="alert">
               <g:eachError bean="${this.user}" var="error">
                  <li
                  <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>
                  >
                  <g:message error="${error}"/>
                  </li>
               </g:eachError>
            </ul>
         </g:hasErrors>
         <g:form controller="user" action="save" class="form-signin" >
         <h2 class="form-signin-heading">
            Sign Up
         </h2>
            <fieldset class="form">
               <div class="col-sm-10">
                  <label for='name'>Name
                  <span class='required-indicator'>*</span>
                  </label>
                  <input type="text"
                     class="form-control"
                     id="name"
                     name="name"
                     value=""
                     maxlength="233"
                     placeholder="Enter a name" />
               </div>
               <div class="col-sm-10">
                  <label for='email'>Email
                  <span class='required-indicator'>*</span>
                  </label>
                  <input type="text"
                     class="form-control"
                     id="email"
                     name="email"
                     maxlength="64"
                     value=""
                     placeholder="Enter an email" />
               </div>
               <div class="col-sm-10">
                  <label for='password'>Password
                  <span class='required-indicator'>*</span>
                  </label>
                  <input type="password"
                     class="form-control"
                     id="password"
                     name="password"
                     value=""
                     maxlength="64"
                     placeholder="Enter a strong password" />
               </div>
               <div class="col-sm-10" >
                  <label for='gender' class="radio-inline">Gender
                  <span class='required-indicator'>*</span>
                  </label>
                  <input
                     type="radio"
                     name="gender"
                     id="gender"
                     value="M"
                     />
                  Male
                  </label>
                  <input
                     type="radio"
                     name="gender"
                     id="gender"
                     value="F"
                     />
                  Female
                  </label>
               </div>
               <div class="col-sm-10">
                  <label for='age'>Age
                  <span class='required-indicator'>*</span>
                  </label>
                  <select
                     class="form-control"
                     id="age">
                     <option id="age" value="10" >10 to 13</option>
                     <option id="age" value="14" >14 to 17</option>
                     <option id="age" value="18" >18 to 25</option>
                     <option id="age" value="26" >26 to 35</option>
                     <option id="age" value="35" >35+</option>
                  </select>
                  <span class="help-block">Choose your age</span>
                  <span class="help-block"></span>
               </div>
            </fieldset>
            <div class="col-sm-10">
               <fieldset class="buttons">
                  <g:submitButton name="create" class="btn btn-lg btn-primary btn-block" value="${message(code: 'default.button.create.label', default: 'Sign up')}" />
               </fieldset>
            </div>
         </g:form>
      </div>
   </body>
</html>
