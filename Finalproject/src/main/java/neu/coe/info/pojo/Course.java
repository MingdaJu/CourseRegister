package neu.coe.info.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="coursesql")
public class Course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="courseID", unique = true, nullable = false)
	
	private int courseid;
	
	@Column (name="courseName")
	private String coursename;

	
	@Column (name="CREDIT")
	private String credit;
	
	@Column (name="PROFESSOR")
	private String professor;
	
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursename=" + coursename + ", credit=" + credit + ", professor="
				+ professor + ", location=" + location + ", crn=" + crn + ", semester=" + semester + "]";
	}

	@Column (name="LOCATION")
	private String location;
	
	@Column (name="CRN")
	private String crn;
	

	
	@ManyToOne
	@JoinColumn(name = "semester_link",updatable=false)
	private Semester semester; 
	


	public Course(){
		
	}
	


	public Semester getSemester() {
		return semester;
	}



	public void setSemester(Semester semester) {
		this.semester = semester;
	}



	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	

	public String getCredit() {
		return credit;
	}



	public void setCredit(String credit) {
		this.credit = credit;
	}



	public String getProfessor() {
		return professor;
	}



	public void setProfessor(String professor) {
		this.professor = professor;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getCrn() {
		return crn;
	}



	public void setCrn(String crn) {
		this.crn = crn;
	}



	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}


}
