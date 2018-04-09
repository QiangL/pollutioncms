package org.easybooks.bookstore.action.form;

import com.opensymphony.xwork2.ActionSupport;
import org.easybooks.bookstore.dao.IEnvByNoDAO;
import org.easybooks.bookstore.vo.Enterprise;
import org.easybooks.bookstore.vo.Outfall;

import java.util.List;

public class Outfall_formAction extends ActionSupport{
	
	private String Ent_no;
	
	private String Out_name,Out_water_name,Out_regular,Out_direction,Out_location,Out_type,Out_form;
	private String Out_net,Out_data_report,Out_tributary,Out_waters_function;
	private String Out_latitude,Out_longitude,Out_sampling_type,Out_watershed,Out_report_no,Out_report_MN,Out_state,Out_water_system;
	private String Out_section,Out_domain;
	
	@Override  
    public String execute() throws Exception {  
		System.out.println("Outfall_formAction starting~~~");
		
		
		//System.out.println("Outfall_formAction Ent_no"+Ent_no);
		
		//Outfall对象
		Outfall outfall = new Outfall();
		
		//外键的Enterprise对象
		Integer ent_no = Integer.parseInt(Ent_no);
		IEnvByNoDAO envByNoDAO = null;
		List ents = envByNoDAO.getEnvironmentByEnt_no(ent_no);
		Enterprise ent = (Enterprise) ents.get(0);
		
		outfall.setEnterprise(ent);
		outfall.setOutName(Out_name);
		outfall.setOutWaterName(Out_water_name);
		
		
		
        return SUCCESS;  
          
    }  

	
	
	public String getOut_name() {
		return Out_name;
	}

	public void setOut_name(String out_name) {
		Out_name = out_name;
	}

	public String getOut_water_name() {
		return Out_water_name;
	}

	public void setOut_water_name(String out_water_name) {
		Out_water_name = out_water_name;
	}

	public String getOut_regular() {
		return Out_regular;
	}

	public void setOut_regular(String out_regular) {
		Out_regular = out_regular;
	}

	public String getOut_direction() {
		return Out_direction;
	}

	public void setOut_direction(String out_direction) {
		Out_direction = out_direction;
	}

	public String getOut_location() {
		return Out_location;
	}

	public void setOut_location(String out_location) {
		Out_location = out_location;
	}

	public String getOut_type() {
		return Out_type;
	}

	public void setOut_type(String out_type) {
		Out_type = out_type;
	}

	public String getOut_form() {
		return Out_form;
	}

	public void setOut_form(String out_form) {
		Out_form = out_form;
	}

	public String getOut_net() {
		return Out_net;
	}

	public void setOut_net(String out_net) {
		Out_net = out_net;
	}

	public String getOut_data_report() {
		return Out_data_report;
	}

	public void setOut_data_report(String out_data_report) {
		Out_data_report = out_data_report;
	}

	public String getOut_tributary() {
		return Out_tributary;
	}

	public void setOut_tributary(String out_tributary) {
		Out_tributary = out_tributary;
	}

	public String getOut_waters_function() {
		return Out_waters_function;
	}

	public void setOut_waters_function(String out_waters_function) {
		Out_waters_function = out_waters_function;
	}

	public String getOut_latitude() {
		return Out_latitude;
	}

	public void setOut_latitude(String out_latitude) {
		Out_latitude = out_latitude;
	}

	public String getOut_longitude() {
		return Out_longitude;
	}

	public void setOut_longitude(String out_longitude) {
		Out_longitude = out_longitude;
	}

	public String getOut_sampling_type() {
		return Out_sampling_type;
	}

	public void setOut_sampling_type(String out_sampling_type) {
		Out_sampling_type = out_sampling_type;
	}

	public String getOut_watershed() {
		return Out_watershed;
	}

	public void setOut_watershed(String out_watershed) {
		Out_watershed = out_watershed;
	}

	public String getOut_report_no() {
		return Out_report_no;
	}

	public void setOut_report_no(String out_report_no) {
		Out_report_no = out_report_no;
	}

	public String getOut_report_MN() {
		return Out_report_MN;
	}

	public void setOut_report_MN(String out_report_MN) {
		Out_report_MN = out_report_MN;
	}

	public String getOut_state() {
		return Out_state;
	}

	public void setOut_state(String out_state) {
		Out_state = out_state;
	}

	public String getOut_water_system() {
		return Out_water_system;
	}

	public void setOut_water_system(String out_water_system) {
		Out_water_system = out_water_system;
	}

	public String getOut_section() {
		return Out_section;
	}

	public void setOut_section(String out_section) {
		Out_section = out_section;
	}

	public String getOut_domain() {
		return Out_domain;
	}

	public void setOut_domain(String out_domain) {
		Out_domain = out_domain;
	}

	
	public String getEnt_no() {
		return Ent_no;
	}

	public void setEnt_no(String ent_no) {
		Ent_no = ent_no;
	}
	
	
	
	/*
	public String saveOutfall()throws Exception{
		System.out.println("Outfall_formAction starting ~~~");
		return SUCCESS;
	}
	*/
	
//	public void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException,Exception{  
//        System.out.println("Outfall_formAction starting ~~~");
//		
//		//得到form表单得到的属性
//		String ent_no = request.getParameter("Ent_no");
//		System.out.println("Outfall_formAction ent_no = "+ent_no);
//		String out_name = request.getParameter("Out_name");
//		String out_water_no = request.getParameter("Out_water_no");
//		System.out.println("Outfall_formAction out_name = "+out_name+"   out_water_no="+out_water_no);
//		
//		
//	} 
	
//	public String saveOutfall(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException,Exception{
//		System.out.println("Outfall_formAction starting ~~~");
//		
//		//得到form表单得到的属性
//		String ent_no = request.getParameter("Ent_no");
//		System.out.println("Outfall_formAction ent_no = "+ent_no);
//		String out_name = request.getParameter("Out_name");
//		String out_water_no = request.getParameter("Out_water_no");
//		System.out.println("Outfall_formAction out_name = "+out_name+"   out_water_no="+out_water_no);
//		
//		
//		//Outfall对象
//		//Outfall outfall = new Outfall();
//		
//		return SUCCESS;
//	}
//	
	
	

}


















