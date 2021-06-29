<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HW2_Part9</title>
        <meta charset = "utf-8">
    </head>
	<body>
        <form  action = "Part9_Submit.jsp" method = "POST">
		<div>
		<h3>Northeastern University</h3>
		<p>Human Resources Management</p>
		<p>CHECK REASON THAT YOU ARE COMPLETING THIS ENROLLMENT FORM*</p>
		<input type="radio" name="reason" value="New hire" checked/>
		<label>New hire</label>	
		<input type="radio" name="reason" value="Qualifying event or family status change" />
		<label>Qualifying event or family status change</label>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		Effective date (mm/dd/yyyy): <input type="date" name="date" value="10/01/2020"/>
		<h5>EMPLOYEE INFORMATION</h5>
		<p>Name (Last, First, Middle initial): <input type="text" name="name" value="abc"/>
		Social Security number: <input type="text" name="ssn" value="abc"/></p>
		<p>Date of birth: <input type="date" name="birth" value="10/01/2020"/>
		Date of hire: <input type="date" name="hire" value="10/01/2020"/>Marital status: <input type="text" name="marital" value="abc"/></p>
		<h5>HEALTH INSURANCE</h5>
		<div style="float:left">
		<ul>Medical</ul>
		<ul><input type="radio" name="medical" value="Individual" checked/>Individual</ul>
		<ul><input type="radio" name="medical" value="Family" />Family</ul>
		<ul><input type="radio" name="medical" value="Terminate" />Terminate</ul>
		<ul><input type="radio" name="medical" value="Waive participation" />Waive participation</ul>
		</div>
		<div style="float:left">
		<ul>I select the following plan (choose one):</ul>
		<ul><input type="radio" name="type1" value="HDHP W/HSA" checked/>HDHP W/HSA</ul>
		<ul><input type="radio" name="type1" value="Core" />Core</ul>
		<ul><input type="radio" name="type1" value="Enhanced" />Enhanced</ul>
		<ul><input type="radio" name="type1" value="PPO" />PPO</ul>
		</div>
		<div style="float:left">
		<ul>Dental</ul>
		<ul><input type="radio" name="dental" value="Individual" checked/>Individual</ul>
		<ul><input type="radio" name="dental" value="Family" />Family</ul>
		<ul><input type="radio" name="dental" value="Terminate" />Terminate</ul>
		<ul><input type="radio" name="dental" value="Waive participation" />Waive participation</ul>
		</div>
		<div style="float:left">
		<ul>I select the following plan (choose one):</ul>
		<ul><input type="radio" name="type2" value="Value" checked/>Value</ul>
		<ul><input type="radio" name="type2" value="Value Plus" />Value Plus</ul>
		</div>
		<div style="float:left">
		<ul>Vision Plan</ul>
		<ul><input type="radio" name="vision" value="Individual" checked/>Individual</ul>
		<ul><input type="radio" name="vision" value="Family" />Family</ul>
		<ul><input type="radio" name="vision" value="Terminate" />Terminate</ul>
		<ul><input type="radio" name="vision" value="Waive participation" />Waive participation</ul>
		</div>
		<div style="clear:both"></div>
		<h5>HEALTH INSURANCE DEPENDENT AND PRIMARY CARE PHYSICIAN INFORMATION</h5>
		<div>
		<table border="1">
    <tr>
        <td>Medical</td>
        <td>Dental</td>
		<td>Vision</td>
		<td>Name (Last, First, MI)</td>
		<td>Social Security #</td>
		<td>D.O.B.</td>
		<td>Gender</td>
		<td>Student?</td>
		<td>Relationship</td>
		<td>PCP#</td>	
    </tr>
     <tr>
        <td><input type="radio" name="medical1" value="check" checked/></td>
        <td><input type="radio" name="dental1" value="check" checked/></td>
		<td><input type="radio" name="vision1" value="check" checked/></td>
		<td><input type="text" name="name1" value="abc"/></td>
		<td><input type="text" name="ssn1" value="abc"/></td>
		<td><input type="date" name="date1" value="10/01/2020"/></td>
		<td> 
			<input type="radio" name="gender" value="male" checked/>Male
			<input type="radio" name="gender" value="female" />Female
        </td>
		<td><input type="radio" name="student" value="Yes" checked/></td>
		<td><input type="text" name="relation" value="abc"/></td>
		<td><input type="text" name="pcp" value="abc"/></td>	
    </tr>
	  <tr>
        <td><input type="radio" name="medical2" value="check" checked/></td>
        <td><input type="radio" name="dental12" value="check" checked/></td>
		<td><input type="radio" name="vision12" value="check" checked/></td>
		<td><input type="text" name="name12" value="abc"/></td>
		<td><input type="text" name="ssn12" value="abc"/></td>
		<td><input type="date" name="date12"value="10/01/2020"/></td>
		<td> 
			<input type="radio" name="gender12" value="male" checked/>Male
			<input type="radio" name="gender12" value="female" />Female
        </td>
		<td><input type="radio" name="student12" value="Yes" checked/></td>
		<td><input type="text" name="relation12" value="abc"/></td>
		<td><input type="text" name="pcp12" value="abc"/></td>	
    </tr>
	
