package br.com.ks.flyservice.domain;


import br.com.ks.flyservice.domain.enumeration.VooStatus;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

/**
 * Entity Voos.
 */
@Entity
@Table(name = "voo")
public class Voo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Cidade origem;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Cidade destino;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Aviao aviao;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Piloto pilotoPrincipal;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Piloto pilotoSecundario;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private VooStatus status;

    public Voo() {
    }

    public Voo(Cidade origem, Cidade destino, Aviao aviao, Piloto pilotoPrincipal, Piloto pilotoSecundario, VooStatus status) {
        this.origem = origem;
        this.destino = destino;
        this.aviao = aviao;
        this.pilotoPrincipal = pilotoPrincipal;
        this.pilotoSecundario = pilotoSecundario;
        this.status = status;
    }


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cidade getOrigem() {
        return origem;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }

    public Aviao getAviao() {
        return aviao;
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public Piloto getPilotoPrincipal() {
        return pilotoPrincipal;
    }

    public void setPilotoPrincipal(Piloto pilotoPrincipal) {
        this.pilotoPrincipal = pilotoPrincipal;
    }

    public Piloto getPilotoSecundario() {
        return pilotoSecundario;
    }

    public void setPilotoSecundario(Piloto pilotoSecundario) {
        this.pilotoSecundario = pilotoSecundario;
    }

    public VooStatus getStatus() {
        return status;
    }

    public void setStatus(VooStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voo voo = (Voo) o;
        return Objects.equals(id, voo.id) &&
                Objects.equals(origem, voo.origem) &&
                Objects.equals(destino, voo.destino) &&
                Objects.equals(aviao, voo.aviao) &&
                Objects.equals(pilotoPrincipal, voo.pilotoPrincipal) &&
                Objects.equals(pilotoSecundario, voo.pilotoSecundario) &&
                status == voo.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, origem, destino, aviao, pilotoPrincipal, pilotoSecundario, status);
    }

    @Override
    public String toString() {
        return "Voo{" +
                "id=" + id +
                ", origem=" + origem +
                ", destino=" + destino +
                ", aviao=" + aviao +
                ", pilotoPrincipal=" + pilotoPrincipal +
                ", pilotoSecundario=" + pilotoSecundario +
                ", status=" + status +
                '}';
    }
}
