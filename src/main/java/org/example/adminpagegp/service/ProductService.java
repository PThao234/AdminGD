package org.example.adminpagegp.service;

import lombok.extern.slf4j.Slf4j;
import org.example.adminpagegp.dto.SearchKey;
import org.example.adminpagegp.entity.Products;
import org.example.adminpagegp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Products create(Products products){
        return productRepository.save(products);
    }

    public Products update(Products products){
        return productRepository.save(products);
    }

    public Products softDelete(String id){
        Products product =  productRepository.findById(id).orElse(null);
        if(product != null) {
//            product.setStatus(2);
            return productRepository.save(product);
        }else{
//            log.error("Sản phẩm không tồn tại");
        }
        return null;
    }

    public Page<Products> search(SearchKey searchKey){

        return null;
    }
}
