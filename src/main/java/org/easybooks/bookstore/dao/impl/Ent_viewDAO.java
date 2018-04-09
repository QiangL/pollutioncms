package org.easybooks.bookstore.dao.impl;

import org.easybooks.bookstore.dao.BaseDAO;
import org.easybooks.bookstore.dao.IEnt_viewDAO;
import org.easybooks.bookstore.vo.Enterprise;
import org.easybooks.bookstore.vo.Enterprise_view;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Ent_viewDAO extends BaseDAO implements IEnt_viewDAO{

	
	
	/**错误的版本
	
	protected IEnterpriseService enterpriseService;
	protected IEnvByNoService envByNoService;
	
	//将所有需要展示的企业基本信息展示出来
	public List getAllEnt_views() {
		//企业展示信息对象（返回值）
         List enterprise_views = null;
		//企业基本信息表中所有对象
		List enterprises = enterpriseService.getAllEnterprises();
		
		for(int i=0;i<enterprises.size();i++){
			//企业对象
			Enterprise e = (Enterprise) enterprises.get(i);
			//企业展示对象
			Enterprise_view view = null;
			//得到企业序号
			Integer ent_no = e.getEntNo();
			
		    //企业基本信息表中需要的属性：名称，简称，地址，备注
			view.setEI_Ent_name(e.getEntName());
			view.setEI_Ent_short(e.getEntShort());
			view.setEI_Ent_address(e.getEntAddress());
			view.setEI_Ent_remark(e.getEntRemark());
			
			
			//根据企业序号得到环境属性对象
			List envs = envByNoService.getEnviromentByEnt_no(ent_no);
			Environment env = (Environment) envs.get(0);
			//得到环境属性需要的属性：地区，联系人，流域
			view.setEI_Env_region(env.getEnvArea());
			view.setEI_Env_watershed(env.getEnvWatershed());
			
			//返回的List
			enterprise_views.add(view);
		}
		
		
		return enterprise_views;
	}
	**/
	
	/**
	 * 新的版本
	 */
	/*
	//将所有需要展示的企业基本信息展示出来
		public List getAllEnt_views() {
			System.out.println("Ent_viewDAO Starting!!!");
			
			//企业展示信息对象（返回值）
			ArrayList<Enterprise_view> enterprise_views = new ArrayList<Enterprise_view>(); 
		  //  List enterprise_views = null;
		    
		    //环境表中的所有对象
			Session session = getSession();
			String hql = "from Environment env";
			Query query = session.createQuery(hql);
			List environments = query.list();
			
			//System.out.println("Ent_viewDAO for循环之前！！！");
			//Environment env0 = (Environment) environments.get(0);
			//System.out.println("Ent_viewDAO EntAddress:"+env0.getEnterprise().getEntAddress());
			
			
			
			for(int i=0;i<environments.size();i++){
				//System.out.println("Ent_viewDAO for循环中！！！");
				
				//环境属性对象
				Environment env = (Environment) environments.get(0);
				//企业展示对象
				Enterprise_view view = new Enterprise_view();
				
				 
			    //企业基本信息表中需要的属性：名称，简称，地址，备注
				//System.out.println("Name:"+env.getEnterprise().getEntName());
				String entName = env.getEnterprise().getEntName();
				view.setEI_Ent_name(entName);
				//System.out.println("Short:"+env.getEnterprise().getEntShort());
				String entShort = env.getEnterprise().getEntShort();
				view.setEI_Ent_short(entShort);
				
				view.setEI_Ent_address(env.getEnterprise().getEntAddress());
				view.setEI_Ent_remark(env.getEnterprise().getEntRemark());
				
				//得到环境属性需要的属性：地区，联系人，流域
				view.setEI_Env_region(env.getEnvArea());
				view.setEI_Env_watershed(env.getEnvWatershed());
				
				//返回的List
				enterprise_views.add(view);
				
			}
		
			session.close();
			
	

			
			return enterprise_views;
			
			
	
		}*/
   
	 
	//将所有信息展示出来
	public List getAllEnt_views() {
		//System.out.println("Ent_viewDAO Starting!!!");
		
		//企业展示信息对象（返回值）
		ArrayList<Enterprise_view> enterprise_views = new ArrayList<Enterprise_view>(); 
		
		//企业表Enterprise所有信息
		Session session = getSession();
		String hql = "from Enterprise ent";
		Query query = session.createQuery(hql);
		List enterprises = query.list();
		
		for(int i=0;i<enterprises.size();i++){
			
			//企业属性对象
			Enterprise ent = (Enterprise)enterprises.get(i);
			//企业展示对象（加载至enterprise_views表中的对象）
			Enterprise_view view = new Enterprise_view();
			
			/*
			 * 企业基本信息表中的属性：名称，简称，地址，备注
			 */
			//名称
			String entName = ent.getEntName();
			view.setEI_Ent_name(entName);
			//简称
			String entShort = ent.getEntShort();
			view.setEI_Ent_short(entShort);
			//地址
			view.setEI_Ent_address(ent.getEntAddress());
			//备注
			view.setEI_Ent_remark(ent.getEntRemark());
			
			/*
			 * 得到环境属性表中需要的属性：地区，流域
			 */
			//地区
			view.setEI_Env_region(ent.getEnvironment().getEnvArea());
			//流域
			view.setEI_Env_watershed(ent.getEnvironment().getEnvWatersFunction());
			
			/*
			 * 得到管理属性表中需要的属性：关注程度，联系人
			 */
			view.setEI_Man_concern_extent(ent.getManage().getManConcernExtent());
			view.setEI_Env_linkman(ent.getManage().getManHbPerson());
			
			//返回的list
			enterprise_views.add(view);
			
		}
		session.close();
		return enterprise_views;
	}

}










