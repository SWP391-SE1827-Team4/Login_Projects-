
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            text-align: center;
            color: #333;
        }

        input {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #4caf50;
            color: #fff;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
    <title>Đăng ký tài khoản</title>
</head>
<body>
    <form action="register" method="post">
<!--   <input type="hidden" name="customerID" >
    <label for="customerName">Tên của bạn:</label>
    <input type="text" id="customerName" name="customerName" required><br>
    Giới Tính:
    <select name=" Gender">
           
            <option value="nam">Male</option>
            <option value="nu">Female </option>
        </select><br/>
        <br/>
    <label for="">c</label>----------------------------------------
    <input type="text"  name="customerPhone" required><br>
    <label >Số điện thoại:</label>
    <input type="text" id="customerPhone" name="customerPhone" required><br>
    <label for="customerAddress">Địa chỉ:</label>
    <input type="text" id="customerAddress" name="customerAddress" required><br>  
    <input type="hidden" name="userID" value="5">
    <label for="userName">Tên đăng nhập:</label>
    <input type="text" id="userName" name="userName" required><br>
    <label for="password">Mật khẩu:</label>
    <input type="password" id="password" name="password" required><br>
    <input type="hidden" name="role" value="Customer">
    -->
    <input type="hidden" name="customerID" >
    <label >Tên của bạn:</label>
    <input type="text" name="customerName" required><br>
    
    
    Giới Tính:
    <select name="Gender">
         <option value="nam">Male</option>
         <option value="nữ">Female </option>
    </select>
       <br/>
        <br/>
    
    <label >Email:</label>
    <input type="text" name="email" required><br>
    <label >Phone:</label>
    <input type="text" name="phone" required><br>
      <label >Address:</label>
    <input type="text" name="address" required><br>
     <label >Password:</label>
    <input type="text" name="pass" required><br>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    <input type="submit" value="" name="submit" />
   
</form>
</body>
</body>
</html>
