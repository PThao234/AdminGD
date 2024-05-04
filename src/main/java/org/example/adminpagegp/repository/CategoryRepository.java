package org.example.adminpagegp.repository;

import org.example.adminpagegp.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Categories,String> {
}
