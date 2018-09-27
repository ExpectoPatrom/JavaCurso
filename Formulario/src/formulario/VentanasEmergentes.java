/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

/**
 *
 * @author Estudiantes
 */
public class VentanasEmergentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionPersonas op = new OperacionPersonas();
        op.crearPersona("Nicolas", (double)20, 302);
        op.guardarPersona();
        op.crearPersona("Juan", (double)30, 312);
        op.guardarPersona();
        op.mirarPersonas();
        System.out.println(op.getListaPersonas());
        op.eliminarPersona((double)20);
        op.mirarPersonas();
        System.out.println(op.getListaPersonas());
    }

}
