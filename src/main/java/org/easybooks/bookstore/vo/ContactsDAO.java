package org.easybooks.bookstore.vo;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for
 * Contacts entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see org.easybooks.bookstore.vo.Contacts
 * @author MyEclipse Persistence Tools
 */

public class ContactsDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory
			.getLogger(ContactsDAO.class);
	// property constants
	public static final String CON_NAME = "conName";
	public static final String CON_TEL = "conTel";
	public static final String CON_MAIL = "conMail";
	public static final String CON_COMPANY = "conCompany";
	public static final String CON_DIVISION = "conDivision";
	public static final String CON_POST = "conPost";

	protected void initDao() {
		// do nothing
	}

	public void save(Contacts transientInstance) {
		log.debug("saving Contacts instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Contacts persistentInstance) {
		log.debug("deleting Contacts instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Contacts findById(Integer id) {
		log.debug("getting Contacts instance with id: " + id);
		try {
			Contacts instance = (Contacts) getHibernateTemplate().get(
					"org.easybooks.bookstore.vo.Contacts", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Contacts instance) {
		log.debug("finding Contacts instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Contacts instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Contacts as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByConName(Object conName) {
		return findByProperty(CON_NAME, conName);
	}

	public List findByConTel(Object conTel) {
		return findByProperty(CON_TEL, conTel);
	}

	public List findByConMail(Object conMail) {
		return findByProperty(CON_MAIL, conMail);
	}

	public List findByConCompany(Object conCompany) {
		return findByProperty(CON_COMPANY, conCompany);
	}

	public List findByConDivision(Object conDivision) {
		return findByProperty(CON_DIVISION, conDivision);
	}

	public List findByConPost(Object conPost) {
		return findByProperty(CON_POST, conPost);
	}

	public List findAll() {
		log.debug("finding all Contacts instances");
		try {
			String queryString = "from Contacts";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Contacts merge(Contacts detachedInstance) {
		log.debug("merging Contacts instance");
		try {
			Contacts result = (Contacts) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Contacts instance) {
		log.debug("attaching dirty Contacts instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Contacts instance) {
		log.debug("attaching clean Contacts instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ContactsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ContactsDAO) ctx.getBean("ContactsDAO");
	}
}