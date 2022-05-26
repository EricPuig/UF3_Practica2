package uf3practica2_ericpuig;

import java.util.List;

public class Lector {

    private int maximPrestec;
    private String nom;
    private String nif;
    private int cantidadLibros;
    private List<Copia> copiasLibro;

    public Lector(String nom, String nif, int cantidadLibros, List<Copia> copiasLibro) {
        this.maximPrestec = 3;
        this.nom = nom;
        this.nif = nif;
        this.cantidadLibros = cantidadLibros;
        this.copiasLibro = copiasLibro;
    }
    
    

    public void devolverLibro() {
    }

    public void cogerLibro() {
    }

    public int getMaximPrestec() {
        return maximPrestec;
    }

    public void setMaximPrestec(int maximPrestec) {
        this.maximPrestec = maximPrestec;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    public List<Copia> getCopiasLibro() {
        return copiasLibro;
    }

    public void setCopiasLibro(List<Copia> copiasLibro) {
        this.copiasLibro = copiasLibro;
    }
    
    
    
    
}
