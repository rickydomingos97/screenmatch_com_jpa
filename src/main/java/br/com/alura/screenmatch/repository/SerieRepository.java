package br.com.alura.screenmatch.repository;

import br.com.alura.screenmatch.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

//o generics traz a entidade ( Tipo ): Serie e o tipo de Id: Long
public interface SerieRepository extends JpaRepository<Serie, Long> {
    
}