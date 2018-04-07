package com.pollutioncms.module.domain;

import java.io.Serializable;

public class User implements Serializable {
    private String id;

    private String cname;

    private String ename;

    private String pwd;

    private String loginname;

    private String sex;

    private String dateofbirth;

    private String extension;

    private String photourl;

    private String deptid;

    private String navigationid;

    private String applicationid;

    private String lasturl;

    private String theme;

    private String portalname;

    private String portalid;

    private String roles;

    private String navigation;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth == null ? null : dateofbirth.trim();
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl == null ? null : photourl.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getNavigationid() {
        return navigationid;
    }

    public void setNavigationid(String navigationid) {
        this.navigationid = navigationid == null ? null : navigationid.trim();
    }

    public String getApplicationid() {
        return applicationid;
    }

    public void setApplicationid(String applicationid) {
        this.applicationid = applicationid == null ? null : applicationid.trim();
    }

    public String getLasturl() {
        return lasturl;
    }

    public void setLasturl(String lasturl) {
        this.lasturl = lasturl == null ? null : lasturl.trim();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme == null ? null : theme.trim();
    }

    public String getPortalname() {
        return portalname;
    }

    public void setPortalname(String portalname) {
        this.portalname = portalname == null ? null : portalname.trim();
    }

    public String getPortalid() {
        return portalid;
    }

    public void setPortalid(String portalid) {
        this.portalid = portalid == null ? null : portalid.trim();
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles == null ? null : roles.trim();
    }

    public String getNavigation() {
        return navigation;
    }

    public void setNavigation(String navigation) {
        this.navigation = navigation == null ? null : navigation.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCname() == null ? other.getCname() == null : this.getCname().equals(other.getCname()))
            && (this.getEname() == null ? other.getEname() == null : this.getEname().equals(other.getEname()))
            && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd()))
            && (this.getLoginname() == null ? other.getLoginname() == null : this.getLoginname().equals(other.getLoginname()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getDateofbirth() == null ? other.getDateofbirth() == null : this.getDateofbirth().equals(other.getDateofbirth()))
            && (this.getExtension() == null ? other.getExtension() == null : this.getExtension().equals(other.getExtension()))
            && (this.getPhotourl() == null ? other.getPhotourl() == null : this.getPhotourl().equals(other.getPhotourl()))
            && (this.getDeptid() == null ? other.getDeptid() == null : this.getDeptid().equals(other.getDeptid()))
            && (this.getNavigationid() == null ? other.getNavigationid() == null : this.getNavigationid().equals(other.getNavigationid()))
            && (this.getApplicationid() == null ? other.getApplicationid() == null : this.getApplicationid().equals(other.getApplicationid()))
            && (this.getLasturl() == null ? other.getLasturl() == null : this.getLasturl().equals(other.getLasturl()))
            && (this.getTheme() == null ? other.getTheme() == null : this.getTheme().equals(other.getTheme()))
            && (this.getPortalname() == null ? other.getPortalname() == null : this.getPortalname().equals(other.getPortalname()))
            && (this.getPortalid() == null ? other.getPortalid() == null : this.getPortalid().equals(other.getPortalid()))
            && (this.getRoles() == null ? other.getRoles() == null : this.getRoles().equals(other.getRoles()))
            && (this.getNavigation() == null ? other.getNavigation() == null : this.getNavigation().equals(other.getNavigation()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCname() == null) ? 0 : getCname().hashCode());
        result = prime * result + ((getEname() == null) ? 0 : getEname().hashCode());
        result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
        result = prime * result + ((getLoginname() == null) ? 0 : getLoginname().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getDateofbirth() == null) ? 0 : getDateofbirth().hashCode());
        result = prime * result + ((getExtension() == null) ? 0 : getExtension().hashCode());
        result = prime * result + ((getPhotourl() == null) ? 0 : getPhotourl().hashCode());
        result = prime * result + ((getDeptid() == null) ? 0 : getDeptid().hashCode());
        result = prime * result + ((getNavigationid() == null) ? 0 : getNavigationid().hashCode());
        result = prime * result + ((getApplicationid() == null) ? 0 : getApplicationid().hashCode());
        result = prime * result + ((getLasturl() == null) ? 0 : getLasturl().hashCode());
        result = prime * result + ((getTheme() == null) ? 0 : getTheme().hashCode());
        result = prime * result + ((getPortalname() == null) ? 0 : getPortalname().hashCode());
        result = prime * result + ((getPortalid() == null) ? 0 : getPortalid().hashCode());
        result = prime * result + ((getRoles() == null) ? 0 : getRoles().hashCode());
        result = prime * result + ((getNavigation() == null) ? 0 : getNavigation().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cname=").append(cname);
        sb.append(", ename=").append(ename);
        sb.append(", pwd=").append(pwd);
        sb.append(", loginname=").append(loginname);
        sb.append(", sex=").append(sex);
        sb.append(", dateofbirth=").append(dateofbirth);
        sb.append(", extension=").append(extension);
        sb.append(", photourl=").append(photourl);
        sb.append(", deptid=").append(deptid);
        sb.append(", navigationid=").append(navigationid);
        sb.append(", applicationid=").append(applicationid);
        sb.append(", lasturl=").append(lasturl);
        sb.append(", theme=").append(theme);
        sb.append(", portalname=").append(portalname);
        sb.append(", portalid=").append(portalid);
        sb.append(", roles=").append(roles);
        sb.append(", navigation=").append(navigation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}