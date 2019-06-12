package org.brijframework.inventory.view;

import org.brijframework.atn.bean.UIGraph;
import org.brijframework.inventory.EOIngrLocation;
import org.brijframework.inventory.EOLocation;

@UIGraph
public class UIIngrLocation extends UILocation {

	private static final long serialVersionUID = 1L;

	public long eoIngr;
	public long eoLocation;
	
	public UIIngrLocation(EOLocation eoLocation) {
		super(eoLocation);
	}

	public void setIngr(EOIngrLocation eoIngrLocation) {
        this.uniqueID=eoIngrLocation.uniqueID;
        this.eoIngr=eoIngrLocation.eoIngr.uniqueID;
        this.eoLocation=eoIngrLocation.eoLocation.uniqueID;
	}
}
