package neu.coe.info.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="plansql")
public class RegisterPlan {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="planID", unique = true, nullable = false)
	private int planid;
	
	@Column(name="planName")
	private String planname;

	
	@ManyToOne
	@JoinColumn(name = "userID")
	private User user;
	
	@OneToMany()
	@JoinColumn(name = "plan_link")
	private List<Course> regcourse;
	

	
	@Override
	public String toString() {
		return "RegisterPlan [planid=" + planid + ", planname=" + planname + ", user=" + user + ", regcourse="
				+ regcourse + "]";
	}



	public RegisterPlan(){
		
	}



	public String getPlanname() {
		return planname;
	}



	public void setPlanname(String planname) {
		this.planname = planname;
	}



	public int getPlanid() {
		return planid;
	}



	public void setPlanid(int planid) {
		this.planid = planid;
	}



	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}



	public List<Course> getRegcourse() {
		return regcourse;
	}



	public void setRegcourse(List<Course> regcourse) {
		this.regcourse = regcourse;
	}
	
}
