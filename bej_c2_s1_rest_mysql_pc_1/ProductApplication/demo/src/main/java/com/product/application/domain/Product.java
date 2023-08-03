package com.product.application.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Product {
    @Id
    int productId;
    String productName;
    String productDescription;
    int amountInStock;

}
