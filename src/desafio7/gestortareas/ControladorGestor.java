/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio7.gestortareas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author USUARIO
 */
public class ControladorGestor implements ActionListener{
    private VistaGestor vista;
    private ModeloGestor modelo;

    public ControladorGestor(VistaGestor vista, ModeloGestor modelo) {
        this.vista = vista;
        this.modelo = modelo;

        vista.listaTareas.setModel(modelo.getLista());

        vista.btnAgregar.addActionListener(this);
        vista.btnCompletada.addActionListener(this);
    }


   public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnAgregar) {
            String nombre = JOptionPane.showInputDialog(vista, "Nombre de la tarea:");

            if (nombre != null && !nombre.trim().isEmpty()) {
                modelo.agregarTarea(nombre);
            }
        }

        if (e.getSource() == vista.btnCompletada) {
            int index = vista.listaTareas.getSelectedIndex();

            if (index == -1) {
                JOptionPane.showMessageDialog(vista, "Seleccione una tarea.");
                return;
            }

            modelo.marcarCompletada(index);
            vista.listaTareas.repaint();
        }
    }
}
