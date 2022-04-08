package com.test.hplus.restcontrollers;

import com.test.hplus.beans.Product;
import com.test.hplus.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductsRestController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/hplus/rest/products")
    @ResponseBody
    public List<Product> getProducts() {
        //calll product repo
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(product -> products.add(product));
        return products;

    }
}
