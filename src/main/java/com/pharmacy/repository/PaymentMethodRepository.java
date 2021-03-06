package com.pharmacy.repository;



import com.pharmacy.model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("paymentMethodRepository")
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod,Integer> {

    PaymentMethod findById(int id);

    @Override
    PaymentMethod getOne(Integer id);

    List<PaymentMethod> findAllByUserId(int userId);

    @Override
    void deleteById(Integer integer);

}

