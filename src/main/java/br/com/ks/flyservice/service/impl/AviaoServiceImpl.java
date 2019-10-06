package br.com.ks.flyservice.service.impl;


import br.com.ks.flyservice.domain.Aviao;
import br.com.ks.flyservice.repository.AviaoRepository;
import br.com.ks.flyservice.service.AviaoService;
import br.com.ks.flyservice.service.dto.AviaoDTO;
import br.com.ks.flyservice.service.mapper.AviaoMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link Aviao}.
 */
@Service
@Transactional
public class AviaoServiceImpl implements AviaoService {

    private final Logger log = LoggerFactory.getLogger(AviaoServiceImpl.class);

    private final AviaoRepository aviaoRepository;

    private final AviaoMapper aviaoMapper;

    public AviaoServiceImpl(AviaoRepository aviaoRepository, AviaoMapper aviaoMapper) {
        this.aviaoRepository = aviaoRepository;
        this.aviaoMapper = aviaoMapper;
    }

    /**
     * Save a aviao.
     *
     * @param aviaoDTO the entity to save.
     * @return the persisted entity.
     */
    @Override
    public AviaoDTO save(AviaoDTO aviaoDTO) {
        log.debug("Salvando Aviao : {}", aviaoDTO);
        Aviao aviao = aviaoMapper.toEntity(aviaoDTO);
        aviao = aviaoRepository.save(aviao);
        return aviaoMapper.toDto(aviao);
    }

    /**
     * Get all the aviaos.
     *
     * @return the list of entities.
     */
    @Override
    @Transactional(readOnly = true)
    public List<AviaoDTO> findAll() {
        log.debug("Recuperando todos Avioes");
        return aviaoRepository.findAll().stream()
                .map(aviaoMapper::toDto)
                .collect(Collectors.toList());
    }


    /**
     * Get one aviao by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Override
    @Transactional(readOnly = true)
    public Optional<AviaoDTO> findOne(Long id) {
        log.debug("Recuperando o Aviao : {}", id);
        return aviaoRepository.findById(id)
                .map(aviaoMapper::toDto);
    }

    /**
     * Delete the aviao by id.
     *
     * @param id the id of the entity.
     */
    @Override
    public void delete(Long id) {
        log.debug("Apagando o Aviao : {}", id);
        aviaoRepository.deleteById(id);
    }
}
