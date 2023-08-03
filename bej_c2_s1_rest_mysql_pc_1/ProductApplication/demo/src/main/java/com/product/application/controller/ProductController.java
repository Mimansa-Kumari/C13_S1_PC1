package com.product.application.controller;

import com.product.application.domain.Product;
import com.product.application.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    IProductService iProductService;
    @Autowired
    public ProductController(IProductService iProductService) {
        this.iProductService = iProductService;
    }
    @PostMapping("/product")
    public ResponseEntity<?>saveProductDetails(@RequestBody Product product)
    {
        return new ResponseEntity<>(iProductService.saveProductDetails(product), HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<?>fetchAllProducts()
    {
        return new ResponseEntity<>(iProductService.fetchAllProducts(),HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<?>fetchProductByProductId(@PathVariable int id)
    {
        return new ResponseEntity<>(iProductService.fetchProductByProductId(id),HttpStatus.OK);
    }

    @DeleteMapping("/product/delBy/{id}")
    public ResponseEntity<?>deleteProduct(@PathVariable int id)
    {
        return new ResponseEntity<>(iProductService.deleteProduct(id),HttpStatus.OK);
    }
}
