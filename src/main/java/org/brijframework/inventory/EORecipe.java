package org.brijframework.inventory;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.brijframework.beans.DataBean;

@Entity
public  class EORecipe extends DataBean{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public float qnt; 

	@ManyToOne
	@JoinColumn(name="PrepID")
	public EOPrep eoPrep;
	
	@ManyToOne
	@JoinColumn(name="ProductID")
	public EOProduct eoProduct;
}
