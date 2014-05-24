package com.jshop.entity;

// Generated 2014-5-24 9:01:28 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * RoleT generated by hbm2java
 */
@Entity
@Table(name = "role_t", catalog = "jshoper3")
public class RoleT implements java.io.Serializable {

	private String roleid;
	private String rolename;
	private String note;
	private Date createtime;
	private String creatorid;

	public RoleT() {
	}

	public RoleT(String roleid, String rolename, String note, Date createtime,
			String creatorid) {
		this.roleid = roleid;
		this.rolename = rolename;
		this.note = note;
		this.createtime = createtime;
		this.creatorid = creatorid;
	}

	@Id
	@Column(name = "ROLEID", unique = true, nullable = false, length = 20)
	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	@Column(name = "ROLENAME", nullable = false, length = 45)
	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	@Column(name = "NOTE", nullable = false, length = 100)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

}
