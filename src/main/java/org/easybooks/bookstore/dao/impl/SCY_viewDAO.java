package org.easybooks.bookstore.dao.impl;

import org.easybooks.bookstore.dao.BaseDAO;
import org.easybooks.bookstore.dao.ISCY_viewDAO;
import org.easybooks.bookstore.vo.SCY_view;
import org.easybooks.bookstore.vo.Scy;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SCY_viewDAO extends BaseDAO implements ISCY_viewDAO{
	
	//得到所有的SCY展示信息
	public List getAllSCY_views() {
		//System.out.println("SCY_viewDAO Starting!!!");
		
		//SCY展示的所有对象，也是这个函数的返回值
		ArrayList<SCY_view> scy_views = new ArrayList<SCY_view>();
		
		//SCY表中的所有数采仪对象
		Session session = getSession();
		String hql = "from Scy scy";
		Query query = session.createQuery(hql);
		List scys = query.list();
		
		
		System.out.println(scys.size());
		
		//遍历scys
		for(int i=0;i<scys.size();i++){
			
			//数采仪对象
			Scy scy = (Scy) scys.get(i);
			
			//System.out.println(scy.toString());
			
			//SCY展示对象，再for内的最后添加到scy_views返回的列表上
			SCY_view scy_view = new SCY_view();
			
			//在数采仪（SCY）表中需要得到的数据
			scy_view.setV_SCY_no(scy.getScyNo());//数采仪编号
			scy_view.setV_MN_No(scy.getScyMn());//数采仪MN号
			scy_view.setV_SCY_type(scy.getScyType());//数采仪类型
			scy_view.setV_SCY_date(scy.getScyStartDate());//启用日期
			
			//System.out.println(scy_view.toString());
			
			/*
			 * 进出水口名称
			 * 1，首先判断是进水口的数采仪还是出水口的数采仪
			 * 2，得到进水口表，或者出水口表中需要的属性
			 * 3，得到企业需要的属性
			 */
			//1，首先判断是进水口的数采仪还是出水口的数采仪
			Integer in_no = scy.getInlet().getInNo();
			Integer out_no = scy.getOutfall().getOutNo();
			//System.out.println("SCY_viewDAO中in_no:"+in_no+"  out_no:"+out_no);
			//如果是进水口的数采仪
			if(in_no > 0){
				//System.out.println("in_no>0");
				//得到进水口表中需要的属性，名称,流域
				scy_view.setIn_out_name(scy.getInlet().getInCleanName());
				scy_view.setV_SCY_region(scy.getInlet().getInDomain());
				scy_view.setV_SCY_state(scy.getInlet().getInState());//数采仪状态
			}
			if(out_no > 0 ){
				//System.out.println("out_no>0");
				//得倒出水口表中需要的属性：名称，流域
				scy_view.setIn_out_name(scy.getOutfall().getOutName());
				scy_view.setV_SCY_region(scy.getOutfall().getOutDomain());
				scy_view.setV_SCY_state(scy.getOutfall().getOutState());//数采仪状态
			}
			
			//得到企业信息表中需要的信息：名称
			scy_view.setV_SCY_Ent_Name(scy.getEnterprise().getEntName());
			//返回的list
			scy_views.add(scy_view);
			
			
		}
		session.close();
		//System.out.println("SCY_viewDAO中scy_views.size="+scy_views.size());
		return scy_views;
	}

}
