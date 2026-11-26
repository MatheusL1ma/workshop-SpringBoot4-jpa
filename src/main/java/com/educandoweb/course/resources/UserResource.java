package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entidades.Category;
import com.educandoweb.course.entidades.User;
import com.educandoweb.course.services.CategoryService;
import com.educandoweb.course.services.UserService;

@RestController//CLASSE CONTROLADOR, RECEBE REAQUISICOES HTTP E DEVOLVE RESPOSTAS
@RequestMapping(value = "/categories")//ENDERECO BASE QUE A CLASSE VAI ATENDER
public class UserResource {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping//INDICA QUE ESSA METODO SERA EXECUTADO QUANDO CHEGAR REQUISICAO HTTP DO TIPO GET
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();//CONTROLLER CHAMA O SERVICE
		return ResponseEntity.ok().body(list);//RESPOSTA AO HTTP, CUJO BODY CONTEM UMA LISTA
	}
	@GetMapping(value = "/{id}")//METODO QUE RESPONDE QUANDO TEM UM ID NA URL
	public ResponseEntity<Category> findById(@PathVariable Long id){//@PATHVARIABLE PEGA O VALOR DA URL E COLOCA DENTRO DO PARAMETRO ID DESSE METODO
		Category obj = service.findById(id);//CHAMANDO O SERVICE PARA PROCURAR O ID DA URL
		return ResponseEntity.ok().body(obj);
	}

}
