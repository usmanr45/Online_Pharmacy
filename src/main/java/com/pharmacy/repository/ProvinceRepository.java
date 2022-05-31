package com.pharmacy.repository;



import com.pharmacy.model.District;
import com.pharmacy.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("provinceRepository")
public interface ProvinceRepository extends JpaRepository<Province, Integer> {

    Province findById(long id);

    @Override
    List<Province> findAll();
}
