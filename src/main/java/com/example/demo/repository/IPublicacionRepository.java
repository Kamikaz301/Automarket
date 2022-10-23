package com.example.demo.repository;

import com.example.demo.model.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPublicacionRepository extends JpaRepository<Publicacion, Long> {
}
