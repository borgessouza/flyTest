package br.com.ks.flyservice.service.dto;

import br.com.ks.flyservice.domain.enumeration.VooStatus;

import java.io.Serializable;

public class VoosDTO implements Serializable {

    private Long id;

    private CidadeDTO origem;

    private CidadeDTO destino;

    private AviaoDTO aviao;

    private PilotoDTO pilotoPrincipal;

    private PilotoDTO pilotoSecundario;

    private VooStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CidadeDTO getOrigem() {
        return origem;
    }

    public void setOrigem(CidadeDTO origem) {
        this.origem = origem;
    }

    public CidadeDTO getDestino() {
        return destino;
    }

    public void setDestino(CidadeDTO destino) {
        this.destino = destino;
    }

    public AviaoDTO getAviao() {
        return aviao;
    }

    public void setAviao(AviaoDTO aviao) {
        this.aviao = aviao;
    }

    public PilotoDTO getPilotoPrincipal() {
        return pilotoPrincipal;
    }

    public void setPilotoPrincipal(PilotoDTO pilotoPrincipal) {
        this.pilotoPrincipal = pilotoPrincipal;
    }

    public PilotoDTO getPilotoSecundario() {
        return pilotoSecundario;
    }

    public void setPilotoSecundario(PilotoDTO pilotoSecundario) {
        this.pilotoSecundario = pilotoSecundario;
    }

    public VooStatus getStatus() {
        return status;
    }

    public void setStatus(VooStatus status) {
        this.status = status;
    }
}
