package com.pharmacy.service;



import com.pharmacy.model.Country;
import com.pharmacy.model.District;
import com.pharmacy.model.Province;
import com.pharmacy.repository.CountryRepository;
import com.pharmacy.repository.DistrictRepository;
import com.pharmacy.repository.ProvinceRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("addressService")
public class AddressService {

    private CountryRepository countryRepository;
    private ProvinceRepository provinceRepository;
    private DistrictRepository districtRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    public AddressService(CountryRepository countryRepository, ProvinceRepository provinceRepository, DistrictRepository districtRepository){
        this.countryRepository = countryRepository;
        this.provinceRepository = provinceRepository;
        this.districtRepository = districtRepository;
    }

    public Country findCountryById(int id) {
        LOGGER.info("PharmacyProduct:findCountryById:" + id);
        return countryRepository.findById(id);
    }

    public List<Country> findAllCountry () {
        LOGGER.info("PharmacyProduct:findAllCountry:" + countryRepository.findAll().size());
        return countryRepository.findAll();
    }

    public List<Province> findAllProvinces () {
        LOGGER.info("PharmacyProduct:findAllProvinces:" + countryRepository.findAll().size());
        return provinceRepository.findAll();
    }

    public List<District> findAllDistricts () {
        LOGGER.info("PharmacyProduct:findAllDistricts:" + countryRepository.findAll().size());
        return districtRepository.findAll();
    }

}

