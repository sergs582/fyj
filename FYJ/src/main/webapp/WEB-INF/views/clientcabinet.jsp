<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp"%>

<title>Личный Кабинет||FindYJob</title>

   <body>


<%@ include file="menu.jsp"%>

 <div class= "clientcabinet">
 

         <div class= "layer2">
         <h1 style="text-align:center; color: #b9f747; margin-top: 25px;"> Добро пожаловать, <c:out value="${name}"></c:out>! </h1>
         
         <div style="color: white;" class= "information" > 
          <h1 style="font-family: Times new Roman; font-size: 30px;text-align: center; color: #b9f747;">Информация о профиле:</h1><br>
         Имя: &nbsp;&nbsp;<c:out value="${name}"></c:out><br>
          Фамилия: &nbsp;&nbsp;<c:out value="${secname}"></c:out><br>
          
          Страна: &nbsp;&nbsp;<c:out value="${country}"></c:out><br>
           E-Mail: &nbsp;&nbsp;<c:out value="${email}"></c:out><br>
          Номер телефона: &nbsp;&nbsp;<c:out value="${phone}"></c:out><br>
           Пол: &nbsp;&nbsp;<c:out value="${sex}"></c:out><br>
           Деятельность: &nbsp;&nbsp;<c:out value="${category}"></c:out><br><br>
           <a class="btn btn-info "  href="myvacancies" >Мои вакансии</a>
           
         </div>
        <h1 style="color:white; text-align:center; font-size: 30px;"><c:out value="${success}"></c:out><br></h1>
         <form action="createTask" method="get">
         <h1 style="text-align:center; color: #b9f747; margin-bottom: 30px;">Добавление вакансии:</h1>
         <div style="margin-left:10%;" class="form-group">
         <input style="width: 413px;" type="text" placeholder="Заголовок" name="preview" required>
         </div>
         <div style="margin-left:10%;"class="form-group">
         <textarea style="float: bottom;" name="area" rows="8" cols="40" placeholder=" Введите описание вакансии" required ></textarea>
         </div>
         <div style="margin-left:10%;"class="form-group">
         <input class="btn btn-info" type="submit" name="sub" value="Добавить вакансию">
         </div>
         </form>
         
    			</div>
            </div>

<%@ include file="footer.jsp"%>