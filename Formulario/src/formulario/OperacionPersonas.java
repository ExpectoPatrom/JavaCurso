/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class OperacionPersonas {

    Persona pe;

    public void crearPersona(String nomb, Double ID, int cel) {
        pe = new Persona();
        pe.setNombre(nomb);
        pe.setID(ID);
        pe.setCelular(cel);
    }
    private ArrayList<Persona> clientes = new ArrayList();

    public void guardarPersona() {
        clientes.add(pe);
    }
    private String listaPersonas ="";

    public String getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(String listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public void mirarPersonas() {
        setListaPersonas("");
        for (int i = 0; i < clientes.size(); i++) {
            listaPersonas += clientes.get(i).getNombre() + " ";
            listaPersonas += clientes.get(i).getID() + " ";
            listaPersonas += clientes.get(i).getCelular() + "\n";
        }
    }

    public void eliminarPersona(double identificacion) {
        for (int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getID() == identificacion){
                clientes.remove(clientes.get(i));
            }
        }
    }
}
