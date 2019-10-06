package br.com.ks.flyservice.service.mapper;

import br.com.ks.flyservice.domain.Voo;
import br.com.ks.flyservice.service.dto.VoosDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper for the entity {@link Voo} and its DTO {@link VoosDTO}.
 */
@Mapper(componentModel = "spring", uses = {CidadeMapper.class, AviaoMapper.class, PilotoMapper.class})
public interface VoosMapper extends EntityMapper<VoosDTO, Voo> {

    default Voo fromId(Long id) {
        if (id == null) {
            return null;
        }
        Voo voo = new Voo();
        voo.setId(id);
        return voo;
    }
}
