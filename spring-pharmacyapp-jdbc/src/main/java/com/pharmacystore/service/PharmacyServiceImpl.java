package com.pharmacystore.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacystore.dao.IPharmacyRepository;
import com.pharmacystore.exceptions.DrugIdNotFoundException;
import com.pharmacystore.exceptions.DrugNotFoundException;
import com.pharmacystore.model.Drugs;
@Service
public class PharmacyServiceImpl implements IPharmacyService {
	
	IPharmacyRepository istorage;
    @Autowired
	public void setIstorage(IPharmacyRepository istorage) {
		this.istorage = istorage;
	}
	@Override
	public void addDrug(Drugs drug) {
		istorage.addDrug(drug);
		
	}
	@Override
	public void deleteDrug(int drugId) {
		istorage.deleteDrug(drugId);
	}
	@Override
	public void updateDrug(String category,int drugId) {
		istorage.updateDrug(category, drugId);
		
	}
	@Override
	public List<Drugs> getAlldrugs() {
		// TODO Auto-generated method stub
		return istorage.findall();
	}
	@Override
	public List<Drugs> getDrugsByCategory(String category) throws DrugNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Drugs getDrugById(int drugID) throws DrugIdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
