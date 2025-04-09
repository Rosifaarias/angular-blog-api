package com.dio.blogapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dio.blogapi.model.Postagem;
import com.dio.blogapi.repository.PostagemRepository;




@RestController 
@RequestMapping("/postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {

	
	
	@Autowired 
    private PostagemRepository postagemRepository;	
	
	
	
	
	  @GetMapping
	    public ResponseEntity<List<Postagem>> getAll() {
	        return ResponseEntity.ok(postagemRepository.findAll());
	    }
	
	
	  @GetMapping("/{id}")
		public ResponseEntity<Postagem> getById(@PathVariable Long id) {
			return postagemRepository.findById(id).map(resposta -> ResponseEntity.ok(resposta))
					.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
	  }
	  
	
	  @PostMapping
	    public ResponseEntity<Postagem> criar(@RequestBody Postagem postagem) {
	        return ResponseEntity.ok(postagemRepository.save(postagem));
	    }
	  

	  @PutMapping
	  public ResponseEntity<Postagem> atualizar(@RequestBody Postagem postagem) {
	      return postagemRepository.findById(postagem.getId())
	              .map(resposta -> ResponseEntity.ok(postagemRepository.save(postagem))) // ATUALIZA SE EXISTIR A POSTAGEM 
	              .orElse(ResponseEntity.notFound().build()); //CASO NÃO RETORNA 404
	  }


	    @DeleteMapping("/{id}") 
	    public void deletar(@PathVariable Long id) {
	        postagemRepository.deleteById(id);
	    }
	
	}
