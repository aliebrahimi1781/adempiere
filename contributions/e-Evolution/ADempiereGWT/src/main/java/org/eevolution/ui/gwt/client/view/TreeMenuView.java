//TODO:Copyright message should go here!
package org.eevolution.ui.gwt.client.view;

import org.eevolution.ui.gwt.client.view.interfaces.ITreeView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * ADempiere GWT TreeView
 * @author <a href="mailto:juan.perez@e-evolution.com">Juan Carlos Perez</a>
 * @version $Id: TreeView.java, v 1.0 Feb 16, 2010
 */
public class TreeMenuView extends Composite implements ITreeView {

	private static TreeMenuViewUiBinder uiBinder = GWT
	.create(TreeMenuViewUiBinder.class);

	interface TreeMenuViewUiBinder extends UiBinder<Widget, TreeMenuView> {
	}
	private SuggestBox suggestBox;

	@UiField Tree treeMenu;
	@UiField VerticalPanel suggestPanel;

	public TreeMenuView() {
		initWidget(uiBinder.createAndBindUi(this));
		initialize();
	}

	@Override
	public void changeWindow() {
		// TODO Auto-generated method stub

	}

	@Override
	public void closeWindow() {
		// TODO Auto-generated method stub

	}

	@Override
	public Widget getViewWidget() {
		return this;
	}

	@Override
	public void initialize() {
		createTree();
		createSuggestMenu();
	}

	@Override
	public void openWindow() {
		// TODO Auto-generated method stub

	}

	private void createTree(){
		TreeItem item = new TreeItem("System Admin");
		item.addItem("General Rules");
		item.addItem("Client Rules");
		item.addItem("Organization Rules");
		treeMenu.addItem(item);
		item = new TreeItem("Application Dictionary");
		item.addItem("Search Definition");
		item.addItem("Entity Type");
		item.addItem("Element");
		treeMenu.addItem(item);
		item = new TreeItem("Partner Relations");
		item.addItem("Request");
		item.addItem("Sales Rep Info");
		item.addItem("Mail Template");
		treeMenu.addItem(item);
	}

	private void createSuggestMenu(){
		MultiWordSuggestOracle oracle = new MultiWordSuggestOracle();
		oracle.add("General Rules");
		oracle.add("Client Rules");
		oracle.add("Organization Rules");
		oracle.add("Element");
		oracle.add("Request");
		suggestBox = new SuggestBox(oracle);
		suggestBox.setHeight("2em");
		suggestPanel.setHeight("3em");
		suggestPanel.add(suggestBox);
	}

}
