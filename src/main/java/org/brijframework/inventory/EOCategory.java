package org.brijframework.inventory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.brijframework.model.ModelBean;

@Entity
public  class EOCategory implements ModelBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	public String categoryID;
	public String name;
	public String description;
	public String typeID;

	@ManyToOne
	@JoinColumn(name="InvAppID",nullable=false)
    public EOInvApp eoInvApp;
	
	@ManyToOne
	@JoinColumn(name = "CategoryGroupID",nullable=false)
	public EOCategoryGroup eoCategoryGroup;
	
}
