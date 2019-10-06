package br.com.ks.flyservice.service.impl;

import br.com.ks.flyservice.domain.Piloto;
import br.com.ks.flyservice.repository.PilotoRepository;
import br.com.ks.flyservice.service.PilotoService;
import br.com.ks.flyservice.service.dto.PilotoDTO;
import br.com.ks.flyservice.service.mapper.PilotoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link Piloto}.
 */
@Service
@Transactional
public class PilotoServiceImpl implements PilotoService {

    private final Logger log = LoggerFactory.getLogger(PilotoServiceImpl.class);

    private final PilotoRepository pilotoRepository;

    private final PilotoMapper pilotoMapper;

    public PilotoServiceImpl(PilotoRepository pilotoRepository, PilotoMapper pilotoMapper) {
        this.pilotoRepository = pilotoRepository;
        this.pilotoMapper = pilotoMapper;
    }

    /**
     * Save a piloto.
     *
     * @param pilotoDTO the entity to save.
     * @return the persisted entity.
     */
    @Override
    public PilotoDTO save(PilotoDTO pilotoDTO) {
        log.debug("Request to save Piloto : {}", pilotoDTO);
        Piloto piloto = pilotoMapper.toEntity(pilotoDTO);
        piloto = pilotoRepository.save(piloto);
        return pilotoMapper.toDto(piloto);
    }

    /**
     * Get all the pilotos.
     *
     * @return the list of entities.
     */
    @Override
    @Transactional(readOnly = true)
    public List<PilotoDTO> findAll() {
        log.debug("Request to get all Pilotos");
        return pilotoRepository.findAll().stream()
                .map(pilotoMapper::toDto)
                .collect(Collectors.toList());
    }


    /**
     * Get one piloto by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<PilotoDTO> findOne(Long id) {
        log.debug("Request to get Piloto : {}", id);
        return pilotoRepository.findById(id)
                .map(pilotoMapper::toDto);
    }

    /**
     * Delete the piloto by id.
     *
     * @param id the id of the entity.
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Piloto : {}", id);
        pilotoRepository.deleteById(id);
    }
}
