package org.easybooks.bookstore.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
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
		
		SCY_view sv0 = (SCY_view) scy_views.get(0);
		JSONArray JSONarray = JSONArray.fromObject(sv0);
		

		for(int i=1;i<s;i++){
			SCY_view sv = (SCY_view) scy_views.get(i);
			JSONObject json = JSONObject.fromObject(sv);
			//System.out.println(json.toString());
			JSONarray.add(json);
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
