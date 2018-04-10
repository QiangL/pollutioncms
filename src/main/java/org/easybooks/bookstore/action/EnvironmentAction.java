package org.easybooks.bookstore.action;

import com.alibaba.fastjson.JSONArray;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.easybooks.bookstore.service.IEnvironmentService;
import org.easybooks.bookstore.vo.Environment;

import java.util.List;
import java.util.Map;

public class EnvironmentAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected IEnvironmentService environmentService;
	
	public String browseEnvironment() throws Exception{
		System.out.println("browseEnvironment starting !!!");
		
		List environments = environmentService.getAllEnvironments();
		
		int s = environments.size();
		System.out.println("browseEnvironment_s:"+s);
		
		Environment e0 = (Environment) environments.get(0);
		System.out.println(e0.toString());
		
		JSONArray JSONarray =  new JSONArray();
		System.out.println(JSONarray.toString());
		
	/*	Environment e = (Environment) environments.get(1);
		JSONObject json = JSONObject.fromObject(e);
		JSONarray.add(json);
		*/
		
		
	/*	for(int i=1;i<s;i++){
			Environment e = (Environment) environments.get(i);
			JSONObject json = JSONObject.fromObject(e);
			System.out.println(json.toString());
			JSONarray.add(json);
		}
		*/
		String strJSONArray=JSONarray.toString();
		System.out.println("strJSONArray"+strJSONArray);
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("Environments_strJSONArray", strJSONArray);
		request.put("Environments_size", s);
		return SUCCESS;
	}

	public IEnvironmentService getEnvironmentService() {
		return environmentService;
	}

	public void setEnvironmentService(IEnvironmentService environmentService) {
		this.environmentService = environmentService;
	}
	

}
