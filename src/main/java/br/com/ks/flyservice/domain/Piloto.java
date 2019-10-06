package br.com.ks.flyservice.domain;


import br.com.ks.flyservice.domain.enumeration.PilotoStatus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
 * A Piloto.
 */
@Entity
@Table(name = "piloto")
public class Piloto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private Integer idade;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private PilotoStatus status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Piloto nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Piloto idade(Integer idade) {
        this.idade = idade;
        return this;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Piloto dataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public PilotoStatus getStatus() {
        return status;
    }

    public void setStatus(PilotoStatus status) {
        this.status = status;
    }

    public Piloto status(PilotoStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piloto piloto = (Piloto) o;
        return Objects.equals(id, piloto.id) &&
                Objects.equals(nome, piloto.nome) &&
                Objects.equals(idade, piloto.idade) &&
                Objects.equals(dataNascimento, piloto.dataNascimento) &&
                status == piloto.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, idade, dataNascimento, status);
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", dataNascimento=" + dataNascimento +
                ", status=" + status +
                '}';
    }
}
