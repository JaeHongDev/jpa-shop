package com.example.jpashop.domain.Item;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("B")
@Entity
@Getter
@Setter
public class Book  extends Item{

}
