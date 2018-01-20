package by.sergeyinc.fyj.test1.servlets;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

import dao.DaoCategories;
import dao.DaoTasks;
import dao.DaoUsers;
import entity.categories;
import entity.tasks;
import entity.users;

@Controller
public class IndexController {
	
	private static SessionFactory factory;

	@RequestMapping(value="/")
	public String IndexPage() {
		return "index";
	}
	
	@RequestMapping(value="/registration")
	public String registration() {
	
		return "registration";
	}
	public String firstUpperCase(String word){
		if(word == null || word.isEmpty()) return "";//или return word;
		return word.substring(0, 1).toUpperCase() + word.substring(1);
	}
	
	
	@RequestMapping(value="/createTask")
	public String addvacancy(Model model, HttpServletRequest request, HttpSession session ) {
		
		
		int id_user = (int) session.getAttribute("id_user");
		int id_category = (int) session.getAttribute("id_category");
		DaoTasks dt = new DaoTasks();
		String preview = request.getParameter("preview");
		String task = request.getParameter("area");
		dt.insert(new tasks(preview, task, 1, id_user, id_category ));
		model.addAttribute("success", "успешно добавлено");
		
		model.addAttribute("id_user", (int)session.getAttribute("id_user"));
		
		
		model.addAttribute("name", firstUpperCase(String.valueOf(session.getAttribute("name"))));
		model.addAttribute("email", firstUpperCase(String.valueOf(session.getAttribute("email"))));
		model.addAttribute("country", firstUpperCase(String.valueOf(session.getAttribute("country"))));
		model.addAttribute("phone", firstUpperCase(String.valueOf(session.getAttribute("phone"))));
		model.addAttribute("sex", firstUpperCase(String.valueOf(session.getAttribute("sex"))));
		model.addAttribute("secname", firstUpperCase(String.valueOf(session.getAttribute("secname"))));
		model.addAttribute("category", firstUpperCase(String.valueOf(session.getAttribute("category"))));
		
		
		return "clientcabinet";
		
	}
	
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/next")
	public String signin(Model model, Model m2, HttpServletRequest request, HttpSession session ) {
		DaoUsers du = new DaoUsers();
		DaoCategories dc = new DaoCategories();
		
		
	try {
	 
		List <users> list = du.getAllByRequest("FROM users where login='"+request.getParameter("login")+"' and password ='"+ request.getParameter("password")+"'");
		int category = list.get(0).getId_category();
		
		List <categories> list2 = dc.getAllByRequest("FROM categories where id_category='"+category+"'");
	
		if(!(list.size()==0)) {
			
			session.setAttribute("id_user",list.get(0).getId_user());
			session.setAttribute("id_category", category);
			session.setAttribute("name", list.get(0).getName());
			session.setAttribute("email", list.get(0).getEmail());
			session.setAttribute("country", list.get(0).getCountry());
			session.setAttribute("phone", list.get(0).getPhone());
			session.setAttribute("sex", list.get(0).getSex());
			session.setAttribute("secname", list.get(0).getSecname());
			session.setAttribute("category", list2.get(0).getNamecat());
			
			
			
			
			model.addAttribute("id_user",(int)session.getAttribute("id_user"));
			
			model.addAttribute("name", firstUpperCase(String.valueOf(session.getAttribute("name"))));
			model.addAttribute("email", firstUpperCase(String.valueOf(session.getAttribute("email"))));
			model.addAttribute("country", firstUpperCase(String.valueOf(session.getAttribute("country"))));
			model.addAttribute("phone", firstUpperCase(String.valueOf(session.getAttribute("phone"))));
			model.addAttribute("sex", firstUpperCase(String.valueOf(session.getAttribute("sex"))));
			model.addAttribute("secname", firstUpperCase(String.valueOf(session.getAttribute("secname"))));
			model.addAttribute("category", firstUpperCase(String.valueOf(session.getAttribute("category"))));
			
			
			
		
			
			
			
			
			
			return "clientcabinet";
		}
		
	}catch(IndexOutOfBoundsException e0) {
		return "index";
	}
		
		return "wrongpsw";
	}
	
	
	@RequestMapping(value="/signin")
	public String signin2(Model model, Model m2, HttpServletRequest request, HttpSession session ) {
		
		
		model.addAttribute("id_user",(int)session.getAttribute("id_user"));
		
		model.addAttribute("name", firstUpperCase(String.valueOf(session.getAttribute("name"))));
		model.addAttribute("email", firstUpperCase(String.valueOf(session.getAttribute("email"))));
		model.addAttribute("country", firstUpperCase(String.valueOf(session.getAttribute("country"))));
		model.addAttribute("phone", firstUpperCase(String.valueOf(session.getAttribute("phone"))));
		model.addAttribute("sex", firstUpperCase(String.valueOf(session.getAttribute("sex"))));
		model.addAttribute("secname", firstUpperCase(String.valueOf(session.getAttribute("secname"))));
		model.addAttribute("category", firstUpperCase(String.valueOf(session.getAttribute("category"))));
		return "clientcabinet";
	
	}
	
