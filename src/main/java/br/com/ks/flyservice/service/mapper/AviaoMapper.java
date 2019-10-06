package br.com.ks.flyservice.service.mapper;

import br.com.ks.flyservice.domain.Aviao;
import br.com.ks.flyservice.service.dto.AviaoDTO;
import org.mapstruct.Mapper;

/**
 * Mapper for the entity {@link Aviao} and its DTO {@link AviaoDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface AviaoMapper extends EntityMapper<AviaoDTO, Aviao> {


    default Aviao fromId(Long id) {
        if (id == null) {
            return null;
        }
        Aviao aviao = new Aviao();
        aviao.setId(id);
        return aviao;
    }
}