</table>
</div>
<div style="clear:both"></div>
<h5>REIMBURSEMENT ACCOUNTS</h5>
<div>Health Care Reimbursement Account&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp

			<input type="radio" name="amount" value="Amount" checked/>
			<label> Amount: $ <input type="text" name="jine" value="abc"/></label>
			
			<input type="radio" name="amount" value="Waive participation" />
			<label>Waive participation</label>
</div>

<div>Dependent Care Reimbursement Account&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp

			<input type="radio" name="amount2" value="Amount" />
			<label> Amount: $ <input type="text" name="jine1" /></label>
			
			<input type="radio" name="amount2" value="Waive participation" checked/>
			<label>Waive participation</label>
</div>		
<h5>HEALTH SAVINGS ACCOUNT (HSA)</h5>
<div>Health Savings Account&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
<label> Amount: $ <input type="text" name="amount3"  value="abc"/></label>
</div>
<h5>LIFE INSURANCE</h5>
<div>Supplemental Life Insurance<input type="radio" name="amount4" value="1x base salary" checked/>1x base salary
<input type="radio" name="amount4" value="2x base salary" /> 2x base salary
<input type="radio" name="amount4" value="3x base salary" /> 3x base salary
<input type="radio" name="amount4" value="4x base salary" /> 4x base salary
<input type="radio" name="amount4" value="Waive" /> Waive</div>
<div>Spouse/Domestic Partner <input type="radio" name="amount5" value=" $25,000" checked/> $25,000
<input type="radio" name="amount5" value="$50,000" /> $50,000
<input type="radio" name="amount5" value="$75,000" />  $75,000
<input type="radio" name="amount5" value="$100,000" /> $100,000
<input type="radio" name="amount5" value="Waive" /> Waive</div>
<div>Dependent Child(ren)<input type="radio" name="amount6" value="$10,000" checked/> $10,000
<input type="radio" name="amount6" value="$205,000" />  $20,000
<input type="radio" name="amount6" value="Waive" /> Waive</div>
<h5>VOLUNTARY BENEFIT</h5>
<div>Legal Plan<input type="radio" name="amount7" value=" Individual/family" />  Individual/family
<input type="radio" name="amount7" value="Waive participation" checked/>  Waive participation</div>
<h5>BENEFICIARY INFORMATION</h5>
<table border="1">
<tr>
<td>
Name (Last, First, Middle initial)
</td>
<td>
Relationship
</td>
<td>
Primary/Contingent (circle one)
</td>
<td>
Benefit percent
</td>
</tr>
<tr>
<td>
<input type="text" name="name2" value="abc"/>
</td>
<td>
<input type="text" name="relationship" value="abc"/>
</td>
<td>
<input type="radio" name="amount8" value="Primary" checked/>  Primary
<input type="radio" name="amount8" value="Contingent" /> Contingent
</td>
<td>
<input type="text" name="benefit" value="abc"/>%<br/>
</td>
</tr>
<tr>
<td>
<input type="text" name="name23" value="abc"/>
</td>
<td>
<input type="text" name="relationship3" value="abc"/>
</td>
<td>
<input type="radio" name="amount83" value="Primary" checked/>  Primary
<input type="radio" name="amount83" value="Contingent" /> Contingent
</td>
<td>
<input type="text" name="benefit3" value="abc"/>%<br/>
</td>
</tr>
</table>
Employee signature<input type="text" name="employee" value="abc"/>Date<input type="text" name="datesign" value="abc"/><br/>
Reviewed by<input type="text" name="review" value="abc"/>Entered<input type="text" name="entered" value="abc"/>
<div>
                        <button type = "submit" >Submit</button>
                    </div>
        </form>       				
	</body>
</html>