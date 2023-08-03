package com.product.application.services;

import com.product.application.domain.Product;
import com.product.application.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements IProductService {

    IProductRepository iProductRepository;
    @Autowired
    public ProductServiceImpl(IProductRepository iProductRepository) {
        this.iProductRepository = iProductRepository;
    }

    @Override
    public Product saveProductDetails(Product product) {
        return iProductRepository.save(product);
    }

    @Override
    public List<Product> fetchAllProducts() {
        return iProductRepository.findAll();
    }

    @Override
    public Product fetchProductByProductId(int id) {
        return iProductRepository.findById(id).get();
    }

    @Override
    public boolean deleteProduct(int id) {
        iProductRepository.deleteById(id);
        return true;
    }
}
