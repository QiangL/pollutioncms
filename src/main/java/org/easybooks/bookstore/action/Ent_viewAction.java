package org.easybooks.bookstore.action;

import com.alibaba.fastjson.JSONArray;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.easybooks.bookstore.service.IEnt_viewService;
import org.easybooks.bookstore.vo.Enterprise_view;

import java.util.List;
import java.util.Map;

public class Ent_viewAction extends ActionSupport{
	
	/**错误的版本
	
	protected IEnterpriseService enterpriseService;
	//protected IEnvByNoService envByNoService;
	
	//将所有需要展示的企业基本信息展示出来
	public String browseEnt_view() throws Exception{
		
		System.out.println("Ent_viewAction browseEnt_view Starting!!!");
		
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
		
		int s = enterprise_views.size();
		System.out.println("ent_views.size="+s);                                                       
		Enterprise_view ent0 = (Enterprise_view) enterprise_views.get(0);
		JSONArray JSONarray = JSONArray.fromObject(ent0);
		
		for(int i=1;i<s;i++){
			Enterprise_view ev = (Enterprise_view) enterprise_views.get(i);
			JSONObject json = JSONObject.fromObject(ev);
			System.out.println("Ent_viewAction:   "+json.toString());
			JSONarray.add(json);
		}
		String strJSONArray=JSONarray.toString();
		//System.out.println(strJSONArray);
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("Enterprise_strJSONArray", strJSONArray);
		request.put("Enterprise_size ", s);
		return SUCCESS;
		
	}
	//属性的getter/setter方法
	public IEnterpriseService getEnterpriseService() {
		return enterpriseService;
	}

	public void setEnterpriseService(IEnterpriseService enterpriseService) {
		this.enterpriseService = enterpriseService;
	}
	
	public IEnvByNoService getEnvByNoService() {
		return envByNoService;
	}

	public void setEnvByNoService(IEnvByNoService envByNoService) {
		this.envByNoService = envByNoService;
	}
	
	**/
	
	/**
	 * 新的版本
	 */
	
	protected IEnt_viewService ent_viewService;
	
	public String browseEnt_view()throws Exception{
		System.out.println("Ent_viewAction Starting~~~");
		List enterprise_views = ent_viewService.getAllEnt_views();
		
		int s = enterprise_views.size();
		System.out.println("Ent_viewAction size="+s);
		
		JSONArray JSONarray = new JSONArray();
		
		for(int i=0;i<s;i++){
			Enterprise_view ev = (Enterprise_view) enterprise_views.get(i);
			JSONarray.add(ev);
		}
		String strJSONArray=JSONarray.toString();
		//System.out.println(strJSONArray);
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("Enterprise_strJSONArray", strJSONArray);
		request.put("Enterprise_size", s);
		return SUCCESS;
		
		
	}

	public IEnt_viewService getEnt_viewService() {
		return ent_viewService;
	}

	public void setEnt_viewService(IEnt_viewService ent_viewService) {
		this.ent_viewService = ent_viewService;
	}

	
	
	

}
