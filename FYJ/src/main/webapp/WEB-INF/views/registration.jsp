<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<%@ include file="menu.jsp"%>


        
        <title>Регистрация||FindYJob</title>
        <body>
        
        
        <div id = "info">
            <form action="one" method="get" onsubmit="return main(this)">
            <br>
            <center><h1>Регистрация</h1></center>
                <table cellspacing="10" align="center" >
                <br>
                
                           
                       
                    
                    <tr >
                        <td>
                            <label>Введите логин : &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;</label>
                            <input type = "text" name="login" placeholder="логин" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label> Придумайте пароль: &nbsp;&nbsp;&nbsp;</label>
                            <input type = "password" name="password" placeholder="пароль" required>
                        </td>
                    </tr>
                    <tr>
                        <td >
                            <label> Повторите пароль: &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;</label>
                            <input type = "password" name="RepeatPassword" placeholder="повторите пароль" required>
                        </td>
                    </tr>
                    <tr >
                        <td>
                            <label>Введите имя: &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp; </label>
                            <input type = "text" name="name" placeholder="Имя " required>
                        </td>
                    </tr>
                    <tr >
                        <td>
                            <label>Введите  фамилию: &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;
                            
                             </label>
                            <input type = "text" name="secname" placeholder="Фамилия" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label> Введите e-mail:&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                            <input type = "email" name="email" placeholder="e-mail" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Пол:&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                            <input type="radio" name="sex" value="мужской">Мужской&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="radio" name="sex" value="женский">Женский
                        </td>
                        
                    </tr>
                    
                    <tr>
                        <td>
                           <label>Страна:&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                            <select name="country">
                                <option value="">--</option>
                                <option value="Belarus">Беларусь</option>
                                <option value="Russia">Россия</option>
                                <option value="Ukraine">Украина</option>
                                <option value="USA">Америка</option>
                                <option value="Germany">Германия</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>Номер телефона:&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;</label>
                            <input type="tel" name="phone"  placeholder="Номер телефона" required>
                            
                        </td>
                    </tr>
                    <tr>
                        <td>
                           <label>Вид деятельности:</label>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>
                            
                            <input type="radio" name ="check" value="услуги по дому"/>Услуги по дому<br>
                             <input type="radio" name ="check" value="программирование"/>Программирование<br>
                             <input type="radio" name ="check" value="разработка сайтов"/>Разработка сайтов<br>
                             <input type="radio" name ="check" value="фотография"/>Фотография<br>
                             <input type="radio" name ="check" value="ремонт авто"/>Ремонт Авто<br>
                            <input type="radio" name ="check" value="бухгалтер"/>Бухгалтер<br>
                            <input type="radio" name ="check" value="ремонт электроники"/>Ремонт электроники<br>
                            <input type="radio" name ="check" value="переводы"/>Переводы<br>
                            <input type="radio" name ="check" value="дизйн"/>Дизайн<br>
                            <input type="radio" name ="check" value="копирайтинг"/>Копирайтинг<br>
                            <input type="radio" name ="check" value="other"  onchange="ChangeArea(this)" />Другое<br>
                            <textarea name = "area"   rows="8" cols="40" placeholder="Введите ваш вид деятельности" disabled></textarea> 
                        </td>
                    </tr>
                    
                    
                    
                    
                    
                    <td>
                        <input class="btn btn-info" type ="submit" name="sub" value="Зарегистрироваться">
                    </td>
                </table>
            </form></div>
            
             <%@ include file="footer.jsp"%>