	@RequestMapping(value="/logout")
	public String logout(Model model, Model m2, HttpServletRequest request, HttpSession session ) {
		
		session.invalidate();
		return "index";
	
	}
	
	
	
	@RequestMapping(value="/index")
	public String IndexPage2() {
		return "index";
	}
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/one")
	public String REGA(HttpServletRequest request) {
		String login = 	request.getParameter("login");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String country = request.getParameter("country");
		String name = request.getParameter("name");
		String secname = request.getParameter("secname");
		String sex = request.getParameter("sex");
		
		DaoUsers du = new DaoUsers();
		DaoCategories dc = new DaoCategories();
		String category = request.getParameter("check");
		List <users> list = du.getAllByRequest("FROM users where login='"+login+"' and phone ='"+ request.getParameter("phone")+"'");
		if(category.equals("other")) {
			dc.insert(new categories(request.getParameter("area")));
			category = request.getParameter("area");
		}
		
		System.out.println(request.getParameter("area"));
		List <categories> list2 = dc.getAllByRequest("FROM categories where namecat='"+category+"'");
	int id_category = list2.get(0).getId_category();
		if(list.size()==0) {
		du.insert(new users(login, password, email, phone, country, name, secname, sex, 1, id_category));
			return "index";
		} return "accessdenied";
		
	}
	
	
	@RequestMapping(value="/homework")
	public String HomeWork(HttpServletRequest request, Model model) {
		
		newpage np = new newpage();
		
		np.newpagee(1, request, model);
			
			
		
		return "homework";
		
	}
	
	
	
	@RequestMapping(value="/nextpage")
	public String NextPage(HttpServletRequest request, Model model) {
		
		
		
		nextpage np = new nextpage();
		
		np.nextpagee(1, request, model);
		
		
		return "homework";
		
		
		
		
		
	}
	
	
	
	
	
	
	@RequestMapping(value="/codding")
	public String Codding(HttpServletRequest request, Model model) {
newpage np = new newpage();
		
		np.newpagee(2, request, model);
		
		return "codding";
		
	}
	
	
	@RequestMapping(value="/nextpagec")
	public String NextPageCod(HttpServletRequest request, Model model) {
		
	nextpage np = new nextpage();
	
	np.nextpagee(2, request, model);
		
		return "codding";
		
		
		
		
		
	}
	
	
	
	
	@RequestMapping(value="/webdev")
	public String Webdev(HttpServletRequest request, Model model) {
		
newpage np = new newpage();
		
		np.newpagee(3, request, model);
		
		
		return "webdev";
		
	}
	
	
	@RequestMapping(value="/nextpagew")
	public String NextPageWeb(HttpServletRequest request, Model model) {
		
	nextpage np = new nextpage();
	
	np.nextpagee(3, request, model);
		
		return "webdev";
		
		
		
		
		
	}
	
	@RequestMapping(value="/prevpagew")
	public String PrevPageWeb(HttpServletRequest request, Model model) {
		
	prevpage pp = new prevpage();
	
	pp.prevpagee(3, request, model);
		
		return "webdev";
	
	}
	

