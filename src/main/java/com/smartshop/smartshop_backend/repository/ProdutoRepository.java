package com.smartshop.smartshop_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.smartshop.smartshop_backend.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
