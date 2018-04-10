package org.easybooks.bookstore.action;

import com.alibaba.fastjson.JSONArray;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
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

		JSONArray JSONarray = new JSONArray();
		for(int i=0;i<s;i++){
			Outfall_view ov = (Outfall_view) outfall_views.get(i);
			JSONarray.add(ov);
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
