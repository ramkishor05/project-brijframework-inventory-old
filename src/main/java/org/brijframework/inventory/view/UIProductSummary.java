package org.brijframework.inventory.view;

import org.brijframework.atn.bean.Properties;
import org.brijframework.atn.bean.UIGraph;
import org.brijframework.beans.ModelBean;
import org.brijframework.beans.collection.ListBean;
import org.brijframework.inventory.EOCountFreq;
import org.brijframework.inventory.EOInvApp;
import org.brijframework.inventory.EOLocation;
import org.brijframework.inventory.EOProduct;

@UIGraph
public class UIProductSummary extends ModelBean{

	private static final long serialVersionUID = 1L;

	@Properties
	public ListBean<UIProduct> productList=new ListBean<>();
	
	@Properties
	public ListBean<UILocation> locationList=new ListBean<>();
	
	@Properties
	public ListBean<UICountFreq> countFreqList = new ListBean<>();
	
	private EOInvApp eoInvApp;
	public UIProductSummary(EOInvApp eoInvApp) {
		this.eoInvApp=eoInvApp;
		this.fillData();
		
	}
	private void fillData() {
		for(EOProduct eoProduct:eoInvApp.eoProductArray){
			productList.add(new UIProduct(eoProduct));
		}
		for (EOLocation eoLocation : eoInvApp.eoLocationArray) {
			locationList.add(new UILocation(eoLocation));
		}
		for (EOCountFreq eoCountFreq : eoInvApp.eoCountFreqArray) {
			countFreqList.add(new UICountFreq(eoCountFreq));
		}
	}
}
