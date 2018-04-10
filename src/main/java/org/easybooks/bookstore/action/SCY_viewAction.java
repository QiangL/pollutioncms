package org.easybooks.bookstore.action;

import com.alibaba.fastjson.JSONArray;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.easybooks.bookstore.service.ISCY_viewService;
import org.easybooks.bookstore.vo.SCY_view;

import java.util.List;
import java.util.Map;

public class SCY_viewAction extends ActionSupport{
	protected ISCY_viewService scy_viewService;
	
	public String browseSCY_view() throws Exception{
		//System.out.println("SCY_viewAction starting~~~");
		
		List scy_views = scy_viewService.getAllSCY_views();
		
		int s = scy_views.size();
		//System.out.println("scy_viewAction size="+s);
		
		JSONArray JSONarray =  new JSONArray();
		

		for(int i=1;i<s;i++){
			SCY_view sv = (SCY_view) scy_views.get(i);
			//System.out.println(json.toString());
			JSONarray.add(sv);
		}
		String strJSONArray=JSONarray.toString();
		//System.out.println(strJSONArray);
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("SCY_strJSONArray", strJSONArray);
		request.put("SCY_size", s);
		
		return SUCCESS;
	
	}

	public ISCY_viewService getScy_viewService() {
		return scy_viewService;
	}

	public void setScy_viewService(ISCY_viewService scy_viewService) {
		this.scy_viewService = scy_viewService;
	}
	

}
