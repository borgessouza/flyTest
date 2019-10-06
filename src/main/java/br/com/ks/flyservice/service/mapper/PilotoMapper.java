package br.com.ks.flyservice.service.mapper;

import br.com.ks.flyservice.domain.Piloto;
import br.com.ks.flyservice.service.dto.PilotoDTO;
import org.mapstruct.Mapper;

/**
 * Mapper for the entity {@link Piloto} and its DTO {@link PilotoDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PilotoMapper extends EntityMapper<PilotoDTO, Piloto> {


    default Piloto fromId(Long id) {
        if (id == null) {
            return null;
        }
        Piloto piloto = new Piloto();
        piloto.setId(id);
        return piloto;
    }
}
