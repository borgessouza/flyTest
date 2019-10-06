package br.com.ks.flyservice.repository;

import br.com.ks.flyservice.domain.Aviao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Spring Data repository for the Aviao entity.
 */
@Repository
public interface AviaoRepository extends JpaRepository<Aviao, Long> {

}
