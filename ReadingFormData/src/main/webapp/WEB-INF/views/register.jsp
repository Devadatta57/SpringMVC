<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
    <style>
        body {
            font-family: sans-serif;
            background: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-container {
            background: #fff;
            padding: 25px;
            border-radius: 10px;
            box-shadow: 0 0 10px #ccc;
            width: 360px;
        }
        h2 { text-align: center; color: #333; }
        label { margin-top: 12px; display: block; }
        input, textarea {
            width: 100%; padding: 8px;
            margin-top: 5px; border: 1px solid #ccc;
            border-radius: 4px;
        }
        button {
            margin-top: 18px; width: 100%;
            padding: 10px; background: #28a745;
            border: none; color: #fff;
            border-radius: 5px; cursor: pointer;
        }
        button:hover { background: #218838; }
    </style>
</head>
<body>
    <div class="form-container">
       <c:forEach items="${errorList}" var="fe">
    
    <c:out value="${fe.getfield()}"></c:out>
        <c:out value="${fe.getdefaultMessage()}"></c:out>
    
    </c:forEach>

        <h2>Student Form</h2>
        <form action="saveuser">
            <label>Name:</label>
            <input type="text" name="name" >

            <label>Email:</label>
            <input type="email" name="email" >

            <label>Roll No:</label>
            <input type="text" name="rollno" >

            <label>Mobile No:</label>
            <input type="tel" name="mobileno">

            <label>Department:</label>
            <input type="text" name="department" >

            <label>Address:</label>
            <textarea name="address" rows="2" ></textarea>

            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>
