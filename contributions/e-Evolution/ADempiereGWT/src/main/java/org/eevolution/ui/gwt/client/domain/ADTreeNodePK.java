package org.eevolution.ui.gwt.client.domain;

import java.io.Serializable;
import javax.persistence.*;

import net.sf.gilead.pojo.gwt.LightEntity;

/**
 * The primary key class for the ad_treenode database table.
 * 
 */
@Embeddable
public class ADTreeNodePK extends LightEntity implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ad_tree_id")
	private long adTreeId;

	@Column(name="node_id")
	private long nodeId;

    public ADTreeNodePK() {
    }
	public long getAdTreeId() {
		return this.adTreeId;
	}
	public void setAdTreeId(long adTreeId) {
		this.adTreeId = adTreeId;
	}
	public long getNodeId() {
		return this.nodeId;
	}
	public void setNodeId(long nodeId) {
		this.nodeId = nodeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ADTreeNodePK)) {
			return false;
		}
		ADTreeNodePK castOther = (ADTreeNodePK)other;
		return 
			(this.adTreeId == castOther.adTreeId)
			&& (this.nodeId == castOther.nodeId);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.adTreeId ^ (this.adTreeId >>> 32)));
		hash = hash * prime + ((int) (this.nodeId ^ (this.nodeId >>> 32)));
		
		return hash;
    }
}