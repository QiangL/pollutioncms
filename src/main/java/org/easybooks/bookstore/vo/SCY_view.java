package org.easybooks.bookstore.vo;


/**
 * @author YX
 *
 */
public class SCY_view {
	//数采仪信息展示类
	int V_SCY_no;
	String in_out_name;
	String V_SCY_Ent_Name;
	String V_SCY_region;
	String V_MN_No;
	String V_SCY_type;
	String V_SCY_state;
	String V_SCY_date;
	
	public SCY_view() {
	}

	public SCY_view(int v_SCY_no, String in_out_name, String v_SCY_Ent_Name,
			String v_SCY_region, String v_MN_No, String v_SCY_type,
			String v_SCY_state, String v_SCY_date) {
		super();
		V_SCY_no = v_SCY_no;
		this.in_out_name = in_out_name;
		V_SCY_Ent_Name = v_SCY_Ent_Name;
		V_SCY_region = v_SCY_region;
		V_MN_No = v_MN_No;
		V_SCY_type = v_SCY_type;
		V_SCY_state = v_SCY_state;
		V_SCY_date = v_SCY_date;
	}

	public int getV_SCY_no() {
		return V_SCY_no;
	}

	public void setV_SCY_no(int v_SCY_no) {
		V_SCY_no = v_SCY_no;
	}

	public String getIn_out_name() {
		return in_out_name;
	}

	public void setIn_out_name(String in_out_name) {
		this.in_out_name = in_out_name;
	}

	public String getV_SCY_Ent_Name() {
		return V_SCY_Ent_Name;
	}

	public void setV_SCY_Ent_Name(String v_SCY_Ent_Name) {
		V_SCY_Ent_Name = v_SCY_Ent_Name;
	}

	public String getV_SCY_region() {
		return V_SCY_region;
	}

	public void setV_SCY_region(String v_SCY_region) {
		V_SCY_region = v_SCY_region;
	}

	public String getV_MN_No() {
		return V_MN_No;
	}

	public void setV_MN_No(String v_MN_No) {
		V_MN_No = v_MN_No;
	}

	public String getV_SCY_type() {
		return V_SCY_type;
	}

	public void setV_SCY_type(String v_SCY_type) {
		V_SCY_type = v_SCY_type;
	}

	public String getV_SCY_state() {
		return V_SCY_state;
	}

	public void setV_SCY_state(String v_SCY_state) {
		V_SCY_state = v_SCY_state;
	}

	public String getV_SCY_date() {
		return V_SCY_date;
	}

	public void setV_SCY_date(String v_SCY_date) {
		V_SCY_date = v_SCY_date;
	}
	
	
	
}
