package com.dca.intranet.models;

import javax.persistence.*;

@Entity
@Table(name="dep_tab") 
public class DepTabModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idDepTab;

    private Long idDepartamento;
    private Long idAnuncio;

    public Long getIdDepTab() {
        return this.idDepTab;
    }

    public void setIdDepTab(Long idDepTab) {
        this.idDepTab = idDepTab;
    }

    public Long getIdDepartamento() {
        return this.idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Long getIdAnuncio() {
        return this.idAnuncio;
    }

    public void setIdAnuncio(Long idAnuncio) {
        this.idAnuncio = idAnuncio;
    }
}
