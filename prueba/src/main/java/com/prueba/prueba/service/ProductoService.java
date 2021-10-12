package com.prueba.prueba.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.prueba.repository.*;
import com.prueba.prueba.entity.*;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> list() {
        return productoRepository.findAll();
    }

    public Optional<Producto> getOne(int id) {
        return productoRepository.findById(id);
    }

    public Optional<Producto> getByName(String name) {
        return productoRepository.findByName(name);
    }

    public void save(Producto producto) {
        productoRepository.save(producto);
    }

    public void delete(int id) {
        productoRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return productoRepository.existsById(id);
    }

    public boolean existsByName(String name) {
        return productoRepository.existsByName(name);
    }

}
