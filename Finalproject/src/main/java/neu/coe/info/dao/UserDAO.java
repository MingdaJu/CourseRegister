 package neu.coe.info.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;

import neu.coe.info.pojo.Semester;
import neu.coe.info.pojo.RegisterPlan;
import neu.coe.info.pojo.User;



public class UserDAO extends DAO{
	
	public User get(String username, String password) {
		try {
			begin();
			Query q = getSession().createQuery("from User where username = :un and password = :pw");
			q.setString("un", username);
			q.setString("pw", password);			
			User user = (User) q.uniqueResult();
			commit();
			return user;
		} catch (HibernateException e) {
			rollback();
			System.out.println("Could not get user by username and password " +  e.getMessage());
			return null;
		}
	}
	
	public User get(String username){
        try {
            begin();
            Query q = getSession().createQuery("from User where username = :username");
            q.setString("username", username);
            User user = (User) q.uniqueResult();
            System.out.println("nonononoononono");
            close();
            return user;
            
        }catch(Exception e){
            System.out.println("cuole"+e.getMessage());
        }
            return null;   
    }
	
	
	
	public User getUserById(int id) {
		try {
			begin();
			Query q = getSession().createQuery("from User where userid =" + id);	
			User user = (User) q.uniqueResult();
			commit();
			return user;
		} catch (HibernateException e) {
			rollback();
	
			return null;
		}
	}
	
	public User add(String username, String password)  {
		try {
			begin();
			User u = new User();
			u.setUsername(username);
			u.setPassword(password);
			u.setNewPlan(new ArrayList<RegisterPlan>());
			
			getSession().save(u);
			commit();
			return u;
		} catch (HibernateException e) {
			rollback();
			System.out.println("Could not add user  " +  e.getMessage());
			return null;
		}
	}
	
	

	public void delete(int userid) {
		try {
			begin();
			Query q = getSession().createQuery("from User where userid = " + userid);
			User user = (User) q.uniqueResult();
			getSession().delete(user);
			commit();
		} catch (HibernateException e) {
			rollback();
			
		}
	}
	

	public List<User> displayAll(){
		try {
			begin();
			Query q = getSession().createQuery("from User");
			List<User> list = q.list();
			commit();
			return list;
		} catch (HibernateException e) {
			rollback();
			return null;
		}
	}
}