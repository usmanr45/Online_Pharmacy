package com.pharmacy.service;



import com.pharmacy.model.Alert;
import com.pharmacy.model.UserOrder;
import com.pharmacy.repository.AlertRepository;
import com.pharmacy.util.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service("alertService")
public class AlertService {

    AlertRepository alertRepository;

    @Autowired
    public AlertService(AlertRepository alertRepository){
        this.alertRepository = alertRepository;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @PersistenceContext
    private EntityManager entityManager;


    public Alert findById(int id) {
        LOGGER.info("AlertService:findById:" + id);
        return alertRepository.findById(id);
    }

    public List<Alert> findAllByUserOrderId(int id) {
        LOGGER.info("AlertService:findAllByUserOrderId:" + id);
        return alertRepository.findAllByUserOrderId(id);
    }

    public List<Alert> findAllByUserId(int id) {
        LOGGER.info("AlertService:findAllByUserId:" + id);
        return alertRepository.findAllByUserId(id);
    }

    public Alert createNewAlert(Alert alert) {
        LOGGER.info("AlertService:createNewAlert");
        return alertRepository.save(alert);
    }

    @Transactional
    public Alert update (Alert alert) {
        LOGGER.info("AlertService:update:alertId:" + alert.getId());
        entityManager.merge(alert);
        return alert;
    }
}

