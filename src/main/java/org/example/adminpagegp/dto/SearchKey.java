package org.example.adminpagegp.dto;

import lombok.Data;

@Data
public class SearchKey {
    String key;
    String value;
    String sort;
    Integer pageNum;
}
