package Clases;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "Participantes", schema = "FactoriaProyectos", catalog = "")
public class ParticipantesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "AUTO_ID", nullable = false)
    private int autoId;
    @Basic
    @Column(name = "Proyecto_id", nullable = false)
    private int proyectoId;
    @Basic
    @Column(name = "id_Usuario", nullable = false)
    private int idUsuario;
    @Basic
    @Column(name = "Cordinador", nullable = true, length = 20)
    private String cordinador;
    @Basic
    @Column(name = "Fec_Ini", nullable = true)
    private Date fecIni;
    @Basic
    @Column(name = "Fec_Fin", nullable = true)
    private Date fecFin;

    public int getAutoId() {
        return autoId;
    }

    public void setAutoId(int autoId) {
        this.autoId = autoId;
    }

    public int getProyectoId() {
        return proyectoId;
    }

    public void setProyectoId(int proyectoId) {
        this.proyectoId = proyectoId;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCordinador() {
        return cordinador;
    }

    public void setCordinador(String cordinador) {
        this.cordinador = cordinador;
    }

    public Date getFecIni() {
        return fecIni;
    }

    public void setFecIni(Date fecIni) {
        this.fecIni = fecIni;
    }

    public Date getFecFin() {
        return fecFin;
    }

    public void setFecFin(Date fecFin) {
        this.fecFin = fecFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParticipantesEntity that = (ParticipantesEntity) o;
        return autoId == that.autoId && proyectoId == that.proyectoId && idUsuario == that.idUsuario && Objects.equals(cordinador, that.cordinador) && Objects.equals(fecIni, that.fecIni) && Objects.equals(fecFin, that.fecFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoId, proyectoId, idUsuario, cordinador, fecIni, fecFin);
    }
}