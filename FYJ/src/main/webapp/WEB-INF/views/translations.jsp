<%@page import="org.springframework.http.HttpRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <%@ include file="header.jsp"%>
     <%@ include file="menu.jsp"%>
     
     <%@ page import="org.springframework.web.context.request.WebRequest" %>

<style type="text/css">
.rega hi{
height:900px;
    width 100%;
    background: #f9ebd6;
     margin-left: 250px;
}
</style>
<title>Переводы||FindYourJob.by</title>
</head>
<body>







 <div class= "welcome">

         <div class= "layer">
    <h1 style="text-align:center; color: #b9f747">Переводы</h1>
          <div class = "tablic" >
          <h1 style="font-size: 25px;text-align:center;"><c:out value="${preview0}"></c:out> <br></h1> 
          
          <div style="margin-left: 15px; color:black; font-size: 13px;">
          
           Имя: &nbsp;&nbsp;<c:out value="${name0}"></c:out> <br>
          Страна:&nbsp;&nbsp; <c:out value="${country0}"></c:out> <br>
         Моб.Телефон: &nbsp;&nbsp;<c:out value="${phone0}"></c:out> <br>
          E-Mail:&nbsp;&nbsp; <c:out value="${email0}"></c:out> <br>
          </div>
          <h2 style="margin-left: 15px; color:black; font-size: 18px; text-align:center;">Услуга Фрилансера:<br></h2>
          <div style="margin-left: 15px; margin-right: 15px; color:black; font-family: Times new Roman; font-size: 18px; text-align: justify;">
           <c:out value="${task0}"></c:out> 
          </div>
         
          
           </div>
        
        
          <div class = "tablic" ><h1 style="font-size: 25px; text-align:center;"><c:out value="${preview1}"></c:out> <br></h1> 
          
          <div style="margin-left: 15px; color:black; font-size: 13px;">
          
           Имя: &nbsp;&nbsp;<c:out value="${name1}"></c:out> <br>
          Страна:&nbsp;&nbsp; <c:out value="${country1}"></c:out> <br>
         Моб.Телефон: &nbsp;&nbsp;<c:out value="${phone1}"></c:out> <br>
          E-Mail:&nbsp;&nbsp; <c:out value="${email1}"></c:out> <br>
          </div>
          <h2 style="margin-left: 15px; color:black; font-size: 18px; text-align:center;">Услуга Фрилансера:<br></h2>
          <div style="margin-left: 15px; margin-right: 15px; color:black; font-family: Times new Roman; font-size: 18px; text-align: justify;">
           <c:out value="${task1}"></c:out> 
          </div></div>
         
          <div class = "tablic" ><h1 style="font-size: 25px; text-align:center;"><c:out value="${preview2}"></c:out> <br></h1> 
          
          <div style="margin-left: 15px; color:black; font-size: 13px;">
          
           Имя: &nbsp;&nbsp;<c:out value="${name2}"></c:out> <br>
          Страна:&nbsp;&nbsp; <c:out value="${country2}"></c:out> <br>
         Моб.Телефон: &nbsp;&nbsp;<c:out value="${phone2}"></c:out> <br>
          E-Mail:&nbsp;&nbsp; <c:out value="${email2}"></c:out> <br>
          </div>
          <h2 style="margin-left: 15px; color:black; font-size: 18px; text-align:center;">Услуга Фрилансера:<br></h2>
          <div style="margin-left: 15px; margin-right: 15px; color:black; font-family: Times new Roman; font-size: 18px; text-align: justify;">
           <c:out value="${task2}"></c:out> 
          </div></div>
        
        <div class = "tablic" ><h1 style="font-size: 25px; text-align:center;"><c:out value="${preview3}"></c:out> <br></h1> 
          
          <div style="margin-left: 15px; color:black; font-size: 13px;">
          
           Имя: &nbsp;&nbsp;<c:out value="${name3}"></c:out> <br>
          Страна:&nbsp;&nbsp; <c:out value="${country3}"></c:out> <br>
         Моб.Телефон: &nbsp;&nbsp;<c:out value="${phone3}"></c:out> <br>
          E-Mail:&nbsp;&nbsp; <c:out value="${email3}"></c:out> <br>
          </div>
          <h2 style="margin-left: 15px; color:black; font-size: 18px; text-align:center;">Услуга Фрилансера:<br></h2>
          <div style="margin-left: 15px; margin-right: 15px; color:black; font-family: Times new Roman; font-size: 18px; text-align: justify;">
           <c:out value="${task3}"></c:out> 
          </div> </div>
          
             
         <c:set var="nextcheck" value="${nextcheck}"/>
   
     <c:choose>
     <c:when test = "${nextcheck<=0}"> 
 <form action="prevpaget">
             
        <input type="hidden" name="sub" value="<c:out value="${i3}"></c:out>">
        <input class="btn btn-success" type="submit" name="subв" value="Назад">
        </form>
      </c:when>
    
      <c:otherwise>
             <form action="nextpaget">
             
        <input type="hidden" name="sub" value="<c:out value="${i3}"></c:out>">
        <input class="btn btn-success" type="submit" name="subt" value="Далее">
        </form>
        
         <form action="prevpaget">
             
        <input type="hidden" name="sub" value="<c:out value="${i3}"></c:out>">
        <input class="btn btn-success" type="submit" name="subв" value="Назад">
        </form>
         </c:otherwise>
      </c:choose>
       
         </div>
            </div>
   




 <%@ include file="footer.jsp"%>
