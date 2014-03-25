/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio151;

import java.util.ArrayList;

/**
 *
 * @author ROBERTOVA
 */
public class Enlace {
    private int id;
    private String url;
    private String titulo;
    private String comentario;
    private int idusuario;
    private boolean privado;
    private ArrayList <String> etiquetas;
    
    public Enlace( int id, String url, String titulo, String comentario, int idusuario, boolean privado) {
        this.id = id;
        this.url= url;
        this.titulo = titulo;
        this.comentario = comentario;
        this.idusuario = idusuario;
        this.privado = privado;
        
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public ArrayList <String> getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(ArrayList <String> etiquetas) {
        this.etiquetas = etiquetas;
    }
    
}
