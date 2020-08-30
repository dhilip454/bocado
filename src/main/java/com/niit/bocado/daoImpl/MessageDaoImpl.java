package com.niit.bocado.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.bocado.dao.MessageDao;
import com.niit.bocado.model.Message;

public class MessageDaoImpl implements MessageDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean sendMessage(Message message) {
try{
			
			
			sessionFactory.getCurrentSession().save(message);
			return true;
			}
			catch(HibernateException e) {
				e.printStackTrace();
				return false;
				
			}
	}

	@Override
	public List<Message> getMyMessages(String emailId) {
		return (List<Message>) sessionFactory.getCurrentSession().createCriteria(Message.class).add(Restrictions.eq("senderEmailId", emailId));
		
	}

}

