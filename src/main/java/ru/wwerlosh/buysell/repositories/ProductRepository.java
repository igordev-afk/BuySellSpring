package ru.wwerlosh.buysell.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.wwerlosh.buysell.models.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}
