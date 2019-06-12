package org.brijframework.inventory.view;

import org.brijframework.atn.bean.UIGraph;
import org.brijframework.inventory.EOCountFreq;
import org.brijframework.inventory.EOIngrCountFreq;

@UIGraph
public class UIIngrCountFreq extends UICountFreq{
	private static final long serialVersionUID = 1L;

	public long eoIngr;
	public long eoCountFreq;

	public UIIngrCountFreq(EOCountFreq eoCountFreq) {
		super(eoCountFreq);
	}
	
	public void setIngr(EOIngrCountFreq countFreq) {
		this.uniqueID=countFreq.uniqueID;
		this.eoIngr=countFreq.eoIngr.uniqueID;
		this.eoCountFreq=countFreq.eoCountFreq.uniqueID;
	}
}


