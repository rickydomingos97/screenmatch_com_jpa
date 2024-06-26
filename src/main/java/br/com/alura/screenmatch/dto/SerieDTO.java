package br.com.alura.screenmatch.dto;

import br.com.alura.screenmatch.model.Categoria;

// usa record pois so vamos devolver dados e nao vamos ter regras de negocio aqui
public record SerieDTO(
        Long id,
        String titulo,
        Integer totalTemporadas,
        Double avaliacao,
        Categoria genero,
        String atores,
        String poster,
        String sinopse
) {

}