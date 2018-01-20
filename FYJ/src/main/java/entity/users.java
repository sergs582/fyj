package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_user")
	private int id_user;
	
	@Column(name="login", length=20, nullable=false, unique=true)
	private String login;
	
	@Column(name="password", length=30, nullable=false)
	private String password;
	
	@Column(name="email", length=40, nullable=false)
	private String email;
	
	@Column(name="phone", length=15, nullable=false)
	private String phone;
	
	@Column(name="country", length=10, nullable=false)
	private String country;
	
	@Column(name="name", length=15, nullable=false)
	private String name;
	
	@Column(name="secname", length=20, nullable=false)
	private String secname;
	
	@Column(name="sex", length=10, nullable=false)
	private String sex;
	
	@Column(name="role")
	private int role;
	
	@Column(name="id_category")
	private int id_category;
	
	
	public users(int id_user, String login, String password, String email, String phone, String country, String name,
			String secname, String sex, int role, int id_category) {
		
		this.id_user = id_user;
		this.login = login;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.country = country;
		this.name = name;
		this.secname = secname;
		this.sex = sex;
		this.role = role;
		this.id_category = id_category;
	}
	
	
	
	public users(String login, String password, String email, String phone, String country, String name, String secname,
			String sex, int role, int id_category) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.country = country;
		this.name = name;
		this.secname = secname;
		this.sex = sex;
		this.role = role;
		this.id_category = id_category;
	}



	public users() {
	
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSecname() {
		return secname;
	}
	public void setSecname(String secname) {
		this.secname = secname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public int getId_category() {
		return id_category;
	}
	public void setId_category(int id_category) {
		this.id_category = id_category;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id_category;
		result = prime * result + id_user;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + role;
		result = prime * result + ((secname == null) ? 0 : secname.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		users other = (users) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id_category != other.id_category)
			return false;
		if (id_user != other.id_user)
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (role != other.role)
			return false;
		if (secname == null) {
			if (other.secname != null)
				return false;
		} else if (!secname.equals(other.secname))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "users [id_user=" + id_user + ", login=" + login + ", password=" + password + ", email=" + email
				+ ", phone=" + phone + ", country=" + country + ", name=" + name + ", secname=" + secname + ", sex="
				+ sex + ", role=" + role + ", id_category=" + id_category + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
