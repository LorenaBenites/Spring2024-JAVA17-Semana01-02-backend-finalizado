package com.empresa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.empresa.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer>{
	public List<Medicamento> findByPrecio(double precio);
	public List<Medicamento> findByStock(int stock);
	public List<Medicamento> findByLaboratorio(String nombre);
	public List<Medicamento> findByNombreLike(String nombre);
	public List<Medicamento> findByIdMedicamento(int id);
}