package org.example.adminpagegp.entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Enabled
@Table(name = "tbl_category")
public class Categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private boolean status;
}
