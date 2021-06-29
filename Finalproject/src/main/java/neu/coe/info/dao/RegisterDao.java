package neu.coe.info.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import neu.coe.info.pojo.Semester;
import neu.coe.info.pojo.RegisterPlan;
import neu.coe.info.pojo.Course;

public class RegisterDao extends DAO {
	

	
	public List<RegisterPlan> displayPlaylists(){
		try {
			begin();
			Query q = getSession().createQuery("from RegisterPlan");
			List<RegisterPlan> list = q.list();
			commit();
			return list;
		} catch (HibernateException e) {
			rollback();
	
			return null;
		}
	}
	
	public RegisterPlan findPlan(int id){
		try{
			begin();
			Query q = getSession().createQuery("from RegisterPlan where planid = " + id);
			RegisterPlan reg = (RegisterPlan) q.uniqueResult();
			commit();
			return reg;
		}
		catch(HibernateException e){
			rollback();
			
			return null;
		}
	}
	

	
	public RegisterPlan addPlaylist(RegisterPlan reg){
		try {
			begin();
			getSession().save(reg);
			commit();
			return reg;
		} 
		catch (HibernateException e) {
			rollback();
			
			return null;
		}
	}
	
	public RegisterPlan updatePlaylist(RegisterPlan reg){
		try {
			begin();
			getSession().update(reg);
			commit();
			return reg;
		} 
		catch (HibernateException e) {
			rollback();
			
			return null;
		}
	}
	
	
	public List<Course> mutiSearchCourse(String crn, String pro, String cour, String loc,String cre){
		try {
			begin();
			Criteria crit = getSession().createCriteria(Course.class);
			crit.add(Restrictions.or(Restrictions.like("coursename",cour,MatchMode.EXACT),
					Restrictions.or(Restrictions.like("crn", crn,MatchMode.EXACT)),
					Restrictions.or(Restrictions.like("professor", pro,MatchMode.EXACT)),
					Restrictions.or(Restrictions.like("location", loc,MatchMode.EXACT)),
					Restrictions.or(Restrictions.like("credit", cre,MatchMode.EXACT))));
			List<Course> list = crit.list();		
			commit();
			return list;
		} catch (HibernateException e) {
			rollback();
			return null;
		}				
	}
	

	
//	public void addSongToPlaylist(RegisterPlan reg, Course c){
//		List<Course> list = reg.getRegcourse();
//		list.add(c);		
//	}
//	
//	public void deleteSongFromPlaylist(RegisterPlan reg, Course c){
//		List<Course> list = reg.getRegcourse();
//		list.remove(c);
//	}
}