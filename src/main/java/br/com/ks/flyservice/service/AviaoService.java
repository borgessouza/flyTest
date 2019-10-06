package br.com.ks.flyservice.service;

import br.com.ks.flyservice.service.dto.AviaoDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface AviaoService {

    /**
     * Save a aviao.
     *
     * @param aviaoDTO the entity to save.
     * @return the persisted entity.
     */
    AviaoDTO save(AviaoDTO aviaoDTO);

    /**
     * Get all the aviaos.
     *
     * @return the list of entities.
     */
    List<AviaoDTO> findAll();


    /**
     * Get the "id" aviao.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<AviaoDTO> findOne(Long id);

    /**
     * Delete the "id" aviao.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
