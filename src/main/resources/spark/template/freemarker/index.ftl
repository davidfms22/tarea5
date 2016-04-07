<!DOCTYPE html>
<html>
	<head>
	  <#include "header.ftl">
	</head>

	<body>
		<table class="tg">
		  <tr>
		    <th class="tg-30hw" colspan="2"> Test </th>
		    <th class="tg-30hw"> Expect<br>Value </th>
		    <th class="tg-30hw"> Actual<br>Value </th>
		  </tr>
		  <tr>
		    <td class="tg-tbvz"> x </td>
		    <td class="tg-tbvz"> dof </td>
		    <td class="tg-tbvz"> p </td>
		    <td class="tg-6alo"></td>
		  </tr>
		  <tr>
		    <td class="tg-bgso"> 0 to x= 1.1812 </td>
		    <td class="tg-chpy"> 9 </td>
		    <td class="tg-chpy"> 0.35006 </td>
		    <td class="tg-chpy"> ${A1} </td>
		  </tr>
		  <tr>
		    <td class="tg-bgso"> 0 to x= 1.1812 </td>
		    <td class="tg-chpy"> 10 </td>
		    <td class="tg-chpy"> 0.36757 </td>
		    <td class="tg-chpy"> ${A2} </td>
		  </tr>
		  <tr>
		    <td class="tg-bgso"> 0 to x= 2.750 </td>
		    <td class="tg-chpy"> 30 </td>
		    <td class="tg-chpy"> 0.49500 </td>
		    <td class="tg-chpy"> ${A3} </td>
		  </tr>
		  <tr>
		    <td class="tg-bgso"> 
		    	<input type="text" name="x" required />
		    </td>
		    <td class="tg-chpy"> 
		    	<input type="text" name="dof" required />
		    </td>
		    <td class="tg-chpy"> 0.49500 </td>
		    <td class="tg-chpy"> ${A3} </td>
		  </tr>
		</table>
		<form class="contacto" action="" method="post" name="contact_form">
			<div><label>Tu Nombre:</label><input type='text' value=''></div>
            <div><label>Tu Email:</label><input type='text' value=''></div>
            <div><label>Asunto:</label><input type='text' value=''></div>
            <div><label>Mensaje:</label><textarea rows='6'></textarea></div>
            <div><input type='submit' value='Envia Mensaje'></div>
		</form>
	</body>
</html>
