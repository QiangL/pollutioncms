package org.easybooks.bookstore.action;

import com.alibaba.fastjson.JSONArray;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.easybooks.bookstore.service.ISignService;
import org.easybooks.bookstore.vo.Sign;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.Map;

@Entity
public class SignAction extends ActionSupport {

	@ManyToOne
	protected ISignService signService;//为使用业务层而设置的属性
	
    public String browseSign() throws Exception{
		
		List sign = signService.getAllSign();//直接调用业务层方法
		
		int n = sign.size();

		System.out.println("nnn:" + n);

		JSONArray Sign_JSONarray = new JSONArray();
		for(int i=0;i<n;i++){
			Sign a = (Sign)sign.get(i);
			Sign_JSONarray.add(a);
		}
	
		String Sign_strJSONArray=Sign_JSONarray.toString();
		System.out.println(Sign_strJSONArray);
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("Sign_strJSONArray", Sign_strJSONArray);
		request.put("Sign_size", sign.size());
		return SUCCESS;
	}
    public ISignService getSignService() {
		return signService;
	}
		
    public void setSignService(ISignService signService) {
		this.signService = signService;
	}
}
