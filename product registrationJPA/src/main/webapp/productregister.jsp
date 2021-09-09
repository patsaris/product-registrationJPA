<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
 href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
 integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
 crossorigin="anonymous">
</head>

</head>
<body>
 <div class="container">
 <div class="row text-center" style="color: tomato;">
  <h2>Product Registration</h2>
 </div>
 <hr>
  <div class="row col-md-10 col-md-offset-3"> 
   
   <div class="card card-body">
   
    <h2>Product Register Form</h2>
    <div class="col-md-8 col-md-offset-3">

     <form action="<%=request.getContextPath()%>/register" method="post">

      <div class="form-group">
       <label for="uname">Name:</label> <input type="text"
        class="form-control" id="uname" placeholder="Name"
        name="name" required>
      </div>

      <div class="form-group">
       <label for="uname">Barcode:</label> <input type="text"
        class="form-control" id="uname" placeholder="Barcode"
        name="barcode" required>
      </div>

      <div class="form-group">
       <label for="uname">Colour:</label> <input type="text"
        class="form-control" id="username" placeholder="Colour"
        name="colour" required>
      </div>

      <div class="form-group">
       <label for="uname">Description:</label> <input type="text"
        class="form-control" id="password" placeholder="Description"
        name="description" required>
      </div>

      <button type="submit" class="btn btn-primary">Submit</button>

     </form>
     <form action="<%=request.getContextPath()%>/read" method="get">
     	<button type="submit" class="btn btn-primary">Read</button>
     </form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>