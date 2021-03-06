package org.brijframework.inventory.view;

import org.brijframework.atn.bean.Properties;
import org.brijframework.atn.bean.UIGraph;
import org.brijframework.beans.ModelBean;
import org.brijframework.beans.collection.ListBean;
import org.brijframework.db.processor.DBDataProcessor;
import org.brijframework.inventory.EOCategory;
import org.brijframework.inventory.EOCountFreq;
import org.brijframework.inventory.EOIngr;
import org.brijframework.inventory.EOInvApp;
import org.brijframework.inventory.EOInvUnitGroup;
import org.brijframework.inventory.EOStorage;

@UIGraph
public class UIIngrSummary extends ModelBean{

	private static final long serialVersionUID = 1L;
	
	@Properties
	public ListBean<UIUnitGroup> unitGroupList=new ListBean<>();
	
	@Properties
	public ListBean<UIIngredient> ingrList=new ListBean<>();
	
	@Properties
	public ListBean<UICategory> categoryList=new ListBean<>();
	
	@Properties
	public ListBean<UIStorage> storageList=new ListBean<>();
	
	@Properties
	public ListBean<UICountFreq> countFreqList = new ListBean<>();

	private EOInvApp eoInvApp;
	public UIIngrSummary(EOInvApp eoInvApp) {
		this.eoInvApp=eoInvApp;
		this.fillData();
	}
	
	private void fillData() {
		for(EOInvUnitGroup eoInvUnitGroup:eoInvApp.eoUnitGroupArray){
			unitGroupList.add(new UIUnitGroup(eoInvUnitGroup));
		}
		for(EOIngr eoIngr:eoInvApp.eoIngrArray){
			UIIngredient ingredient=new UIIngredient(eoIngr);
			ingredient.fillDetail();
			ingrList.add(ingredient);
		}
		for(EOCategory eoCategory:eoInvApp.eoCategoryArray){
			categoryList.add(new UICategory(eoCategory));
		}
		for (EOStorage eoStorage : eoInvApp.eoStorageArray) {
			UIStorage storage=new UIStorage(eoStorage);
			storage.loadLocations();
			storageList.add(storage);
		}
		for (EOCountFreq eoCountFreq : eoInvApp.eoCountFreqArray) {
			countFreqList.add(new UICountFreq(eoCountFreq));
		}
	}

	public static void main(String[] args) {
		EOInvApp eoInvApp=DBDataProcessor.getProcessor().findObject(EOInvApp.class, "uniqueID", 45);
		//System.out.println(eoInvApp.objectGraph());
		System.out.println(new UIIngrSummary(eoInvApp).printFullGraph());
	}
}