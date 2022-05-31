package com.pharmacy.service;


import com.pharmacy.model.PharmacyProduct;
import com.pharmacy.model.Product;
import com.pharmacy.repository.PharmacyProductRepository;
import com.pharmacy.repository.ProductRepository;
import com.sun.scenario.effect.impl.prism.PrDrawable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductService {

    private ProductRepository productRepository;
    private PharmacyProductRepository pharmacyProductRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Autowired
    public ProductService(@Qualifier("productRepository") ProductRepository productRepository, PharmacyProductRepository pharmacyProductRepository){
        this.productRepository = productRepository;
        this.pharmacyProductRepository = pharmacyProductRepository;
    }

    public Product findById(int id) {
        LOGGER.info("ProductService:findById:" + id);
        return productRepository.findById(id);
    }

    public Product findByProduct_code(String pcode){
        LOGGER.info("ProductService:findByProduct_code:" + pcode);
        return productRepository.findByProduct_code(pcode);
    }


    public List<Product> findAll () {
        LOGGER.info("ProductService:findAll:"+productRepository.findAll().size());
        return productRepository.findAll();
    }

    public PharmacyProduct createNewProduct(PharmacyProduct pharmacyProduct) {
        LOGGER.info("ProductService:createNewProduct:pharmacyProductName:"+pharmacyProduct.getProduct().getProduct_name()+" quantity:"
                + pharmacyProduct.getQuantity() + " price:" +pharmacyProduct.getPrice());
        return pharmacyProductRepository.save(pharmacyProduct);
    }

}

