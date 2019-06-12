package org.brijframework.inventory.view;

import java.util.ArrayList;
import java.util.List;

import org.brijframework.inventory.EOCategory;
import org.brijframework.inventory.EOCategoryGroup;
import org.brijframework.model.ModelBean;

public class UICategoryGroup implements ModelBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Object uniqueID;
	public String categoryID;
	public String name;
	public String description;
	public String typeID;
	
	public List<UICategory> categoryArray=new ArrayList<>();
	
	private EOCategoryGroup categoryGroup;
	
	public UICategoryGroup(EOCategoryGroup categoryGroup) {
		this.categoryGroup=categoryGroup;
		this.fillData();
	}
	
	public void fillData(){
		this.uniqueID=this.categoryGroup.uniqueID;
		this.categoryID=this.categoryGroup.categoryID;
		this.name=this.categoryGroup.name;
		this.description=this.categoryGroup.description;
		this.typeID=this.categoryGroup.typeID;
		for(EOCategory eoCategory:this.categoryGroup.eoCategoryArray){
			categoryArray.add(new UICategory(eoCategory));
		}
	}
}
