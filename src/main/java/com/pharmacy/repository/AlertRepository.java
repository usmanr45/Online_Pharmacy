package com.pharmacy.repository;



import com.pharmacy.model.Alert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlertRepository extends JpaRepository<Alert, Integer> {

    Alert findById(int id);

    List<Alert> findAllByUserOrderId(int id);

    List<Alert> findAllByUserId(int id);

}

