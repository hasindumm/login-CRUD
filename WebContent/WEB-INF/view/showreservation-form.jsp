
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Show General Reservations</title>

	<!-- reference our style sheet -->

	
	<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

	
	
	
	
	
</head>

<body>

	<div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-4">GENARAL RESERVATION LIST</h1>
    <p class="lead"></p>
  </div>
</div>

	
	
	
	
	
	<div id="container">
	
		<div id="content">
		
		
		
		
			
			<button type="button" class="btn btn-primary"  onclick="window.location.href='showFormForAdd2'; return false;">Add General Reservation </button>
			
			<br>
			<br>
		
			<!--  add our html table here -->
		
			<table class="table table-striped">
				<tr>
					
					<th>Id</th>
					<th>Start Date</th>
					<th>End Date</th>
					<th>Date Time</th>
					<th>Asset Type</th>
					<th>Type</th>
					<th>Quantity</th>
					<th>Grade</th>
					<th>Period</th>
						<th>Action</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer2" items="${customers2}">
				<c:url var = "updateLink2" value="/customer/showFormForUpdate2">
					<c:param name = "customerId2" value="${tempCustomer2.id }" />
				
				</c:url>
				
					
				<c:url var = "deleteLink2" value="/customer/delete2">
					<c:param name = "customerId2" value="${tempCustomer2.id }" />
				
				</c:url>
				
				
					<tr>
						<td> ${tempCustomer2.id} </td>					
						<td> ${tempCustomer2.startDate} </td>
						<td> ${tempCustomer2.endDate} </td>
						<td> ${tempCustomer2.dateTime} </td>
						<td> ${tempCustomer2.assetType} </td>
						<td> ${tempCustomer2.type} </td>
						<td> ${tempCustomer2.quantity} </td>					
						<td> ${tempCustomer2.grade} </td>
						<td> ${tempCustomer2.period} </td>
						
						
						<td> <a href = "${updateLink2}"> Update </a>
						
						<a href = "${deleteLink2}" onclick="if (!(confirm('Are you sure you want to delete this reservation?'))) return false"> Delete </a>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	




<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	

</body>

</html>





