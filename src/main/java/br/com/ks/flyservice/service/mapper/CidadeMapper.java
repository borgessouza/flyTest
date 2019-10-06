package br.com.ks.flyservice.service.mapper;

import br.com.ks.flyservice.domain.Cidade;
import br.com.ks.flyservice.service.dto.CidadeDTO;
import org.mapstruct.Mapper;

/**
 * Mapper for the entity {@link Cidade} and its DTO {@link CidadeDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface CidadeMapper extends EntityMapper<CidadeDTO, Cidade> {


    default Cidade fromId(Long id) {
        if (id == null) {
            return null;
        }
        Cidade cidade = new Cidade();
        cidade.setId(id);
        return cidade;
    }
}
