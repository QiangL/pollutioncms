package org.easybooks.bookstore.vo;

/**
 * 排水口信息展示表
 * @author YX
 *
 */

public class Outfall_view {
	private Integer OV_no;//序号
	
	private String Ent_name;//污染源名称(基本信息表)
	
	private String Env_region;//所属区县
	
	private String Out_name;//排放口名称
	private String Out_water_no;//排放口编号
	private String Out_location;//排水口位置
	private String Out_net;//是否联网
	private String Out_data_report;//排水数据上报
	private String Out_state;//排水口状态
	private String Out_report_MN;//排水口信息表
	
	public Outfall_view() {
		
	}

	public Outfall_view(Integer oV_no, String ent_name, String env_region,
			String out_name, String out_water_no, String out_location,
			String out_net, String out_data_report, String out_state,
			String out_report_MN) {
		super();
		OV_no = oV_no;
		Ent_name = ent_name;
		Env_region = env_region;
		Out_name = out_name;
		Out_water_no = out_water_no;
		Out_location = out_location;
		Out_net = out_net;
		Out_data_report = out_data_report;
		Out_state = out_state;
		Out_report_MN = out_report_MN;
	}

	public Integer getOV_no() {
		return OV_no;
	}

	public void setOV_no(Integer oV_no) {
		OV_no = oV_no;
	}
	public String getEnt_name() {
		return Ent_name;
	}

	public void setEnt_name(String ent_name) {
		Ent_name = ent_name;
	}

	public String getEnv_region() {
		return Env_region;
	}

	public void setEnv_region(String env_region) {
		Env_region = env_region;
	}

	public String getOut_name() {
		return Out_name;
	}

	public void setOut_name(String out_name) {
		Out_name = out_name;
	}

	public String getOut_water_no() {
		return Out_water_no;
	}

	public void setOut_water_no(String out_water_no) {
		Out_water_no = out_water_no;
	}

	public String getOut_location() {
		return Out_location;
	}

	public void setOut_location(String out_location) {
		Out_location = out_location;
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

	public String getOut_state() {
		return Out_state;
	}

	public void setOut_state(String out_state) {
		Out_state = out_state;
	}

	public String getOut_report_MN() {
		return Out_report_MN;
	}

	public void setOut_report_MN(String out_report_MN) {
		Out_report_MN = out_report_MN;
	}
	

}
