package br.com.ks.flyservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

/**
 * A Aviao.
 */
@Entity
@Table(name = "aviao")
public class Aviao implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "fabricante")
    private String fabricante;

    @Temporal(TemporalType.DATE)
    @Column(name = "datafabricacao")
    private Date datafabricacao;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_ultima_manutencao")
    private Date dataUltimaManutencao;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_proximamanutencao")
    private Date dataProximamanutencao;

    @Column(name = "qtd_passageiros")
    private Integer qtdPassageiros;

    @Column(name = "peso")
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

    public Aviao modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Aviao fabricante(String fabricante) {
        this.fabricante = fabricante;
        return this;
    }

    public Date getDatafabricacao() {
        return datafabricacao;
    }

    public void setDatafabricacao(Date datafabricacao) {
        this.datafabricacao = datafabricacao;
    }

    public Aviao datafabricacao(Date datafabricacao) {
        this.datafabricacao = datafabricacao;
        return this;
    }

    public Date getDataUltimaManutencao() {
        return dataUltimaManutencao;
    }

    public void setDataUltimaManutencao(Date dataUltimaManutencao) {
        this.dataUltimaManutencao = dataUltimaManutencao;
    }

    public Aviao dataUltimaManutencao(Date dataUltimaManutencao) {
        this.dataUltimaManutencao = dataUltimaManutencao;
        return this;
    }

    public Date getDataProximamanutencao() {
        return dataProximamanutencao;
    }

    public void setDataProximamanutencao(Date dataProximamanutencao) {
        this.dataProximamanutencao = dataProximamanutencao;
    }

    public Aviao dataProximamanutencao(Date dataProximamanutencao) {
        this.dataProximamanutencao = dataProximamanutencao;
        return this;
    }

    public Integer getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(Integer qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }

    public Aviao qtdPassageiros(Integer qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
        return this;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Aviao peso(Integer peso) {
        this.peso = peso;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aviao aviao = (Aviao) o;
        return Objects.equals(id, aviao.id) &&
                Objects.equals(modelo, aviao.modelo) &&
                Objects.equals(fabricante, aviao.fabricante) &&
                Objects.equals(datafabricacao, aviao.datafabricacao) &&
                Objects.equals(dataUltimaManutencao, aviao.dataUltimaManutencao) &&
                Objects.equals(dataProximamanutencao, aviao.dataProximamanutencao) &&
                Objects.equals(qtdPassageiros, aviao.qtdPassageiros) &&
                Objects.equals(peso, aviao.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, modelo, fabricante, datafabricacao, dataUltimaManutencao, dataProximamanutencao, qtdPassageiros, peso);
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", datafabricacao=" + datafabricacao +
                ", dataUltimaManutencao=" + dataUltimaManutencao +
                ", dataProximamanutencao=" + dataProximamanutencao +
                ", qtdPassageiros=" + qtdPassageiros +
                ", peso=" + peso +
                '}';
    }
}
