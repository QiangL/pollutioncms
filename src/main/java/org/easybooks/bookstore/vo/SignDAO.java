package org.easybooks.bookstore.vo;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for Sign
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see org.easybooks.bookstore.vo.Sign
 * @author MyEclipse Persistence Tools
 */
public class SignDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(SignDAO.class);
	// property constants
	public static final String SIGN_TITLE = "signTitle";
	public static final String SIGN_TEXT = "signText";
	public static final String SIGN_STATE = "signState";

	protected void initDao() {
		// do nothing
	}

	public void save(Sign transientInstance) {
		log.debug("saving Sign instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Sign persistentInstance) {
		log.debug("deleting Sign instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Sign findById(Integer id) {
		log.debug("getting Sign instance with id: " + id);
		try {
			Sign instance = (Sign) getHibernateTemplate().get(
					"org.easybooks.bookstore.vo.Sign", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Sign instance) {
		log.debug("finding Sign instance by example");
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
		log.debug("finding Sign instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Sign as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySignTitle(Object signTitle) {
		return findByProperty(SIGN_TITLE, signTitle);
	}

	public List findBySignText(Object signText) {
		return findByProperty(SIGN_TEXT, signText);
	}

	public List findBySignState(Object signState) {
		return findByProperty(SIGN_STATE, signState);
	}

	public List findAll() {
		log.debug("finding all Sign instances");
		try {
			String queryString = "from Sign";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Sign merge(Sign detachedInstance) {
		log.debug("merging Sign instance");
		try {
			Sign result = (Sign) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Sign instance) {
		log.debug("attaching dirty Sign instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Sign instance) {
		log.debug("attaching clean Sign instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SignDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SignDAO) ctx.getBean("SignDAO");
	}
}