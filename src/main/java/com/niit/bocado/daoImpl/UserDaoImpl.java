package com.niit.bocado.daoImpl;

import java.util.List;

import javax.management.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.niit.bocado.dao.UserDao;
import com.niit.bocado.model.User;

@Repository(value="userDao")
@Component
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	User user;
	
	
	public UserDaoImpl(SessionFactory sessionFactory, User user) {
		super();
		this.sessionFactory = sessionFactory;
		
	}

	@Override
	public boolean save(User user) {
		try{
		user.setPassword(user.getPassword());
		user.setActive(true);
		sessionFactory.getCurrentSession().save(user);
		return true;
		}
		catch(HibernateException e) {
			e.printStackTrace();
			return false;
			
		}
	}

	@Override
	public boolean update(User user) {
		try{
			
			sessionFactory.getCurrentSession().update(user);
			return true;
			}
			catch(HibernateException e) {
				e.printStackTrace();
				return false;
				
			}
	}

	@Override
	public User get(String id) {
		user=(User)sessionFactory.getCurrentSession().get(User.class,id);
		return user;
	}

	@Override
	public List<User> list() {
		String qstr="from User";
		Query query=  (Query) sessionFactory.getCurrentSession().createQuery(qstr);
		return ((UserDao) query).list();
	}

	@Override
	public User validate(String id, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
