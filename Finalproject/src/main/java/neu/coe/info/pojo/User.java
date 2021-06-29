package neu.coe.info.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usertable")
public class User {
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", newPlan="
				+ newPlan + "]";
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="USERID", unique = true, nullable= false)
	private int userid;
	
	@Column (name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	
	@OneToMany(mappedBy="user", cascade = CascadeType.ALL)
	private List<RegisterPlan> newPlan;
	
	
	
	
	public User(){
		
	}



	public int getUserid() {
		return userid;
	}



	public void setUserid(int userid) {
		this.userid = userid;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	


	public List<RegisterPlan> getNewPlan() {
		return newPlan;
	}

	public void setNewPlan(List<RegisterPlan> newPlan) {
		this.newPlan = newPlan;
	}

	
}
