package org.brijframework.inventory.view;

import org.brijframework.atn.bean.Properties;
import org.brijframework.atn.bean.UIGraph;
import org.brijframework.beans.collection.ListBean;
import org.brijframework.inventory.EOCategory;
import org.brijframework.inventory.EOCategoryGroup;
import org.brijframework.inventory.EOInvApp;

@UIGraph
public class UICategorySummary {

	@Properties
	public ListBean<UICategoryGroup> categoryGroups=new ListBean<>();
	
	@Properties
	public ListBean<UICategory> categoryList=new ListBean<>();
	
	private EOInvApp eoInvApp;
	public UICategorySummary(EOInvApp eoInvApp) {
		this.eoInvApp=eoInvApp;
		this.fillData();
	}
	
	private void fillData() {
		for(EOCategory eoCategory:eoInvApp.eoCategoryArray){
			categoryList.add(new UICategory(eoCategory));
		}
		for(EOCategoryGroup eoCategory:eoInvApp.eoCategoryGroupArray){
			categoryGroups.add(new UICategoryGroup(eoCategory));
		}
	}
}
