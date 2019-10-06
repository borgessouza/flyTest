package br.com.ks.flyservice.service.impl;

import br.com.ks.flyservice.domain.Voo;
import br.com.ks.flyservice.repository.VooRepository;
import br.com.ks.flyservice.service.VoosService;
import br.com.ks.flyservice.service.dto.VoosDTO;
import br.com.ks.flyservice.service.mapper.VoosMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link Voo}.
 */
@Service
@Transactional
public class VoosServiceImpl implements VoosService {

    private final Logger log = LoggerFactory.getLogger(VoosServiceImpl.class);

    private final VooRepository vooRepository;

    private final VoosMapper voosMapper;

    public VoosServiceImpl(VooRepository vooRepository, VoosMapper voosMapper) {
        this.vooRepository = vooRepository;
        this.voosMapper = voosMapper;
    }

    /**
     * Save a voos.
     *
     * @param voosDTO the entity to save.
     * @return the persisted entity.
     */
    @Override
    public VoosDTO save(VoosDTO voosDTO) {
        log.debug("Request to save Voos : {}", voosDTO);
        Voo voo = voosMapper.toEntity(voosDTO);
        voo = vooRepository.save(voo);
        return voosMapper.toDto(voo);
    }

    /**
     * Get all the voos.
     *
     * @return the list of entities.
     */
    @Override
    @Transactional(readOnly = true)
    public List<VoosDTO> findAll() {
        log.debug("Request to get all Voos");
       return vooRepository.findAll().stream()
                .map(voosMapper::toDto)
                .collect(Collectors.toList());
    }


    /**
     * Get one voos by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<VoosDTO> findOne(Long id) {
        log.debug("Request to get Voos : {}", id);
        return vooRepository.findById(id)
                .map(voosMapper::toDto);
    }

    /**
     * Delete the voos by id.
     *
     * @param id the id of the entity.
     */
    @Override
    public void delete(Long id) {
        log.debug("Request to delete Voos : {}", id);
        vooRepository.deleteById(id);
    }
}
