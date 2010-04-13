package org.eevolution.service;

import org.eevolution.ui.gwt.client.domain.ADTree;


/**
 * A simple data seeder for domain objects.
 *
 */
public class DataSeeder {

	public static ADTree generateADTree() {
		ADTree tree = new ADTree();
		tree.setAD_Client_ID(11);
		tree.setAD_Org_ID(0);
		tree.setDescription("Tree test");
		tree.setIsactive("Y");
		tree.setIsdefault("N");
		tree.setName("Tree Name");
		tree.setTreetype("M");
		return tree;
	}
}
