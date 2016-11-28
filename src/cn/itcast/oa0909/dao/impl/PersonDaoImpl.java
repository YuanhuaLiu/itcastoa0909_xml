package cn.itcast.oa0909.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.itcast.oa0909.dao.PersonDao;
import cn.itcast.oa0909.domain.Person;

public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao{

	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(person);
	}
}
