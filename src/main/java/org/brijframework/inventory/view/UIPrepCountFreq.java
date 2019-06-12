package org.brijframework.inventory.view;

import org.brijframework.atn.bean.UIGraph;
import org.brijframework.inventory.EOCountFreq;
import org.brijframework.inventory.EOPrepCountFreq;

@UIGraph
public class UIPrepCountFreq extends UICountFreq{
	private static final long serialVersionUID = 1L;

	public long eoPrep;
	public long eoCountFreq;
	

	public UIPrepCountFreq(EOCountFreq eoCountFreq) {
		super(eoCountFreq);
	}
	
	public void setIngr(EOPrepCountFreq countFreq) {
		this.uniqueID=countFreq.uniqueID;
		this.eoPrep=countFreq.eoPrep.uniqueID;
		this.eoCountFreq=countFreq.uniqueID;
	}
}