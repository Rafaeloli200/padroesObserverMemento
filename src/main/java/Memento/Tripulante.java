/*
Tripulantes são colaboradores como os pilotos, copilotos e aeromoças, que estão constantemente viajando
 */
package Memento;

import java.util.ArrayList;
import java.util.List;

public class Tripulante {

    private String nome;
    private EstadoDoTripulante estado; 
     private List<EstadoDoTripulante> memento = new ArrayList<EstadoDoTripulante>();

       public Tripulante() {
        this.estado = TripulanteEstadoDisponivel.getInstance();
    }
    
    public void setEstado(EstadoDoTripulante estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("indice invalido");
        }
        this.estado = this.memento.get(indice);
    }
    
    public List<EstadoDoTripulante> getEstados() {
        return this.memento;
    }
    
    public EstadoDoTripulante getEstado() {
        return estado;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
     public String disponibilizar() {
        return estado.disponibilizar(this);
    }
    
    public String desligar() {
        return estado.desligar(this);
    }
    
    public String decolar() {
        return estado.decolar(this);
    }
    
    public String aterrissar() {
        return estado.aterrissar(this);
    }
    
    public String inativar() {
        return estado.inativar(this);
    }


    public String getNomeEstado() {
        return estado.getEstado();
    }
    
}
