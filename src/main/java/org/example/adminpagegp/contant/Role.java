package org.example.adminpagegp.contant;


import lombok.Getter;

@Getter
public enum Role {
    ADMIN("admin",0),
    USER("user",1),
    MANAGER("manager",2);
    private final String name;
    private final Integer code;

    Role(String name,Integer code) {
        this.name = name;
        this.code = code;
    }
}
