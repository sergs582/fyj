package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class categories {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_category")
	private int id_category;
	
	@Column(name="namecat", length=100, nullable=false)
	private String namecat;
	
	
	
	
	
	public categories(int id_category, String namecat) {
		this.id_category = id_category;
		this.namecat = namecat;
	}
	public categories() {
	
	}
	
	
	
	public categories(String namecat) {
		super();
		this.namecat = namecat;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_category;
		result = prime * result + ((namecat == null) ? 0 : namecat.hashCode());
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
		categories other = (categories) obj;
		if (id_category != other.id_category)
			return false;
		if (namecat == null) {
			if (other.namecat != null)
				return false;
		} else if (!namecat.equals(other.namecat))
			return false;
		return true;
	}
	public int getId_category() {
		return id_category;
	}
	public void setId_category(int id_category) {
		this.id_category = id_category;
	}
	public String getNamecat() {
		return namecat;
	}
	public void setNamecat(String namecat) {
		this.namecat = namecat;
	}
	@Override
	public String toString() {
		return "categories [id_category=" + id_category + ", namecat=" + namecat + "]";
	}
	
	
	
	
	
	

}
