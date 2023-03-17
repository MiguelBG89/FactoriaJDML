package Clases;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Comentarios", schema = "FactoriaProyectos", catalog = "")
public class ComentariosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "AUTO_ID", nullable = false)
    private int autoId;
    @Basic
    @Column(name = "Escritor", nullable = false)
    private int escritor;
    @Basic
    @Column(name = "Proyecto_id", nullable = false)
    private int proyectoId;
    @Basic
    @Column(name = "Contenido", nullable = true, length = 20)
    private String contenido;

    public int getAutoId() {
        return autoId;
    }

    public void setAutoId(int autoId) {
        this.autoId = autoId;
    }

    public int getEscritor() {
        return escritor;
    }

    public void setEscritor(int escritor) {
        this.escritor = escritor;
    }

    public int getProyectoId() {
        return proyectoId;
    }

    public void setProyectoId(int proyectoId) {
        this.proyectoId = proyectoId;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComentariosEntity that = (ComentariosEntity) o;
        return autoId == that.autoId && escritor == that.escritor && proyectoId == that.proyectoId && Objects.equals(contenido, that.contenido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoId, escritor, proyectoId, contenido);
    }
}