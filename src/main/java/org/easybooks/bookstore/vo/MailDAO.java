package org.easybooks.bookstore.vo;

import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for Mail
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see org.easybooks.bookstore.vo.Mail
 * @author MyEclipse Persistence Tools
 */
public class MailDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(MailDAO.class);
	// property constants
	public static final String USER_ID = "userId";
	public static final String MAIL_SUBJECT = "mailSubject";
	public static final String MAIL_TEXT = "mailText";
	public static final String MAIL_SEND_NAME = "mailSendName";
	public static final String MAIL_SEND_MAIL = "mailSendMail";
	public static final String MAIL_REC_NAME = "mailRecName";
	public static final String MAIL_REC_MAIL = "mailRecMail";
	public static final String MAIL_TIME = "mailTime";

	protected void initDao() {
		// do nothing
	}

	public void save(Mail transientInstance) {
		log.debug("saving Mail instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Mail persistentInstance) {
		log.debug("deleting Mail instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Mail findById(Integer id) {
		log.debug("getting Mail instance with id: " + id);
		try {
			Mail instance = (Mail) getHibernateTemplate().get(
					"org.easybooks.bookstore.vo.Mail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Mail instance) {
		log.debug("finding Mail instance by example");
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
		log.debug("finding Mail instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Mail as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUserId(Object userId) {
		return findByProperty(USER_ID, userId);
	}

	public List findByMailSubject(Object mailSubject) {
		return findByProperty(MAIL_SUBJECT, mailSubject);
	}

	public List findByMailText(Object mailText) {
		return findByProperty(MAIL_TEXT, mailText);
	}

	public List findByMailSendName(Object mailSendName) {
		return findByProperty(MAIL_SEND_NAME, mailSendName);
	}

	public List findByMailSendMail(Object mailSendMail) {
		return findByProperty(MAIL_SEND_MAIL, mailSendMail);
	}

	public List findByMailRecName(Object mailRecName) {
		return findByProperty(MAIL_REC_NAME, mailRecName);
	}

	public List findByMailRecMail(Object mailRecMail) {
		return findByProperty(MAIL_REC_MAIL, mailRecMail);
	}

	public List findByMailTime(Object mailTime) {
		return findByProperty(MAIL_TIME, mailTime);
	}

	public List findAll() {
		log.debug("finding all Mail instances");
		try {
			String queryString = "from Mail";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Mail merge(Mail detachedInstance) {
		log.debug("merging Mail instance");
		try {
			Mail result = (Mail) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Mail instance) {
		log.debug("attaching dirty Mail instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Mail instance) {
		log.debug("attaching clean Mail instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static MailDAO getFromApplicationContext(ApplicationContext ctx) {
		return (MailDAO) ctx.getBean("MailDAO");
	}
}