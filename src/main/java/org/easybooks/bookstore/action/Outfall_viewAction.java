package org.easybooks.bookstore.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.easybooks.bookstore.service.IOutfall_viewService;
import org.easybooks.bookstore.vo.Outfall_view;

import java.util.List;
import java.util.Map;

public class Outfall_viewAction extends ActionSupport{
	
	protected IOutfall_viewService outfall_viewService;
	
	public String browseOutfall_view() throws Exception{
		
		//System.out.println("Outfall_viewAction starting~~~");
		
		List outfall_views = outfall_viewService.getOutfall_views();
		
		int s = outfall_views.size();
		//System.out.println("Outfall_viewAction size="+s);
		
		Outfall_view ov0 = (Outfall_view) outfall_views.get(0);
        JSONArray JSONarray = JSONArray.fromObject(ov0);
		

		for(int i=1;i<s;i++){
			Outfall_view ov = (Outfall_view) outfall_views.get(i);
			JSONObject json = JSONObject.fromObject(ov);
			//System.out.println(json.toString());
			JSONarray.add(json);
		}
		String strJSONArray=JSONarray.toString();
		//System.out.println(strJSONArray);
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("Outfall_strJSONArray", strJSONArray);
		request.put("Outfall_size", s);
		
		return SUCCESS;
		
	}

	public IOutfall_viewService getOutfall_viewService() {
		return outfall_viewService;
	}

	public void setOutfall_viewService(IOutfall_viewService outfall_viewService) {
		this.outfall_viewService = outfall_viewService;
	}
	
	
	
}
