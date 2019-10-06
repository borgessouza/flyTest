package br.com.ks.flyservice.service.dto;


import br.com.ks.flyservice.domain.enumeration.PilotoStatus;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A DTO for the {@link br.com.ks.domain.Piloto} entity.
 */
public class PilotoDTO implements Serializable {

    private Long id;

    private String nome;

    private Integer idade;

    private Instant dataNascimento;

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

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Instant getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Instant dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public PilotoStatus getStatus() {
        return status;
    }

    public void setStatus(PilotoStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PilotoDTO pilotoDTO = (PilotoDTO) o;
        if (pilotoDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), pilotoDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "PilotoDTO{" +
                "id=" + getId() +
                ", nome='" + getNome() + "'" +
                ", idade=" + getIdade() +
                ", dataNascimento='" + getDataNascimento() + "'" +
                ", status='" + getStatus() + "'" +
                "}";
    }
}
