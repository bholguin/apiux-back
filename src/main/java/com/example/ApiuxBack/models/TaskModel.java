package com.example.ApiuxBack.models;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "task")
public class TaskModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String title;
    private String descripcion;
    private Boolean vigente;
    private Date fechaCreacion;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

     public Boolean getVigente(){
        return vigente;
    }

    public void setDescripcion(Boolean vigente){
        this.vigente = vigente;
    }

    public Date getFechaCreacion() {
        return new Date();
    }
    
    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}