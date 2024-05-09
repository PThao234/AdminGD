package org.example.adminpagegp.entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_category")
@Data
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    @Column(name = "name")
    String name;
    @Column(name = "description")
    LocalDate description;
    @Column(name = "status")
    Integer status;
    @Column(name = "created_at")
    LocalDate createdAt = LocalDate.now();
    @Column(name = "updated_at")
    LocalDate updatedAt;
    @Column(name = "created_by")
    String createdBy;
    @Column(name = "updated_by")
    String updatedBy;
}
