package com.pharmacystore.service;

import java.util.List;

import com.pharmacystore.exceptions.DrugIdNotFoundException;
import com.pharmacystore.exceptions.DrugNotFoundException;
import com.pharmacystore.model.Drugs;

public interface IPharmacyService {
	public void addDrug(Drugs drug);
	public void deleteDrug(int drugId);
	public void updateDrug(String category ,int drugId);
	public List<Drugs> getAlldrugs();
	public List<Drugs> getDrugsByCategory(String category)throws DrugNotFoundException;
	public Drugs getDrugById(int drugID)throws DrugIdNotFoundException;
}
