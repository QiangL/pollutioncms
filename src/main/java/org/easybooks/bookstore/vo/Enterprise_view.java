package org.easybooks.bookstore.vo;

/**
 * 为方便展示企业基本信息而设计的表
 * @author YX
 *
 */

public class Enterprise_view {
	private Integer EI_Ent_no;//EI_企业序号
	private String EI_Ent_name;//EI_企业名称
	private String EI_Ent_short;//EI_企业简称
	private String EI_Ent_address;//EI_企业地址
	private String EI_Env_region;//EI_地区（环境属性）
	private String EI_Env_linkman;//EI_联系人（负责人，环境属性）
	private String EI_Env_watershed;//EI_流域（环境属性）
	private String EI_Man_concern_extent;//EI_关注程度（管理属性）
	private String EI_Ent_remark;//EI_备注（基本属性里）
	
	
	
	
	public Enterprise_view() {
	}
	
	public Enterprise_view( Integer eI_Ent_no,String eI_Ent_name, String eI_Ent_short,
			String eI_Ent_address, String eI_Env_region, String eI_Env_linkman,
			String eI_Env_watershed, String eI_Man_concern_extent,
			String eI_Ent_remark) {
		super();
		EI_Ent_no = eI_Ent_no;
		EI_Ent_name = eI_Ent_name;
		EI_Ent_short = eI_Ent_short;
		EI_Ent_address = eI_Ent_address;
		EI_Env_region = eI_Env_region;
		EI_Env_linkman = eI_Env_linkman;
		EI_Env_watershed = eI_Env_watershed;
		EI_Man_concern_extent = eI_Man_concern_extent;
		EI_Ent_remark = eI_Ent_remark;
	}
	
	public Integer getEI_Ent_no() {
		return EI_Ent_no;
	}
	public void setEI_Ent_no(Integer eI_Ent_no) {
		EI_Ent_no = eI_Ent_no;
	}
	public String getEI_Ent_name() {
		return EI_Ent_name;
	}
	public void setEI_Ent_name(String eI_Ent_name) {
		EI_Ent_name = eI_Ent_name;
	}
	public String getEI_Ent_short() {
		return EI_Ent_short;
	}
	public void setEI_Ent_short(String eI_Ent_shor) {
		EI_Ent_short = eI_Ent_shor;
	}
	public String getEI_Ent_address() {
		return EI_Ent_address;
	}
	public void setEI_Ent_address(String eI_Ent_address) {
		EI_Ent_address = eI_Ent_address;
	}
	public String getEI_Env_region() {
		return EI_Env_region;
	}
	public void setEI_Env_region(String eI_Env_region) {
		EI_Env_region = eI_Env_region;
	}
	public String getEI_Env_linkman() {
		return EI_Env_linkman;
	}
	public void setEI_Env_linkman(String eI_Env_linkman) {
		EI_Env_linkman = eI_Env_linkman;
	}
	public String getEI_Env_watershed() {
		return EI_Env_watershed;
	}
	public void setEI_Env_watershed(String eI_Env_watershed) {
		EI_Env_watershed = eI_Env_watershed;
	}
	public String getEI_Man_concern_extent() {
		return EI_Man_concern_extent;
	}
	public void setEI_Man_concern_extent(String eI_Man_concern_extent) {
		EI_Man_concern_extent = eI_Man_concern_extent;
	}
	public String getEI_Ent_remark() {
		return EI_Ent_remark;
	}
	public void setEI_Ent_remark(String eI_Ent_remark) {
		EI_Ent_remark = eI_Ent_remark;
	}
	
	

}
