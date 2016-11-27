package com.amit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amit.dao.districtDao;
import com.amit.entity.district;

@Service
public class districtServiceImpl implements districtService {
	
	@Autowired
	private districtDao distDao;

	@Override
	@Transactional
	public void addDistrict(district district) {
		distDao.addDistrict(district);
		
	}

	@Override
	@Transactional
	public List<district> getAllDistrict() {
		
		return distDao.getAllDistrict();
	}

	@Override
	@Transactional
	public void deleteDistricte(Integer districtId) {
		distDao.deleteDistricte(districtId);
		
	}

}
