package br.com.ks.flyservice.service.dto;


import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

public class CidadeDTO implements Serializable {

    private Long id;

    @NotNull
    private String cidade;

    @NotNull
    private String estado;

    @NotNull
    private String pais;

    private Long latitude;

    private Long longitude;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CidadeDTO cidadeDTO = (CidadeDTO) o;
        if (cidadeDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), cidadeDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "CidadeDTO{" +
                "id=" + getId() +
                ", cidade='" + getCidade() + "'" +
                ", estado='" + getEstado() + "'" +
                ", pais='" + getPais() + "'" +
                ", latitude=" + getLatitude() +
                ", longitude=" + getLongitude() +
                "}";
    }
}
