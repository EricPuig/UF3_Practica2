package uf3practica2_ericpuig;


import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Copia> copias;

    public Biblioteca() {
        this.copias = new ArrayList();
    }

    public List<Copia> getCopias() {
        return copias;
    }

    public void setCopias(List<Copia> copias) {
        this.copias = copias;
    }
    
    
    
    
}
