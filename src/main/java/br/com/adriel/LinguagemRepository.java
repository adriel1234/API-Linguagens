package br.com.adriel;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinguagemRepository extends MongoRepository<Linguagem, String>{
	
	List<Linguagem> findByOrderByRanking();
	
}
