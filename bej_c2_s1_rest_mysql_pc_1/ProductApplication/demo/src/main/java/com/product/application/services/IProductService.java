package com.product.application.services;

import com.product.application.domain.Product;

import java.util.List;

public interface IProductService {
    Product saveProductDetails(Product product);
    List<Product> fetchAllProducts();
    Product fetchProductByProductId(int id);
    boolean deleteProduct(int id);
}
