package org.eevolution.service;

import static org.junit.Assert.assertEquals;

import org.eevolution.ui.gwt.client.ADTreeService;
import org.eevolution.ui.gwt.client.domain.ADTree;
import org.eevolution.ui.gwt.client.domain.ADTreeNode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * A simple integration test for ADTreeService.
 * 
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager")
@ContextConfiguration(locations = { "classpath:ADManager-test.xml" })
public class ADTreeServiceTest {

	@Autowired
	private ADTreeService service;
	
	@Before
	public void setup(){
		Authentication authRequest = new UsernamePasswordAuthenticationToken("ignored", "ignored", AuthorityUtils.createAuthorityList("ROLE_ADMIN"));
	    SecurityContextHolder.getContext().setAuthentication(authRequest);

	}

	//@Test
	//@Rollback
	public void testPersist() {
		ADTree tree = DataSeeder.generateADTree();
		tree.setCreatedby(11);
		service.persist(tree);
		assertEquals("Tree Test", service.find(tree.getAD_Tree_ID()).getName());
	}

	//@Test
	//@Rollback
	public void testUpdate() {
		ADTree tree = DataSeeder.generateADTree();
		service.persist(tree);
		tree.setName("Tree Update");
		service.merge(tree);
		assertEquals("Tree Update", service.find(tree.getAD_Tree_ID()).getName());
	}

	//@Test
	//@Rollback
	public void testDelete() {
		ADTree tree = DataSeeder.generateADTree();
		service.persist(tree);
		service.remove(tree);
		assertEquals(1l, service.findAll().size());
	}

	//@Test
	//@Rollback
	public void testRead() {
		ADTree tree = DataSeeder.generateADTree();
		service.persist(tree);
		ADTree result = service.find(tree.getAD_Tree_ID());
		assertEquals("Tree Test", result.getName());
		assertEquals("Tree Test", result.getDescription());
	}

	//@Test
	//@Rollback
	public void testFindByName() {
		service.persist(DataSeeder.generateADTree());
		assertEquals("Tree Test", service.findByName("Tree Test").get(0).getName());
	}
	
	@Test
	@Rollback
	public void testGetAll() {
		//service.persist(DataSeeder.generateADTree());
		for (ADTree tree : service.findAll())
		{	
			System.out.println(tree.getName());
			for (ADTreeNode node: tree.getADTreeNode())
			{
				System.out.println("-------------------------------------");
//				System.out.println("Tree id:"+ node.getParentId());
				System.out.println("Node id"+ node.getId());
//				System.out.println("Node Seq"+ node.getSeqno());
				
			}
		}	
	}
	
	@After
	public void tearDown(){
		SecurityContextHolder.clearContext();
	}
}
