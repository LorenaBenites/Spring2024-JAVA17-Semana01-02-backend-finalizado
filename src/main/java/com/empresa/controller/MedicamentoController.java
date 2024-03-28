package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;


@RestController
@RequestMapping("/url/medicamento")
public class MedicamentoController {
	
	@Autowired
	private MedicamentoService medicamentoService;
	
	
	@GetMapping
	public List<Medicamento> listaMerdicamentos(){
		List<Medicamento> lstSalida = medicamentoService.listaMedicamentos();
		return lstSalida;
	}
	
	@GetMapping("/porPrecio/{precio}")
	public List<Medicamento> listaMedicamentoPorPrecio(@PathVariable("precio") double precio){
		List<Medicamento> lstSalida = medicamentoService.listaMedicamentoPorPrecio(precio);
		return lstSalida;
	}
	
	@GetMapping("/porStock/{stock}")
	public List<Medicamento> listaMedicamentoPorStock(@PathVariable("stock") int stock){
		List<Medicamento> lstSalida = medicamentoService.listaMedicamentoPorStock(stock);
		return lstSalida;
	}
	@GetMapping("/porId/{id}")
	public List<Medicamento> listarMedicamentoPorId(@PathVariable("idMedicamento")int id){
		List<Medicamento> lstSalida = medicamentoService.listaMedicamentoPorId(id);
		return lstSalida;
	}
	
	@GetMapping("/laboratorio/{nombre}")
	public List<Medicamento> listarMedicamentoPorLaboratorio(@PathVariable("nombre")String laboratorio){
		List<Medicamento> lstSalida = medicamentoService.listaMedicamentoPorLaboratorio(laboratorio);
		return lstSalida;
	}
	
	@GetMapping("/nombre/{nombre}")
	public List<Medicamento> listarMedicamentoPorNombre(@PathVariable("nombre")String nombre){
		List<Medicamento> lstSalida = medicamentoService.listaMedicamentoPorNombreLike(nombre+"%");
		return lstSalida;
	}
	
}