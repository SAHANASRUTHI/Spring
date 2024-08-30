package com.kgisl.sb1.entity;

import org.springframework.data.annotation.Id;


public record Person(@Id Long id,String uname, String email) {
    
}
