package br.com.ks.flyservice.service;

import br.com.ks.flyservice.service.dto.PilotoDTO;

import java.util.List;
import java.util.Optional;

public interface PilotoService {

    /**
     * Save a piloto.
     *
     * @param pilotoDTO the entity to save.
     * @return the persisted entity.
     */
    PilotoDTO save(PilotoDTO pilotoDTO);

    /**
     * Get all the pilotos.
     *
     * @return the list of entities.
     */
    List<PilotoDTO> findAll();


    /**
     * Get the "id" piloto.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<PilotoDTO> findOne(Long id);

    /**
     * Delete the "id" piloto.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
