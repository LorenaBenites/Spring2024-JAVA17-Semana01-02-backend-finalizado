package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
	

	public List<Alumno> findByDni(String dni);
	public List<Alumno> findByNombreLike(String nombre);
	//buscar por id de alumno
	public List<Alumno> findByIdAlumno(int id);

}