	@RequestMapping(value="/prevpage")
	public String PrevPage(HttpServletRequest request, Model model) {
		
	prevpage pp = new prevpage();
	
	pp.prevpagee(1, request, model);
		
		return "homework";
	
	}
	

	@RequestMapping(value="/prevpagec")
	public String PrevPageCod(HttpServletRequest request, Model model) {
		
	prevpage pp = new prevpage();
	
	pp.prevpagee(2, request, model);
		
		return "codding";
	
	}
	
	
	
	
	
	@RequestMapping(value="/photo")
	public String Photo(HttpServletRequest request, Model model) {
		
	newpage np = new newpage();
	
	np.newpagee(4, request, model);
		
		return "photo";
	
	}
	
	
	
	@RequestMapping(value="/nextpagep")
	public String NextPagePhoto(HttpServletRequest request, Model model) {
		
	nextpage np = new nextpage();
	
	np.nextpagee(4, request, model);
		
		return "photo";
		
		
		
		
		
	}
	
	@RequestMapping(value="/prevpagep")
	public String PrevPagePhoto(HttpServletRequest request, Model model) {
		
	prevpage pp = new prevpage();
	
	pp.prevpagee(4, request, model);
		
		return "photo";
	
	}
	
	
	
	
	@RequestMapping(value="/autoservice")
	public String Auto(HttpServletRequest request, Model model) {
		
	newpage np = new newpage();
	
	np.newpagee(5, request, model);
		
		return "autoservice";
	
	}
	
	
	
	@RequestMapping(value="/nextpageau")
	public String NextPageAuto(HttpServletRequest request, Model model) {
		
	nextpage np = new nextpage();
	
	np.nextpagee(5, request, model);
		
		return "autoservice";
		
		
		
		
		
	}
	
	@RequestMapping(value="/prevpageau")
	public String PrevPageAuto(HttpServletRequest request, Model model) {
		
	prevpage pp = new prevpage();
	
	pp.prevpagee(5, request, model);
		
		return "autoservice";
	
	}
	
	
	
	
	
	
	@RequestMapping(value="/buhalter")
	public String Buhalter(HttpServletRequest request, Model model) {
		
	newpage np = new newpage();
	
	np.newpagee(6, request, model);
		
		return "buhalter";
	
	}
	
	
	
	@RequestMapping(value="/nextpageb")
	public String NextPageBuh(HttpServletRequest request, Model model) {
		
	nextpage np = new nextpage();
	
	np.nextpagee(6, request, model);
		
		return "buhalter";
		
		
		
		
		
	}
	
	@RequestMapping(value="/prevpageb")
	public String PrevPageBuh(HttpServletRequest request, Model model) {
		
	prevpage pp = new prevpage();
	
	pp.prevpagee(6, request, model);
		
		return "buhalter";
	
	}
	
	
	
	
	
	@RequestMapping(value="/phoneservice")
	public String Service(HttpServletRequest request, Model model) {
		
	newpage np = new newpage();
	
	np.newpagee(7, request, model);
		
		return "phoneservice";
	
	}
	
	
	
	@RequestMapping(value="/nextpageserv")
	public String NextPageServ(HttpServletRequest request, Model model) {
		
	nextpage np = new nextpage();
	
	np.nextpagee(7, request, model);
		
		return "phoneservice";
		
		
		
		
		
	}
	
	@RequestMapping(value="/prevpageserv")
	public String PrevPageServ(HttpServletRequest request, Model model) {
		
	prevpage pp = new prevpage();
	
	pp.prevpagee(7, request, model);
		
		return "phoneservice";
	
	}
	
	
	
	
	
	@RequestMapping(value="/translations")
	public String Trans(HttpServletRequest request, Model model) {
		
	newpage np = new newpage();
	
	np.newpagee(8, request, model);
		
		return "translations";
	
	}
	
	
	
	@RequestMapping(value="/nextpaget")
	public String NextPageTrans(HttpServletRequest request, Model model) {
		
	nextpage np = new nextpage();
	
	np.nextpagee(8, request, model);
		
		return "translations";
		
		
		
		
		
	}
	
