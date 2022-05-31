package com.pharmacy.service;


import com.pharmacy.model.District;
import com.pharmacy.repository.DistrictRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("districtService")
public class DistrictService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    DistrictRepository districtRepository;

    public District findById(int id) {
        LOGGER.info("DistrictService:findById:" + id);
        List<District> districtList = districtRepository.findAll();

        for(District district: districtList){
            if(district.getId() == id){
                return district;
            }
        }

        return null;
    }
}

