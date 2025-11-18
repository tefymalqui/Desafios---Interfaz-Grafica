/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio7.gestortareas;

/**
 *
 * @author USUARIO
 */
public class gestorTareas {
    public static void main(String[] args) {

        VistaGestor vista = new VistaGestor();
        ModeloGestor modelo = new ModeloGestor();

        new ControladorGestor(vista, modelo);
        vista.setVisible(true);
    }
}
