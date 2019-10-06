package br.com.ks.flyservice.repository;

import br.com.ks.flyservice.domain.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Piloto entity.
 */
@Repository
public interface PilotoRepository extends JpaRepository<Piloto, Long> {

}
