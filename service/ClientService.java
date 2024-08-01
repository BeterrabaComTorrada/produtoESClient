package br.com.produtosESClient.service;

import br.com.produtosESClient.model.Product;
import java.util.List;

public interface ClientService {
    Product getProductById(Long id);
    List<Product> getAllProducts();
}
