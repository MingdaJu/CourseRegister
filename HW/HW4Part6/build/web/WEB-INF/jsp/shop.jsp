<%-- 
    Document   : shop
    Created on : Nov 4, 2020, 8:18:24 PM
    Author     : jumin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>HW4Part6</title>
	<style type="text/css">				
		.active {
		  background-color: yellowgreen;
		}
		.display-none{
		  display: none;
		}
                .navigation-bar{
                  display:inline;
                }
                .shoppincart{
                  float:right;
                }                
	</style>

</head>
<body>
    
<div class="container">
	<ul class="navigation-bar">
		<li><a id = "bookbar" class="active" >Books</a></li>
		<li><a id = "musicbar">Music</a></li>
		<li><a id = "computerbar" >Computers</a></li>                                
	<form action="cart.htm" method="get">
        <input type="hidden" name="option" value="cart">
	<input class="shoppincart" type="submit" name="Submit" value="Shopping Cart"/>
	</form>				
	</ul>
<div>
	<br/>
	

	<form action="shop.htm" method="post">
		<div id="book" >
			<h3>Books</h3>
			
			<input type="checkbox" name="book" value="book1">book1 <br/>
			<input type="checkbox" name="book" value="book2">book2 <br/>
			<input type="checkbox" name="book" value="book3">book3 <br/>
			
		</div>
		<div id="music" class="display-none">
			<h3>Music</h3>
			
			<input type="checkbox" name="music" value="music1">music1 <br/>
			<input type="checkbox" name="music" value="music2">music2 <br/>
			<input type="checkbox" name="music" value="music3">music3 <br/>
			
		</div>
		<div id="computer" class="display-none">
			<h3>Computers</h3>
			
			<input type="checkbox" name="laptop" value="copmuter1">copmuter1 <br/>
			<input type="checkbox" name="laptop" value="copmuter2">copmuter2 <br/>
			<input type="checkbox" name="laptop" value="copmuter3">copmuter3 <br/>
			
		</div>
		<br/>
		<br/>
                
                <input type="submit" name="Submit" value="Add to Cart">
	</form> 

</div>	
</div>
<script type="text/javascript">
	document.querySelector("#bookbar").addEventListener("click",function(){
		document.querySelector("#music").classList.add("display-none");
		document.querySelector("#computer").classList.add("display-none");
		document.querySelector("#book").classList.remove("display-none");
		document.querySelector("#bookbar").classList.add("active");
		document.querySelector("#musicbar").classList.remove("active");
		document.querySelector("#computerbar").classList.remove("active");
	});
	document.querySelector("#musicbar").addEventListener("click",function(){
		document.querySelector("#book").classList.add("display-none");
                document.querySelector("#music").classList.remove("display-none");
		document.querySelector("#computer").classList.add("display-none");
		document.querySelector("#bookbar").classList.remove("active");
		document.querySelector("#musicbar").classList.add("active");		
		document.querySelector("#computerbar").classList.remove("active");
	});
	document.querySelector("#computerbar").addEventListener("click",function(){
		document.querySelector("#book").classList.add("display-none");
		document.querySelector("#music").classList.add("display-none");
		document.querySelector("#computer").classList.remove("display-none");
                document.querySelector("#bookbar").classList.remove("active");
                document.querySelector("#musicbar").classList.remove("active");
		document.querySelector("#computerbar").classList.add("active");
		
	});
</script>
</body>
</html>
