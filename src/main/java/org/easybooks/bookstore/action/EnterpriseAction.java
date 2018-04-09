package org.easybooks.bookstore.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.easybooks.bookstore.service.IEnterpriseService;
import org.easybooks.bookstore.vo.Enterprise;

import java.util.List;
import java.util.Map;

public class EnterpriseAction extends ActionSupport{
	protected IEnterpriseService enterpriseService;
	
	public String browseEnterprise()throws Exception{
		List enterprises = enterpriseService.getAllEnterprises();
		
		int s = enterprises.size();
		System.out.println("EnterpriseAction_size:"+s);
		
		/*
		Enterprise e0 = (Enterprise) enterprises.get(0);
		JSONArray JSONarray = JSONArray.fromObject(e0);
		
		for(int i=1;i<s;i++){
			Enterprise e = (Enterprise) enterprises.get(i);
			JSONObject json = JSONObject.fromObject(i);
			System.out.println(json.toString());
			JSONarray.add(json);
		}
		
		String strJSONArray=JSONarray.toString();
		System.out.println(strJSONArray);
		*/
		
		//不用JSONObject直接转化需要的字符串得了
		String strJSONArray = "[";
		for(int i=0;i<s;i++){
			Enterprise e = (Enterprise) enterprises.get(i);
			String entName = e.getEntName();
			String entShort = e.getEntShort();
			String entClass = e.getEntClass();
			String st = "{\"entName\":\""+entName+"\",\"entShort\":\""+entShort+"\",\"entClass\":\""+entClass+"\"},";
			System.out.println("EnterpriseAction_st:"+st);
			strJSONArray += st;
		}
		strJSONArray += "]";
		System.out.println(strJSONArray);
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("Enterprise_strJSONArray", strJSONArray);
		request.put("Enterprise_size", s);
		return SUCCESS;
	}

	public IEnterpriseService getEnterpriseService() {
		return enterpriseService;
	}

	public void setEnterpriseService(IEnterpriseService enterpriseService) {
		this.enterpriseService = enterpriseService;
	}
	
	

}
