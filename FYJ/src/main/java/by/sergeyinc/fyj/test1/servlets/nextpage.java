package by.sergeyinc.fyj.test1.servlets;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import dao.DaoTasks;
import dao.DaoUsers;
import entity.tasks;
import entity.users;

public class nextpage {
	
	
	public  void nextpagee(int id, HttpServletRequest request, Model model) {
		
		
		
		
		
	
	Integer i = Integer.valueOf(request.getParameter("sub"));
	int i0 =i+1;
	int i1 =i+2;
	int i2 =i+3;
	int i3 =i+4;
	DaoTasks dt = new DaoTasks();
	List <tasks> list = dt.getAllByRequest("FROM tasks where id_category='"+id+"' and status ='1'");
	System.out.println(list.size());

	if(i0<list.size()) {

		model.addAttribute("preview0", list.get(i0).getPreview());
		model.addAttribute("task0", list.get(i0).getTask());
		DaoUsers du = new DaoUsers();
		List <users> list0 = du.getAllByRequest("FROM users WHERE id_user='"+list.get(i0).getId_user()+"'");
	    model.addAttribute("name0", list0.get(0).getName());
	    model.addAttribute("phone0", list0.get(0).getPhone());
	    model.addAttribute("email0", list0.get(0).getEmail());
	    model.addAttribute("country0", list0.get(0).getCountry());
		
		if(i1<list.size()) {
			model.addAttribute("preview1", list.get(i1).getPreview());
			model.addAttribute("task1", list.get(i1).getTask());
			List <users> list1 = du.getAllByRequest("FROM users WHERE id_user='"+list.get(i1).getId_user()+"'");
			  model.addAttribute("name1", list1.get(0).getName());
			    model.addAttribute("phone1", list1.get(0).getPhone());
			    model.addAttribute("email1", list1.get(0).getEmail());
			    model.addAttribute("country1", list1.get(0).getCountry());
			    System.out.println(list.size());
			    System.out.println(i2+ " "+ i3);
			if(i2<list.size()) {

				model.addAttribute("preview2", list.get(i2).getPreview());
				model.addAttribute("task2", list.get(i2).getTask());
				List <users> list2 = du.getAllByRequest("FROM users WHERE id_user='"+list.get(i2).getId_user()+"'");
				  model.addAttribute("name2", list2.get(0).getName());
				    model.addAttribute("phone2", list2.get(0).getPhone());
				    model.addAttribute("email2", list2.get(0).getEmail());
				    model.addAttribute("country2", list2.get(0).getCountry());

			if(i3<list.size()) {
				model.addAttribute("preview3", list.get(i3).getPreview());
				model.addAttribute("task3", list.get(i3).getTask());

				List <users> list3 = du.getAllByRequest("FROM users WHERE id_user='"+list.get(i3).getId_user()+"'");
				  model.addAttribute("name3", list3.get(0).getName());
				    model.addAttribute("phone3", list3.get(0).getPhone());
				    model.addAttribute("email3", list3.get(0).getEmail());
				    model.addAttribute("country3", list3.get(0).getCountry());
				
				
				
			}
			
			}
			}
			
		}
		

	
		
	if(i3>=list.size()&&i2>=list.size()&&i1>=list.size()&&i0>=list.size()) {
		
		model.addAttribute("task3", "Здесь могла бы быть выша вакансия!");
		model.addAttribute("task2", "Здесь могла бы быть выша вакансия!");
		
		model.addAttribute("task1", "Здесь могла бы быть выша вакансия!");
		model.addAttribute("task0", "Здесь могла бы быть выша вакансия!");
		 model.addAttribute("nextcheck",0 );
		
		}
	
if(i3>=list.size()&&i2>=list.size()&&i1>=list.size()) {
		
		model.addAttribute("task3", "Здесь могла бы быть выша вакансия!");
		model.addAttribute("task2", "Здесь могла бы быть выша вакансия!");
		
		model.addAttribute("task1", "Здесь могла бы быть выша вакансия!");
		model.addAttribute("nextcheck",0 );
		
		}
	
if(i3>=list.size()&&i2>=list.size()) {

model.addAttribute("task3", "Здесь могла бы быть выша вакансия!");
model.addAttribute("task2", "Здесь могла бы быть выша вакансия!");

model.addAttribute("nextcheck",0 );

}
if(i3>=list.size()) {

model.addAttribute("task3", "Здесь могла бы быть выша вакансия!");
model.addAttribute("nextcheck",0 );



}
	
	
	
	
	model.addAttribute("i3", i3);
	
	
	
	
	
	System.out.println(i);
	
	}
	
}
