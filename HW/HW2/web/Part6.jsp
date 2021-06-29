<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HW2_Part6</title>
        <meta charset = "utf-8">
    </head>

    <body>
        <div>
            <div >
                <h3>HW2_Part6</h3>
                
            </div>

            <form  action = "Part6_Submit.jsp" method = "POST">
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

                <div>
                   <div>Upload Your Picture :</div>
                   <input type = "file" name = "file" size = "30"><br><br>
                </div>

                
                    Gender: 
			<input type="radio" name="gender" value="male" />
			<label>Male</label>
			
			<input type="radio" name="gender" value="female" />
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
                </div>

                <div >
                    <label >Hobby :</label>
                    <div >
                        <label>
                            <input type = "checkbox"  value = "Cricket" name = "Cricket"> Cricket
                        </label>

                        <label>
                            <input type = "checkbox"  value = "Football" name = "Football"> Football
                        </label>
                    </div>
                </div>

                <div >
                    <label >Address :</label>
                    <div>
                        <textarea  rows = "5" name = "address" placeholder = "Address"></textarea>
                    </div>
                </div>

                

                <div>
                    <div>
                        <button type = "submit" >Submit</button>
                    </div>
                </div>
            </form>
        </div>
    </body>
</html>