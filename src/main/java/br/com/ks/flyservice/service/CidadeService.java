package br.com.ks.flyservice.service;

import br.com.ks.flyservice.service.dto.CidadeDTO;

import java.util.List;
import java.util.Optional;

public interface CidadeService {

    /**
     * Save a cidade.
     *
     * @param cidadeDTO the entity to save.
     * @return the persisted entity.
     */
    CidadeDTO save(CidadeDTO cidadeDTO);

    /**
     * Get all the cidades.
     *
     * @return the list of entities.
     */
    List<CidadeDTO> findAll();


    /**
     * Get the "id" cidade.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<CidadeDTO> findOne(Long id);

    /**
     * Delete the "id" cidade.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
