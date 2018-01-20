package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tasks")
public class tasks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_task")
	private int id_task;
	
	@Column(name="preview", length=40, nullable=false)
	private String preview;
	
	@Column(name="task", length=1000, nullable=false)
	private String task;
	
	@Column(name="status")
	private int status;
	
	@Column(name="id_user")
	private int id_user;
	
	@Column(name="id_category")
	private int id_category;
	
	
	public tasks(int id_task, String preview, String task, int status, int id_user, int id_category) {
		
		this.id_task = id_task;
		this.preview = preview;
		this.task = task;
		this.status = status;
		this.id_user = id_user;
		this.id_category = id_category;
	}
	
	
	
	
	
	public tasks(int id_task, int status) {
		
		this.id_task = id_task;
		this.status = status;
	}





	public tasks(String preview, String task, int status, int id_user, int id_category) {
		super();
		this.preview = preview;
		this.task = task;
		this.status = status;
		this.id_user = id_user;
		this.id_category = id_category;
	}





	public tasks() {
		
	}
	public int getId_task() {
		return id_task;
	}
	public void setId_task(int id_task) {
		this.id_task = id_task;
	}
	public String getPreview() {
		return preview;
	}
	public void setPreview(String preview) {
		this.preview = preview;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
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
		result = prime * result + id_category;
		result = prime * result + id_task;
		result = prime * result + id_user;
		result = prime * result + ((preview == null) ? 0 : preview.hashCode());
		result = prime * result + status;
		result = prime * result + ((task == null) ? 0 : task.hashCode());
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
		tasks other = (tasks) obj;
		if (id_category != other.id_category)
			return false;
		if (id_task != other.id_task)
			return false;
		if (id_user != other.id_user)
			return false;
		if (preview == null) {
			if (other.preview != null)
				return false;
		} else if (!preview.equals(other.preview))
			return false;
		if (status != other.status)
			return false;
		if (task == null) {
			if (other.task != null)
				return false;
		} else if (!task.equals(other.task))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "tasks [id_task=" + id_task + ", preview=" + preview + ", task=" + task + ", status=" + status
				+ ", id_user=" + id_user + ", id_category=" + id_category + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
