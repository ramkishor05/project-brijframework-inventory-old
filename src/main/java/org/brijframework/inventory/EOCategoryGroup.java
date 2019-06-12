package org.brijframework.inventory;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.brijframework.inventory.view.UICategory;
import org.brijframework.model.ModelBean;

@Entity
public class EOCategoryGroup implements ModelBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String categoryID;
	public String name;
	public String description;
	public String typeID;
	
	@ManyToOne
	@JoinColumn(name="InvAppID",nullable=false)
    public EOInvApp eoInvApp;
	
	@OneToMany(mappedBy="eoCategoryGroup")
	public Set<EOCategory> eoCategoryArray=new LinkedHashSet<>();
	
	public UICategory addCategory(Map<String,Object> map){
		map.put("eoCategoryGroup", this);
		map.put("eoInvApp", eoInvApp);
		EOCategory eoCategory= this.addToRel("eoCategoryArray", map);
		return new UICategory(eoCategory);
	}
}
