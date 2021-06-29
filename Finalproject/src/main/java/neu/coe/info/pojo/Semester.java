package neu.coe.info.pojo;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="semestersql")
public class Semester {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="semesterID", unique=true, nullable=false)
	private int semesterid;
	
	@Column(name="semesterName")
	private String semestername;
	
	
	@OneToMany(mappedBy="semester",  cascade=CascadeType.ALL)
	//@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name="semester_link",nullable=false)
	private List<Course> courseList;     
	

	@Override
	public String toString() {
		return "Semester [semesterid=" + semesterid + ", semestername=" + semestername + ", courseList=" + courseList
				+ "]";
	}

	public Semester(){
		
	}

	public int getSemesterid() {
		return semesterid;
	}

	public void setSemesterid(int semesterid) {
		this.semesterid = semesterid;
	}	

	public String getSemestername() {
		return semestername;
	}

	public void setSemestername(String semestername) {
		this.semestername = semestername;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
}