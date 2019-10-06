package br.com.ks.flyservice.repository;

import br.com.ks.flyservice.domain.Voo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Voo entity.
 */
@Repository
public interface VooRepository extends JpaRepository<Voo, Long> {

}
