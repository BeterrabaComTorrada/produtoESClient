package br.com.produtosESClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.produtosESClient.service.ClientService;
import br.com.produtosESClient.model.Product;

import java.util.List;

@RestController
@RequestMapping("/client/products")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return clientService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return clientService.getAllProducts();
    }
}
