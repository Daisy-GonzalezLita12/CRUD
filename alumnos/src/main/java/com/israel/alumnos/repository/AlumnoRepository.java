package com.israel.alumnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.israel.alumnos.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

    boolean existsByNombreIgnoreCaseAndApellidoIgnoreCase(String nombre, String apellido);
    boolean existsByNombreIgnoreCaseAndApellidoIgnoreCaseAndIdNot(String nombre, String apellido, Long id);
}
