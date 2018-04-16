package org.easybooks.bookstore.action;

import com.alibaba.fastjson.JSONArray;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.HttpParameters;
import org.easybooks.bookstore.service.IContactsService;
import org.easybooks.bookstore.vo.Contacts;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.Map;

@Entity
public class ContactsAction extends ActionSupport {

	@ManyToOne
	protected IContactsService contactsService;//为使用业务层而设置的属性
	
    public String browseContacts() throws Exception{
		
		List contacts = contactsService.getAllContacts();//直接调用业务层方法
		
		int s = contacts.size();
				
		JSONArray Contacts_JSONarray = new JSONArray();

		for(int i=0;i<s;i++){
			Contacts a = (Contacts) contacts.get(i);
			Contacts_JSONarray.add(a);
		}
	
		String Contacts_strJSONArray=Contacts_JSONarray.toString();
		System.out.println(Contacts_strJSONArray);
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("Contacts_strJSONArray", Contacts_strJSONArray);
		request.put("Contacts_size", contacts.size());
		return SUCCESS;
	}
    
    public String addContacts() throws Exception{
		HttpParameters request = ActionContext.getContext().getParameters();
		String Name =request.get("Name").getValue() ;
		String Tel = request.get("Tel").getValue() ;
		String Email =request.get("Email").getValue() ;
		String Company =request.get("Company").getValue() ;
		String Division = request.get("Division").getValue() ;
		String Post =request.get("Post").getValue() ;
    	contactsService.addContacts(Name, Tel, Email, Company, Division, Post);
    	return SUCCESS;
    }
    
    public String deleteContact() throws Exception{
		HttpParameters request = ActionContext.getContext().getParameters();
		String conId = request.get("conId").getValue();
    	contactsService.deleteContact(conId);
    	return SUCCESS;
    }
    
    public String updateContacts() throws Exception{
		HttpParameters request =ActionContext.getContext().getParameters();
    	String Id = request.get("Id").getValue() ;
    	String Name =request.get("Name").getValue() ;
    	String Tel = request.get("Tel").getValue() ;
    	String Email =request.get("Email").getValue() ;
    	String Company =request.get("Company").getValue() ;
    	String Division = request.get("Division").getValue() ;
    	String Post =request.get("Post").getValue() ;
        contactsService.updateContacts(Id, Name, Tel, Email, Company, Division, Post);
    	return SUCCESS;
    } 
    
    public IContactsService getContactsService() {
		return contactsService;
	}
		
    public void setContactsService(IContactsService contactsService) {
		this.contactsService = contactsService;
	}
}
