package org.easybooks.bookstore.dao.impl;

import org.easybooks.bookstore.dao.BaseDAO;
import org.easybooks.bookstore.dao.IOutfall_viewDAO;
import org.easybooks.bookstore.vo.Outfall;
import org.easybooks.bookstore.vo.Outfall_view;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Outfall_viewDAO extends BaseDAO implements IOutfall_viewDAO{

	public List getAllOutfall_views() {
		//System.out.println("Outfall_viewDAO starting ~~~");
		
		//出水口信息展示对象（返回值）
		ArrayList<Outfall_view> outfall_views = new ArrayList<Outfall_view>();
		
		//出水口表中所有对象
		Session session = getSession();
		String hql = "from Outfall out";
		Query query = session.createQuery(hql);
		List outfalls = query.list();
		
		//System.out.println("Outfall_viewDAO outfalls_size="+outfalls.size());
		
		for(int i=0;i<outfalls.size();i++){
			//进水口对象
			Outfall out = (Outfall)outfalls.get(i);
			//进水口展示对象（for循环最后add至outfalls_views中）
			Outfall_view view = new Outfall_view();
			
			int no = out.getOutNo();//因为有一个-1的标志，所以需要除去
			if(no>0){
			
			
			/*
			 * 得到排水口的所需的信息：名称，编号，位置，是否联网，数据上报，排水口状态，排水欧MN号
			 */ 
			view.setOut_name(out.getOutName());
			view.setOut_water_no(out.getOutWateNo());
			view.setOut_location(out.getOutLocation());
			view.setOut_net(out.getOutNet());
			view.setOut_data_report(out.getOutDataReport());
			view.setOut_state(out.getOutState());
			view.setOut_report_MN(out.getOutReportMn());
			
			//System.out.println("OutfallDAO out.getOutName():"+out.getOutName());
			
			//企业表中需要的属性：污染源名称，所属区县
			view.setEnt_name(out.getEnterprise().getEntName());
			//view.setEnt_name(out.getEnterprise().getEntName());
		//	System.out.println("OutfallDAO out.getEnterprise().getEntName():"+out.getEnterprise().getEntName());
			view.setEnv_region(out.getEnterprise().getEnvironment().getEnvArea());
			
			outfall_views.add(view);
			
			}
		}
		session.close();
		//System.out.println("Outfall_viewDAO outfall_views size="+outfall_views.size());
		return outfall_views;
	}
	

}
