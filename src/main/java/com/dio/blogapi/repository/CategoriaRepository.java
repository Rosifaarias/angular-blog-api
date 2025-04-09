package com.dio.blogapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dio.blogapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}