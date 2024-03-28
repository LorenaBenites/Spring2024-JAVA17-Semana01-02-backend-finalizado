package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService {
	
	@Autowired
	private MedicamentoRepository repository;
	
	@Override
	public List<Medicamento> listaMedicamentos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Medicamento> listaMedicamentoPorPrecio(double precio) {
		// TODO Auto-generated method stub
		return repository.findByPrecio(precio);
	}

	@Override
	public List<Medicamento> listaMedicamentoPorStock(int stock) {
		// TODO Auto-generated method stub
		return repository.findByStock(stock);
	}

	@Override
	public List<Medicamento> listaMedicamentoPorId(int id) {
		// TODO Auto-generated method stub
		return repository.findByIdMedicamento(id);
	}

	@Override
	public List<Medicamento> listaMedicamentoPorLaboratorio(String laboratorio) {
		// TODO Auto-generated method stub
		return repository.findByLaboratorio(laboratorio);
	}

	@Override
	public List<Medicamento> listaMedicamentoPorNombreLike(String nombre) {
		// TODO Auto-generated method stub
	 return repository.findByNombreLike(nombre);
	}



}
