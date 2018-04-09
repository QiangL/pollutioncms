package org.easybooks.bookstore.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
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
				
		Contacts a0 = (Contacts) contacts.get(0);
	
		JSONArray Contacts_JSONarray = JSONArray.fromObject(a0);
		
		for(int i=1;i<s;i++){
			Contacts a = (Contacts) contacts.get(i);
			
			JSONObject json = JSONObject.fromObject(a);

			Contacts_JSONarray.add(json);
		}
	
		String Contacts_strJSONArray=Contacts_JSONarray.toString();
		System.out.println(Contacts_strJSONArray);
		
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("Contacts_strJSONArray", Contacts_strJSONArray);
		request.put("Contacts_size", contacts.size());
		return SUCCESS;
	}
    
    public String addContacts() throws Exception{
    	Map request = (Map)ActionContext.getContext().getParameters(); 
    	String name = ((String[])request.get("name"))[0] ;
    	String tel = ((String[])request.get("tel"))[0] ;
    	String email = ((String[])request.get("email"))[0] ;
    	String company = ((String[])request.get("company"))[0] ;
    	String division = ((String[])request.get("division"))[0] ;
    	String post= ((String[])request.get("post"))[0] ;
    	contactsService.addContacts(name, tel, email, company, division, post);
    	return SUCCESS;
    }
    
    public String deleteContact() throws Exception{  	
    	Map request = (Map)ActionContext.getContext().getParameters(); 
    	String conId = ((String[])request.get("conId"))[0] ;    	
    	contactsService.deleteContact(conId);
    	return SUCCESS;
    }
    
    public String updateContacts() throws Exception{
    	Map request = (Map)ActionContext.getContext().getParameters();
    	String Id = ((String[])request.get("Id"))[0] ;
    	String Name = ((String[])request.get("Name"))[0] ;
    	String Tel = ((String[])request.get("Tel"))[0] ;
    	String Email = ((String[])request.get("Email"))[0] ;
    	String Company = ((String[])request.get("Company"))[0] ;
    	String Division = ((String[])request.get("Division"))[0] ;
    	String Post = ((String[])request.get("Post"))[0] ;
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
