package com.dca.intranet.models;

import javax.persistence.*;


@Entity
@Table(name="emp_dep")
public class EmpDepModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idEmpDep;
    private Long idEmpleado;
    private Long idDepartamento;

    public Long getIdEmpDep() {
        return this.idEmpDep;
    }

    public void setIdEmpDep(Long idEmpDep) {
        this.idEmpDep = idEmpDep;
    }

    public Long getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Long getIdDepartamento() {
        return this.idDepartamento;
    }

    public void setIdDepartamento(Long idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
}
