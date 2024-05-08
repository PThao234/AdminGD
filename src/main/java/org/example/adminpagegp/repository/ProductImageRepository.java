package org.example.adminpagegp.repository;

import org.example.adminpagegp.entity.ProductImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImageRepository extends JpaRepository<ProductImages,String> {
}
