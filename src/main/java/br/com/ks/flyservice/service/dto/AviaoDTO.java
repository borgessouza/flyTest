package br.com.ks.flyservice.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class AviaoDTO implements Serializable {

    private Long id;

    private String modelo;

    private String fabricante;

    private Instant datafabricacao;

    private Instant dataUltimaManutencao;

    private Instant dataProximamanutencao;

    private Integer qtdPassageiros;

    private Integer peso;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Instant getDatafabricacao() {
        return datafabricacao;
    }

    public void setDatafabricacao(Instant datafabricacao) {
        this.datafabricacao = datafabricacao;
    }

    public Instant getDataUltimaManutencao() {
        return dataUltimaManutencao;
    }

    public void setDataUltimaManutencao(Instant dataUltimaManutencao) {
        this.dataUltimaManutencao = dataUltimaManutencao;
    }

    public Instant getDataProximamanutencao() {
        return dataProximamanutencao;
    }

    public void setDataProximamanutencao(Instant dataProximamanutencao) {
        this.dataProximamanutencao = dataProximamanutencao;
    }

    public Integer getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(Integer qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AviaoDTO aviaoDTO = (AviaoDTO) o;
        if (aviaoDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), aviaoDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "AviaoDTO{" +
                "id=" + getId() +
                ", modelo='" + getModelo() + "'" +
                ", fabricante='" + getFabricante() + "'" +
                ", datafabricacao='" + getDatafabricacao() + "'" +
                ", dataUltimaManutencao='" + getDataUltimaManutencao() + "'" +
                ", dataProximamanutencao='" + getDataProximamanutencao() + "'" +
                ", qtdPassageiros=" + getQtdPassageiros() +
                ", peso=" + getPeso() +
                "}";
    }
}
