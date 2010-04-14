package org.eevolution.ui.gwt.client.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import net.sf.gilead.pojo.java5.LightEntity;


/**
 * The persistent class for the ad_tree database table.
 * 
 */
@Entity
@Table(name="ad_tree")
public class ADTree extends LightEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Min(11)
	@Column(name="ad_tree_id")
	private long AD_Tree_ID;

	@NotNull
	@Min(11)
	@Column(name="ad_client_id")
	private int AD_Client_ID;
	
	@NotNull
	@Min(11)
	@Column(name="ad_org_id")
	private int AD_Org_ID;

	@NotNull
	private Timestamp created;
	
	@NotNull
	private int createdby;

	private String description;

	@NotNull
	private String isactive;

	private String isallnodes;

	private String isdefault;

	@Pattern(regexp = ".+", message = "Name must not be empty!")
	private String name;

	private String processing;

	private String treetype;

	@NotNull
	private Timestamp updated;

	@NotNull
	private int updatedby;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumns({@JoinColumn(name="parent_id", referencedColumnName="AD_Tree_ID")})
	private Set<ADTreeNode> nodes = new HashSet<ADTreeNode>();
	
	public Set<ADTreeNode> getADTreeNode() {
		return nodes;
	}

	public void setInvestments(Set<ADTreeNode> nodes) {
		this.nodes = nodes;
	}

    public ADTree() {
    }

	public long getAD_Tree_ID() {
		return this.AD_Tree_ID;
	}

	public void setAD_Tree_ID(long AD_Tree_ID) {
		this.AD_Tree_ID = AD_Tree_ID;
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

	public int getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String getIsallnodes() {
		return this.isallnodes;
	}

	public void setIsallnodes(String isallnodes) {
		this.isallnodes = isallnodes;
	}

	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	public String getTreetype() {
		return this.treetype;
	}

	public void setTreetype(String treetype) {
		this.treetype = treetype;
	}

	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public int getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(int updatedby) {
		this.updatedby = updatedby;
	}

}