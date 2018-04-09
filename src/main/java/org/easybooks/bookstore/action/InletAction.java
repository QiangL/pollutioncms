package org.easybooks.bookstore.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.easybooks.bookstore.service.IInletService;
import org.easybooks.bookstore.vo.Inlet;

import java.util.List;
import java.util.Map;

public class InletAction extends ActionSupport {
	protected IInletService inletService;

	public String browseInlet() throws Exception {
		System.out.println("browseInlet starting!!!");
		List inlets = inletService.getAllInlets();

		int s = inlets.size();
		System.out.println("InletAction_size:s" + s);

		/*
		 * Inlet i0 = (Inlet) inlets.get(0); JSONArray JSONarray =
		 * JSONArray.fromObject(i0);
		 * 
		 * for(int i=1;i<s;i++){ Inlet i1 = (Inlet) inlets.get(i);
		 * 
		 * JSONObject json = JSONObject.fromObject(i1);
		 * //System.out.println(json.toString()); JSONarray.add(json); }
		 * 
		 * String strJSONArray=JSONarray.toString();
		 * System.out.println(strJSONArray);
		 */

		// 不用JSONObject直接转化需要的字符串得了
		String strJSONArray = "[";
		for (int i = 0; i < s; i++) {
			Inlet inlet = (Inlet) inlets.get(i);
			String InCleanName = inlet.getInCleanName();
			String InLocation = inlet.getInLocation();
			String InRange = inlet.getInRange();
			String InState = inlet.getInState();
			
			
			String st = "{\"InCleanName\":\""+InCleanName+"\","
					    +"\"InLocation\":\""+InLocation+"\","
					    +"\"InRange\":\""+InRange+"\","
					    +"\"InState\":\""+InState+"\"},";
			
			strJSONArray += st;
		}
		strJSONArray += "]";
		System.out.println(strJSONArray);

		Map request = (Map) ActionContext.getContext().get("request");
		request.put("Inlet_strJSONArray", strJSONArray);
		request.put("Inlet_size", s);
		return SUCCESS;

	}

	public IInletService getInletService() {
		return inletService;
	}

	public void setInletService(IInletService inletService) {
		this.inletService = inletService;
	}

}
