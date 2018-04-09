package org.easybooks.bookstore.vo;

/**
 * 进水口信息展示
 * @author YX
 *
 */

public class Inlet_view {
	private Integer IV_no;//进水口信息表编号
	private Integer Ent_no;//企业序号
	private Integer SCY_no;//数采仪序号
	private String Ent_name;//污染源名称
	private String Env_region;//所属区县
	private String In_clean_name;//进水口名称
	private String In_water_no;//进水口编号
	private String In_range;//集纳范围
	private String In_location;//进水口位置
	private String In_state;//进水口状态
	private String In_report_MN;//进水口信息表上报MN号
	
	public Inlet_view() {
	}

	public Inlet_view(Integer iV_no, Integer ent_no, Integer sCY_no,
			String ent_name, String env_region, String in_clean_name,
			String in_water_no, String in_range, String in_location,
			String in_state, String in_report_MN) {
		super();
		IV_no = iV_no;
		Ent_no = ent_no;
		SCY_no = sCY_no;
		Ent_name = ent_name;
		Env_region = env_region;
		In_clean_name = in_clean_name;
		In_water_no = in_water_no;
		In_range = in_range;
		In_location = in_location;
		In_state = in_state;
		In_report_MN = in_report_MN;
	}

	public Integer getIV_no() {
		return IV_no;
	}

	public void setIV_no(Integer iV_no) {
		IV_no = iV_no;
	}

	public Integer getEnt_no() {
		return Ent_no;
	}

	public void setEnt_no(Integer ent_no) {
		Ent_no = ent_no;
	}

	public Integer getSCY_no() {
		return SCY_no;
	}

	public void setSCY_no(Integer sCY_no) {
		SCY_no = sCY_no;
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

	public String getIn_clean_name() {
		return In_clean_name;
	}

	public void setIn_clean_name(String in_clean_name) {
		In_clean_name = in_clean_name;
	}

	public String getIn_water_no() {
		return In_water_no;
	}

	public void setIn_water_no(String in_water_no) {
		In_water_no = in_water_no;
	}

	public String getIn_range() {
		return In_range;
	}

	public void setIn_range(String in_range) {
		In_range = in_range;
	}

	public String getIn_location() {
		return In_location;
	}

	public void setIn_location(String in_location) {
		In_location = in_location;
	}

	public String getIn_state() {
		return In_state;
	}

	public void setIn_state(String in_state) {
		In_state = in_state;
	}

	public String getIn_report_MN() {
		return In_report_MN;
	}

	public void setIn_report_MN(String in_report_MN) {
		In_report_MN = in_report_MN;
	}
	
	
	
}
