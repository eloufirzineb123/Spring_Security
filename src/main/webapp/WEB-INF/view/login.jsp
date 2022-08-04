<html>
   <head>
      <title>Login Form</title>
   </head>
   <body>
      <h2>Login</h2>
      <form method="POST" action="/login">
         <table>
            <tr>
                <td>
                    <label for="username">Username</label>
                </td>
               <td><input id="username" name="username" /></td>
            </tr>
            <tr>
               <td>
                   <label for="password">Password</label>
               </td>
               <td>
                   <input type="password" id="password" name="password" />
               </td>
            </tr>            
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form>
      <a href="/registration">Register</a>
   </body>
   
</html>

























