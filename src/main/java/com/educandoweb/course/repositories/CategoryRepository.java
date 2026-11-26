package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entidades.Category;
import com.educandoweb.course.entidades.Order;
import com.educandoweb.course.entidades.User;

//OPCIONAL O REPOSITORY, POIS O JPA JA POSSUI
public interface CategoryRepository extends JpaRepository<Category, Long>{

}



/*
	ESSA CLASSE SERVE DE PONTE ENTRE O SPRING E O BANCO DE DADOS
	ONDE SERA POSSIVEL ACESSAR E FAZER OPERAÇÕES COMO INSERIR, DELETAR...
	 É COMO DIZER AO SPRING "QUERO QUE VC DISPONIBILIZE OPERAÇOES DE BANCO DE DADOS
	 PARA A ENTIDADE CATEGORY, CUJO INDENTIFICADOR É LONG"

	É O ACESSO DE CADA ENTIDADE AO BANCO

*/