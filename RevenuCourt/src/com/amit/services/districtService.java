package com.amit.services;

import java.util.List;

import com.amit.entity.district;

public interface districtService {
		public void addDistrict(district district);
	    public List<district> getAllDistrict();
	    public void deleteDistricte(Integer districtId);
	}