	@RequestMapping(value="/prevpaget")
	public String PrevPageTrans(HttpServletRequest request, Model model) {
		
	prevpage pp = new prevpage();
	
	pp.prevpagee(8, request, model);
		
		return "translations";
	
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value="/design")
	public String Design(HttpServletRequest request, Model model) {
		
	newpage np = new newpage();
	
	np.newpagee(9, request, model);
		
		return "design";
	
	}
	
	
	
	@RequestMapping(value="/nextpaged")
	public String NextPageDesign(HttpServletRequest request, Model model) {
		
	nextpage np = new nextpage();
	
	np.nextpagee(9, request, model);
		
		return "design";
		
		
		
		
		
	}
	
	@RequestMapping(value="/prevpaged")
	public String PrevPageDesign(HttpServletRequest request, Model model) {
		
	prevpage pp = new prevpage();
	
	pp.prevpagee(9, request, model);
		
		return "design";
	
	}
	
	
	
	
	
	
	
	@RequestMapping(value="/copywriting")
	public String Copy(HttpServletRequest request, Model model) {
		
	newpage np = new newpage();
	
	np.newpagee(10, request, model);
		
		return "copywriting";
	
	}
	
	
	
	@RequestMapping(value="/nextpagecc")
	public String NextPageCopy(HttpServletRequest request, Model model) {
		
	nextpage np = new nextpage();
	
	np.nextpagee(10, request, model);
		
		return "copywriting";
		
		
		
		
		
	}
	
	@RequestMapping(value="/prevpagecc")
	public String PrevPageCopy(HttpServletRequest request, Model model) {
		
	prevpage pp = new prevpage();
	
	pp.prevpagee(10, request, model);
		
		return "copywriting";
	
	}
	
	
	
	
	

	@RequestMapping(value="/other")
	public String other(HttpServletRequest request, Model model) {
		
	forothers fo = new forothers();
	
	
	fo.newpagee( request, model);
		
		return "other";
	
	}
	
	
	
	@RequestMapping(value="/nextpageoth")
	public String NextPageOthers(HttpServletRequest request, Model model) {
		
	forothers fo = new forothers();
	
	
	fo.nextpagee( request, model);
		
		return "other";
	
	}
	
	@RequestMapping(value="/prevpageoth")
	public String PrevPageOthers(HttpServletRequest request, Model model) {
		
	forothers fo = new forothers();
	
	
	fo.prevpagee( request, model);
		
		return "other";
	
	}
	

	@RequestMapping(value="/myvacancies")
	public String myvacancies(HttpSession session,HttpServletRequest request, Model model) {
	myvacancies mv = new myvacancies();
	
	mv.newpagee((int)session.getAttribute("id_user"), request, model);
	
	
	
	
	
	return "myvacancies";
	
	
	
	}
	
	
	
	@RequestMapping(value="/nextpagemv")
	public String NextPageMv(HttpSession session,HttpServletRequest request, Model model) {
		
		myvacancies mv = new myvacancies();
		
		mv.nextpagee((int)session.getAttribute("id_user"), request, model);
		
		
		
		
		
		return "myvacancies";
		
	
	}
	
	@RequestMapping(value="/prevpagemv")
	public String PrevPageMv(HttpSession session,HttpServletRequest request, Model model) {
		

		myvacancies mv = new myvacancies();
		
		mv.prevpagee((int)session.getAttribute("id_user"), request, model);
		
		
		
		
		
		return "myvacancies";
		
	
	}
	
	

	@RequestMapping(value="/delete")
	public String delete(HttpSession session,HttpServletRequest request, Model model) {
		
		int id = (int)Integer.valueOf(request.getParameter("id"));
		
		DaoTasks dt = new DaoTasks();
		

	tasks task = (tasks) dt.get(id);
		task.setStatus(0);
	dt.update(task);
		
		myvacancies mv = new myvacancies();
		
		mv.newpagee((int)session.getAttribute("id_user"), request, model);
		
		
		return "myvacancies";
		
	}
	
	
	
	
}
