package com.produtosESClient.produtosESClient.impl;

import com.produtosESClient.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;
import java.util.Arrays;

@Service
public class ClientServiceImpl {
    
    @Autowired
    private RestTemplate restTemplate;

    public Product getProductById(Long id) {
        // Exemplo de chamada a um serviço REST para obter um produto
        String url = "http://localhost:8080/api/products/" + id;
        return restTemplate.getForObject(url, Product.class);
    }

    public List<Product> getAllProducts() {
        // Exemplo de chamada a um serviço REST para obter todos os produtos
        String url = "http://localhost:8080/api/products";
        Product[] products = restTemplate.getForObject(url, Product[].class);
        return Arrays.asList(products);
    }
}
