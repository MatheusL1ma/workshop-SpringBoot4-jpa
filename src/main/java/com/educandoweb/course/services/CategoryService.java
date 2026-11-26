package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entidades.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service//INFORMA AO SPRING QUE ESSA CLASSE É UM COMPONENTE DE APLICACAO Q CONTEM LOGICA DE SERVICO
public class CategoryService {

	@Autowired//INJECAO DE DEPENDENCIA, O MESMO QUE DECLARAR NO NEW
	private CategoryRepository repository;//INTERFACE DO SPRING DATA JPA. ESSA CLASSE UTILIZA O CATEGORYREPOSITORY
	
	public List<Category> findAll(){//METODO P BUSCAR TODAS AS CATEGORIAS CADASTRADAS
		return repository.findAll();//RETORNA A BUSCA EM TIPO LISTA
	}
	public Category findById(Long id) {//METODO DE BUSCA PELO ID
		Optional<Category> obj = repository.findById(id);//OPTIONAL PODE EXISTIR OU NAO EXISTIR. INDICADO QUANDO DE BUSCA 1 UNICA CATEGORIA
		return obj.get();//RETORNA A CATEGORIA DO OPTIONAL
	}
	
}