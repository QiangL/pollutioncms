package org.easybooks.bookstore.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.easybooks.bookstore.service.IEnvByNoService;
import org.easybooks.bookstore.vo.Environment;

import java.util.List;
import java.util.Map;

public class EnvByNoAction extends ActionSupport{
	
	protected IEnvByNoService envByNoService;
	
	public String browseEnvByNo() throws Exception{
		List envs = envByNoService.getEnviromentByEnt_no(2);
		
		Environment e0 = (Environment) envs.get(0);
		
		
		String strJSONArray = "[{\"EnvArea\":\"" + e0.getEnvArea() +"\"}]";
		System.out.println(strJSONArray);
		
		/*
		JSONArray JSONarray = JSONArray.fromObject(e0);
		System.out.println(JSONarray.toString());
		
		String strJSONArray=JSONarray.toString();
		System.out.println("strJSONArray"+strJSONArray);
		*/
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("Environments_strJSONArray", strJSONArray);
		request.put("Environments_size", 1);
		
		
		return SUCCESS;
	}

	public IEnvByNoService getEnvByNoService() {
		return envByNoService;
	}

	public void setEnvByNoService(IEnvByNoService envByNoService) {
		this.envByNoService = envByNoService;
	}
	

}
