package com.epicode.GestionePrenotazioni;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EdificioRepository extends CrudRepository<Edificio, String> {
	
	@Query("Select e From Edificio e Where e.nome = :nome")
	public Edificio findByNome(String nome);

}
