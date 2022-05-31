package com.pharmacy.repository;



import com.pharmacy.model.Country;
import com.pharmacy.model.District;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("districtRepository")
public interface DistrictRepository extends JpaRepository<District,Integer> {

    District findById(int id);

    @Override
    List<District> findAll();

}

