package com.prueba.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prueba.prueba.entity.*;

import java.util.Optional;

@Repository

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    Optional<Producto> findByName(String name);

    boolean existsByName(String name);

}
