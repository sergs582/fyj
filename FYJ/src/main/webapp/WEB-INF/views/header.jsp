<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content = "width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="resources/css/style.css" type="text/css"/>
        <script src = "resources/javascript/js.js" type="text/javascript"></script>
        <script type="text/javascript" src ="resources/javascript/jquery-3.2.1.min.js"></script>
        
    
        <body>
        
        

        
        <div id = "header">
      
        <%@ include file="adaptation.jsp"%>
                 
       <a class = "logo" href="index"> <img src="resources/images/label.png" width="250" height="100" ></a> 
        
        
      
    <c:set var="logged" value="${id_user}"/>
   
     <c:choose>
     <c:when test = "${logged>0}"> 
     <div class="logger" style="float: right; margin-top: 25px; margin-right:20px; font-size:20px; color:white;">Добро пожаловать, <a style="color:white;"href="signin"><c:out value="${name}"></c:out></a>!<br>
     <a style="color:white;"href="logout">Выйти</a>
     </div> 
      </c:when>
    
      <c:otherwise>
            
            
             <form  class="forma" action="next" method="POST" onsubmit="return main2(this)"  >
            
             <a class="btn btn-success"  href="registration" >Регистрация</a>
              
              <input class="btn btn-success" type ="submit" name="sub2" value="Войти">
            <input style="width: 180px;"class="pass" type="password" name="password" placeholder="Пароль"></input>
            <input style="width: 180px;" class="login" type="text" name="login" placeholder="Логин"></input>
            
            
            
           </form>
            
            
         </c:otherwise>
      </c:choose>
            </div>