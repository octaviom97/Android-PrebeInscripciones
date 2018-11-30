package com.example.octav.prebeinscripcion;

public class AsignaturasVo {

    private String clave;
    private String credito;
    private String asignatura;
    private String horario;

    public AsignaturasVo(){

    }

    public AsignaturasVo(String clave, String credito, String asignatura, String horario) {
        this.clave = clave;
        this.credito = credito;
        this.asignatura = asignatura;
        this.horario = horario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
