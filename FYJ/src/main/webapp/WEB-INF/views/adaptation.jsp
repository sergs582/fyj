<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

    
    <script>
function openNav() {
    document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
    document.getElementById("mySidenav").style.width = "0";
}
</script>

 <span class= "openbutt" style="font-size:30px;cursor:pointer; float: left; margin-left: 15px; margin-top: 20px;" onclick="openNav()"><img src="resources/images/nav.png" width="50" height="50" ></span>   
          <div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  
  
  
  
   <c:set var="logged" value="${id_user}"/>
   
     <c:choose>
     <c:when test = "${logged>0}"> 
     <div style="margin-top: 25px; margin-left:15px; font-size:25px; ">Добро пожаловать, <a style="color:black;"href="signin"><c:out value="${name}"></c:out>!</a>
     <a style="color:black;"href="logout">Выйти</a>
     </div> 
      </c:when>
    
      <c:otherwise>
            
            
          
             <form action="next" method="POST" onsubmit="return main2(this)">
  <input style="margin-left: 20px; margin-bottom:10px;" type="text" placeholder="Логин" name="login">
  <input style="margin-left: 20px;" type="password" placeholder="Пароль" name="password">
   
   <input style="margin-right:25px; height: 38px;" class="btn btn-success" type ="submit" name="sub2" value="Войти">
   <a class="btn btn-success" style="height: 38px; float: left; margin-left: 20px; color: #fff;"  href="registration" >Регистрация</a>
   </form>
            
         </c:otherwise>
      </c:choose>
 
 <h1 style="margin-top:20px;">Категории</h1>
   <a class= " adaptbutt" href="codding">Программирование</a>
  <a class= " adaptbutt" href="homework">Услуги по дому</a>

    <a class= " adaptbutt" href="webdev">Разработка сайтов</a>
   
   <a class= " adaptbutt" href="photo">Фотография</a>
    <a class= " adaptbutt" href="autoservice">Ремонт авто</a>
    <a class= " adaptbutt" href="buhalter">Бухгалтер</a>
    <a class= " adaptbutt" href="phoneservice">Ремонт электроники</a>
   <a class= " adaptbutt" href="translations">Переводы</a>
    <a class= " adaptbutt" href="design">Дизайн</a>
    <a class= " adaptbutt" href="copywriting">Копирайтинг</a>
    <a class= " adaptbutt" href="other">Другое</a>

</div>