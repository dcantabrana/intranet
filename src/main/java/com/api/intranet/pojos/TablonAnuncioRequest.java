package com.api.intranet.pojos;

import java.sql.Date;
import java.util.Set;

import com.api.intranet.entities.Departamento;

public class TablonAnuncioRequest {
    public int id;
    public String titulo;
    public String msg;
    public Date fecha;

    public Long autor;
    public byte isDelete;

    public Set<Departamento> depart_visible;
}
