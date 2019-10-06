package br.com.ks.flyservice.service;

import br.com.ks.flyservice.service.dto.VoosDTO;

import java.util.List;
import java.util.Optional;

public interface VoosService {

    /**
     * Save a voos.
     *
     * @param voosDTO the entity to save.
     * @return the persisted entity.
     */
    VoosDTO save(VoosDTO voosDTO);

    /**
     * Get all the voos.
     *
     *
     * @return the list of entities.
     */
    List<VoosDTO> findAll();


    /**
     * Get the "id" voos.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<VoosDTO> findOne(Long id);

    /**
     * Delete the "id" voos.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
