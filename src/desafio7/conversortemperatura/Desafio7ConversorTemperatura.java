/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio7.conversortemperatura;

/**
 *
 * @author USUARIO
 */
public class Desafio7ConversorTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaConversor vista = new VistaConversor();
        ModeloConversor modelo = new ModeloConversor();

        // Enlazar MVC
        new ControladorConversor(vista, modelo);
        vista.setVisible(true);
    }
    
}
