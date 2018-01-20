

function main2(ob){
	console.log("это работает");
	if(!(LogCheck(ob)&&PassCheck(ob))){
		return false;
		
	}
	return true;
	
 }
 
 function LogCheck(ob){
	 var login = ob.login.value;
		if(login==""){
			alert("Логин введен неверно! ");
			return false;
		}
		return true;
	
 }
 
 
function PassCheck(ob){
	 
	 var password = ob.password.value;
		
		if(!/^(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$/.test(password)){
			alert("Пароль введен неверно!");
			return false;
		}return true;
 }






function main(ob){
	if(!(testLogin(ob)&&testPassword(ob)&&SelectCountry(ob)&&testCheck(ob))){
		return false;
		
	}
	return true;
	
}
function testLogin(ob){
    var login = ob.login.value;
	if(!/^.{5,15}$/.test(login)){
		alert("Логин должен состоять из 5-15 символов!   ");
		return false;
	}
	return true;
}


function testPassword(ob){
    var password = ob.password.value;
	var repeatPassword = ob.RepeatPassword.value;
	if(!/^(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$/.test(password)){
		alert("Ваш пароль должен состоять минимум из 8 символов и содержать:"+ "\n"+ "• Минимум 1 заглавную букву"+ "\n"+ "• Минимум 1 цифру");
		return false;
	}
	if(password != repeatPassword){
		alert("Ваши пароли не совпадают!");
		return false;
	}
	return true;
}
 function testCheck(ob){
     var chec = ob.check;
     for( var i = 0; i < chec.length; i++){
         if(chec[i].checked){
             return true;   
         }
     }
     alert("Выберите ваш вид деятельности или введите его вручную в поле 'Другое' ");
     return false;
     }


function ChangeArea(ob){
    if(ob.checked){
        ob.form.area.disabled = false;
    }else{
        ob.form.area.value = "";
        ob.form.area.disabled = true;
    }
}
 function SelectCountry(ob){
  if(ob.country.value == ""){
		alert("Выберите страну");
		return false;
	}
	return true;
 }
 
 
 
 
 
 
 



