package org.brijframework.inventory;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.brijframework.IAppMain;
import org.brijframework.model.ModelBean;

@Entity
public class EOInvApp implements IAppMain , ModelBean{

	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOCountFreq> eoCountFreqArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOInvUnitGroup> eoUnitGroupArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOProduct> eoProductArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOIngr> eoIngrArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOPrep> eoPrepArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOCategory> eoCategoryArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOCategoryGroup> eoCategoryGroupArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOStorage> eoStorageArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoInvApp")
	public Set<EOLocation> eoLocationArray = new LinkedHashSet<>();


}
