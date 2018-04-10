package org.easybooks.bookstore.action;

import com.alibaba.fastjson.JSONArray;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.easybooks.bookstore.service.IAlarmloggingService;
import org.easybooks.bookstore.vo.Alarmlogging;

import java.util.List;
import java.util.Map;

public class AlarmloggingAction extends ActionSupport{
	protected IAlarmloggingService alarmloggingService;
	
	public String browseAlarmlogging()throws Exception{
		//从数据库中得到所有的对象
		List alarmloggings = alarmloggingService.getAllAlarmloggings();
		
		int s = alarmloggings.size();
		//System.out.println("SCYAction_size:"+s);
		
		
		JSONArray JSONarray =  new JSONArray();
		
		for(int i=1;i<s;i++){
			Alarmlogging a1 = (Alarmlogging) alarmloggings.get(i);
			JSONarray.add(a1);
		}
		
		String strJSONArray=JSONarray.toString();
		//System.out.println(strJSONArray);
		
		
		
		
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("Alarmlogging_strJSONArray", strJSONArray);
		request.put("Alarmlogging_size", s);
		return SUCCESS;
	}

	public IAlarmloggingService getAlarmloggingService() {
		return alarmloggingService;
	}

	public void setAlarmloggingService(IAlarmloggingService alarmloggingService) {
		this.alarmloggingService = alarmloggingService;
	}
	

}
