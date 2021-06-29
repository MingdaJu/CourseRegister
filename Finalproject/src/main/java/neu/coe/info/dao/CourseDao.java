package neu.coe.info.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import neu.coe.info.pojo.Semester;
import neu.coe.info.pojo.Course;
import neu.coe.info.pojo.User;

public class CourseDao extends DAO {
	public List<Semester> showAllSemesters() {
		try {
			begin();
			Query q = getSession().createQuery("from Semester");
			List<Semester> list = q.list();
			commit();
			return list;
		} catch (HibernateException e) {
			rollback();
			return null;
		}
	}

	public Semester getSemesterId(int id) {
		try {
			begin();
			Query q = getSession().createQuery("from Semester where semesterid = " + id);
			Semester sem = (Semester) q.uniqueResult();
			commit();
			return sem;
		} catch (HibernateException e) {
			rollback();
			return null;
		}
	}

	public void delSemes(int id) {
		try {
			begin();
			Query q = getSession().createQuery("from Semester where semesterid = " + id);
			Semester sem = (Semester) q.uniqueResult();
			getSession().delete(sem);
			commit();
		} catch (HibernateException e) {
			rollback();
		}
	}

	public Semester addSemest(Semester sem) {
		try {
			begin();
			getSession().save(sem);
			commit();
			return sem;
		} catch (HibernateException e) {
			rollback();
			return null;
		}
	}

	public Course addCourse(Course cou) {
		try {
			begin();
			getSession().save(cou);
			commit();
			return cou;
		} catch (HibernateException e) {
			rollback();
			return null;
		}
	}

	public Course getCourse(int id) {
		try {
			begin();
			Query q = getSession().createQuery("from Course where courseid = " + id);
			Course cou = (Course) q.uniqueResult();
			commit();
			return cou;
		} catch (HibernateException e) {
			getSession().getTransaction().rollback();
		} finally {
			getSession().close();
		}
		return null;
	}

	public void delCourse(int id) {
		try {
			begin();
			Query q = getSession().createQuery("from Course where courseid = " + id);
			Course course = (Course) q.uniqueResult();
			getSession().delete(course);
			commit();
		} catch (HibernateException e) {
			getSession().getTransaction().rollback();
		} finally {
			getSession().close();
		}
	}

	public void update(Course thecourse) {
		try {
			begin();
			getSession().update(thecourse);
			commit();
			
		} catch (HibernateException e) {
			getSession().getTransaction().rollback();
		} finally {
			getSession().close();
		}
		
	}
	


	public void updateSemester(Semester thesemester) {
		try {
			begin();
			getSession().update(thesemester);
			commit();
		} catch (HibernateException e) {
			getSession().getTransaction().rollback();
		} finally {
			getSession().close();
		}

	}
	
//	public List<Course> displayAll(){
//		try {
//			begin();
//			Query q = getSession().createQuery("from Course");
//			List<Course> list = q.list();
//			commit();
//			return list;
//		} catch (HibernateException e) {
//			rollback();
//			return null;
//		}
//	}

}