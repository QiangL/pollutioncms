package org.easybooks.bookstore.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
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
		
		
		Alarmlogging a0 = (Alarmlogging) alarmloggings.get(0);
		JSONArray JSONarray = JSONArray.fromObject(a0);
		
		for(int i=1;i<s;i++){
			Alarmlogging a1 = (Alarmlogging) alarmloggings.get(i);
			JSONObject json = JSONObject.fromObject(a1);
			System.out.println(json.toString());
			JSONarray.add(json);
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
