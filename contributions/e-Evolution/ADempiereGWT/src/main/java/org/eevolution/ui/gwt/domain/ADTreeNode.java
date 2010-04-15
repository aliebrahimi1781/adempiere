package org.eevolution.ui.gwt.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import net.sf.gilead.pojo.gwt.LightEntity;


/**
 * The persistent class for the ad_treenode database table.
 * 
 */
@SuppressWarnings("serial")
@Entity
@Table(name="ad_treenode")
public class ADTreeNode extends LightEntity implements Serializable {

	@EmbeddedId
	private ADTreeNodePK id;

	@Column(name="ad_client_id")
	private int AD_Client_ID;

	@Column(name="ad_org_id")
	private int AD_Org_ID;

	private Timestamp created;

	private BigDecimal createdby;

	private String isactive;

	@Column(name="parent_id")
	private BigDecimal parentId;

	private BigDecimal seqno;

	private Timestamp updated;

	private BigDecimal updatedby;

    public ADTreeNode() {
    }

	public ADTreeNodePK getId() {
		return this.id;
	}

	public void setId(ADTreeNodePK id) {
		this.id = id;
	}
	
	public int getAD_Client_ID() {
		return this.AD_Client_ID;
	}

	public void setAD_Client_ID(int AD_Client_ID) {
		this.AD_Client_ID = AD_Client_ID;
	}

	public int getAD_Org_ID() {
		return this.AD_Org_ID;
	}

	public void setAD_Org_ID(int AD_Org_ID) {
		this.AD_Org_ID = AD_Org_ID;
	}

	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public BigDecimal getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(BigDecimal createdby) {
		this.createdby = createdby;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public BigDecimal getParentId() {
		return this.parentId;
	}

	public void setParentId(BigDecimal parentId) {
		this.parentId = parentId;
	}

	public BigDecimal getSeqno() {
		return this.seqno;
	}

	public void setSeqno(BigDecimal seqno) {
		this.seqno = seqno;
	}

	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public BigDecimal getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(BigDecimal updatedby) {
		this.updatedby = updatedby;
	}

}