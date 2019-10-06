package br.com.ks.flyservice.repository;


import br.com.ks.flyservice.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Cidade entity.
 */
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
