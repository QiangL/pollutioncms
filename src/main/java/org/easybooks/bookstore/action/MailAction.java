package org.easybooks.bookstore.action;

import com.alibaba.fastjson.JSONArray;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.easybooks.bookstore.service.IContactsService;
import org.easybooks.bookstore.service.IMailService;
import org.easybooks.bookstore.vo.Mail;
import org.easybooks.bookstore.vo.Sign;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.Map;

@Entity
public class MailAction extends ActionSupport {
	@ManyToOne
	protected IMailService mailService;//为使用业务层而设置的属性
	protected IContactsService contactsService;//为使用业务层而设置的属性
	
    public String browseMail() throws Exception{		
		List mail = mailService.getAllMail();//直接调用业务层方法		
		int s = mail.size();
		JSONArray Mail_JSONarray = new JSONArray();
		for(int i=0;i<s;i++){
			Mail a = (Mail) mail.get(i);
			Mail_JSONarray.add(a);
		}	
		String Mail_strJSONArray=Mail_JSONarray.toString();
		Map request = (Map)ActionContext.getContext().get("request");
		request.put("Mail_strJSONArray", Mail_strJSONArray);
		request.put("Mail_size", mail.size());
		return SUCCESS;
	}
    
    
    public String browseWriteMail() throws Exception{   
    	List contacts =	contactsService.getAllContacts();   	
    	ActionContext.getContext().put("contactList", contacts);   
    	
    	List sign = mailService.getAllSign();
    	for(int i=0;i<sign.size();i++){
    		Sign s = (Sign)sign.get(i);
    		s.setSignText(s.getSignText().replace("\r", "\\r"));
    		s.setSignText(s.getSignText().replace("\n", "\\n"));
    	}
    	String openSign = new String();
    	for(int i=0; i<sign.size(); i++){
    		Sign s = (Sign)(sign.get(i));
    		if(s.getSignState().equals("open")) openSign = s.getSignText();
    	}   	

    	ActionContext.getContext().put("openSign", openSign);    	
    	return SUCCESS;
    }
    
    
    public String sendMail() throws Exception{
    	Map request = (Map)ActionContext.getContext().getParameters();   	
    	String destmail = ((String[])request.get("dest_email"))[0];
    	String[] toAddress = destmail.split(";");
    	for(int i=0; i<toAddress.length; i++){
        	String subject = ((String[])request.get("subject"))[0];
        	String content = ((String[]) request.get("content"))[0];
          	mailService.sendMail(toAddress[i], subject, content);
    	}    	
    	List contacts =	contactsService.getAllContacts();   	
    	ActionContext.getContext().put("contactList", contacts);
    	return SUCCESS;
    }
    
    
    public String setMail() throws Exception{
    	//静态页面显示的
    	//得到数据库中签名的标题和内容，显示到对应框框中；	
    	List sign = mailService.getAllSign();
    	
    	for(int i=0;i<sign.size();i++){
    		Sign s = (Sign)sign.get(i);
    		s.setSignText(s.getSignText().replace("\r", "\\r"));
    		s.setSignText(s.getSignText().replace("\n", "\\n"));
    	}
    	
    	ActionContext.getContext().put("signList", sign);   	
    	return SUCCESS;
    }
        

    
    public String updateSign() throws Exception{

    	Map request = (Map)ActionContext.getContext().getParameters();  
    	String text = ((String[])request.get("signText"))[0] ;	
    	String id = ((String[])request.get("_sign"))[0] ;

    	mailService.updateSign(id, text);

    	return SUCCESS;
    }
    
    public String deleteSign() throws Exception{
    	
    	Map request = (Map)ActionContext.getContext().getParameters(); 
    	String id = ((String[])request.get("_sign"))[0] ;
    	mailService.deleteSign(id);
    	
    	return SUCCESS;
    }
    
    
    public String addSign() throws Exception{
    	Map request = (Map)ActionContext.getContext().getParameters(); 
    	String title = ((String[])request.get("title"))[0] ;
    	String text = ((String[])request.get("text"))[0] ;
    	mailService.addSign(title, text);
    	
    	return SUCCESS;
    }
    
    public String deleteMail() throws Exception{  	
    	Map request = (Map)ActionContext.getContext().getParameters(); 
    	String mailId = ((String[])request.get("mailId"))[0] ;    	
    	mailService.deleteMail(mailId);
    	return SUCCESS;
    }
    
    public IMailService getMailService() {
		return mailService;
	}
		
    public void setMailService(IMailService mailService) {
		this.mailService = mailService;
	}
    
    public IContactsService getContactsService() {
		return contactsService;
	}
		
    public void setContactsService(IContactsService contactsService) {
		this.contactsService = contactsService;
	}
    

}
