<%-- 
    Document   : user-form
    Created on : Nov 4, 2020, 9:58:23 AM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="report.pdf" method="post">
             <div >
                    <div>Email:</div>
					<div>
                    <input type = "email"  name = "email" placeholder = "Email"><br>
                    </div>
                </div>

                <div >
                    <div>Password:</div>
					<div>
                        <input type = "password"  name = "password" placeholder = "Password"><br>
                    </div>
                </div>

                <div>
                    <div>Confirm Password:</div>
					<div>
                        <input type = "password"  name = "repassword" placeholder = "Confirm Password"><br><br>
                    </div>
                </div>

                    Gender: 
			<input type="radio" name="gender" value="Male" />
			<label>Male</label>
			
			<input type="radio" name="gender" value="Female" />
			<label>Female</label>
			<br />
                

                <div >
                    <label>Select Country :</label>
                    <div>
                        <select name = "country">
                            <option>United States</option>
                            <option>India</option>
                            <option>Japan</option>
                            <option>China</option>
                            
                        </select>
                    </div>
                </div><!--

-->                <div >
                    <label >Hobby :</label>
                    <div >
                        <label>
                            <input type = "checkbox"  value = "Cricket" name = "hobby"> Cricket
                        </label>

                        <label>
                            <input type = "checkbox"  value = "Football" name = "hobby"> Football
                        </label>
                    </div>
                </div>

                <div >
                    <label >Address :</label>
                    <div>
                        <textarea  rows = "5" name = "address" placeholder = "Address"></textarea>
                    </div>
               </div>
            <input type="submit" value="Submit" >
        </form>
             
             
             
             
    </body>
</html>
