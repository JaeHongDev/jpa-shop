package com.example.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;

@Getter
@Setter
@Embeddable
public class Address {
    private String city;
    private String street;
    private String zipCode;
}
