<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
.category-wrap {
  padding: 15px;
  background:#b9f747 ;
  width: 250px;
  height: 100%;
  box-shadow: 2px 2px 8px rgba(0,0,0,.1);
  font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
}
.category-wrap h3 {
  font-size: 16px;
  color: rgba(0,0,0,.6);
  margin: 0 0 10px;
  padding: 0 5px;
  position: relative;
}
.category-wrap h3:after {
  content: "";
  width: 6px;
  height: 6px;
  background: #80C8A0;
  position: absolute;
  right: 5px;
  bottom: 2px;
  box-shadow: -8px -8px #80C8A0, 0 -8px #80C8A0, -8px 0 #80C8A0;
}
.category-wrap ul {
  list-style: none;
  margin: 0;
  padding: 0; 
  border-top: 1px solid rgba(0,0,0,.3);
}
.category-wrap li {margin: 12px 0 0 0px;}
.category-wrap a {
  text-decoration: none;
  display: block;  
  font-size: 15px;
  color: rgba(0,0,0,.6);
  padding: 5px;
  position: relative;
  transition: .3s linear;
}
.category-wrap a:after {
 
  font-family: FontAwesome;
  position: absolute;
  right: 5px;
  color: white;
  transition: .2s linear;
}
.category-wrap a:hover {
  background: #80C8A0;
  color:#705a41;
}
</style>
 <div id = "menu">
 <div class="category-wrap">
  <h3>Категории</h3>
  <ul>
    <li><a href="homework">Услуги по дому</a></li>
    <li><a href="codding">Программирование</a></li>
    <li><a href="webdev">Разработка сайтов</a></li>
    
    <li><a href="photo">Фотография</a></li>
    <li><a href="autoservice">Ремонт авто</a></li>
    <li><a href="buhalter">Бухгалтер</a></li>
    <li><a href="phoneservice">Ремонт электроники</a></li>
    <li><a href="translations">Переводы</a></li>
    <li><a href="design">Дизайн</a></li>
    <li><a href="copywriting">Копирайтинг</a></li>
    <li><a href="other">Другое</a></li>
  </ul>
</div>
</div>

 