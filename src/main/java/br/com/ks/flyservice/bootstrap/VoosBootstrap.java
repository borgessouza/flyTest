package br.com.ks.flyservice.bootstrap;

import br.com.ks.flyservice.domain.Aviao;
import br.com.ks.flyservice.domain.Cidade;
import br.com.ks.flyservice.domain.Piloto;
import br.com.ks.flyservice.domain.Voo;
import br.com.ks.flyservice.domain.enumeration.PilotoStatus;
import br.com.ks.flyservice.domain.enumeration.VooStatus;
import br.com.ks.flyservice.repository.VooRepository;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class VoosBootstrap implements ApplicationListener<ContextRefreshedEvent> {


    private VooRepository vooRepository;

    public VoosBootstrap(VooRepository vooRepository) {
        this.vooRepository = vooRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
       vooRepository.save(getVoos());
    }

    private Voo getVoos() {
        Cidade cidadeOrigem = new Cidade()
                .cidade("São Jose dos Campos")
                .estado("SP")
                .pais("Brasil")
                .latitude(2L)
                .longitude(5L);
        Cidade cidadeDestino = new Cidade()
                .cidade("São Paulo")
                .estado("SP")
                .pais("Brasil")
                .latitude(3L)
                .longitude(6L);
        Aviao aviao = new Aviao()
                .modelo("F22")
                .fabricante("American")
                .datafabricacao(null)
                .dataProximamanutencao(null)
                .dataUltimaManutencao(null)
                .qtdPassageiros(55)
                .peso(2000);
        Piloto pilotoPrincipal = new Piloto().nome("Piloto1")
                .idade(33)
                .dataNascimento(null)
                .status(PilotoStatus.DISPONIVEL);
        Piloto pilotoSecundario = new Piloto()
                .nome("Piloto4")
                .idade(45)
                .dataNascimento(null)
                .status(PilotoStatus.EM_VOO);

       return new Voo(cidadeOrigem, cidadeDestino,aviao,pilotoPrincipal,pilotoSecundario, VooStatus.EM_VOO);
    }
}
