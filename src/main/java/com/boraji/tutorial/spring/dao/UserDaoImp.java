package com.boraji.tutorial.spring.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boraji.tutorial.spring.model.User;

/**
 * @author imssbora
 */
@Repository
public class UserDaoImp implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(User user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public List<User> list() {
		@SuppressWarnings("unchecked")
		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
		return query.getResultList();
	}

	@SuppressWarnings("finally")
	@Override
	public User findUserByUserName(String userName) {
		@SuppressWarnings("unchecked")
		TypedQuery<User> query = sessionFactory.getCurrentSession()
				.createQuery("from User where userName='" + userName + "'");
		User user = new User();
		try {
			user = query.getSingleResult();
		} catch (Exception e) {

		} finally {
			if(null != user && null != user.getUserName())
			return user;
			else
				return null;
		}
	}

}
