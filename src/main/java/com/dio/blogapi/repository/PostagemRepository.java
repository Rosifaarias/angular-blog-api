package com.dio.blogapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dio.blogapi.model.Postagem;


/**
 * ESTA INTERFACE É O REPOSITORIO DA ENTIDADE POSTAGEM.
 * ELA HERDA MÉTODOS PRONTOS COMO SALVAR, BUSCAR, DELETAR E ATUALIZAR NO BANCO.
 *  
 */
@Repository // MARCAÇÃO DIZ AO SPRING QUE ESTA INTERFACE É UM COMPONETE QUE ACESSAR AO BANCO 
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	
	// JPA REPOSITORY TIPO DA ENTIDADE (POSTAGEM) E TIPO DO (ID .LONG)
}
