package uf3practica2_ericpuig;

public class Copia extends Llibre {

    private String identificador;
    private String estado;

    public Copia(String nom, String tipus, String editorial, int any, String autor) {
        super(nom, tipus, editorial, any, autor);
    }


    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
