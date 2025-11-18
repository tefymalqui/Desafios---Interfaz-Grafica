/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio7.gestortareas;

import javax.swing.*;
/**
 *
 * @author USUARIO
 */
public class ModeloGestor {
    private DefaultListModel<String> listaTareas = new DefaultListModel<>();

    public DefaultListModel<String> getLista() {
        return listaTareas;
    }

    public void agregarTarea(String nombre) {
        listaTareas.addElement(nombre + "  ⏳ Pendiente");
    }

    public void marcarCompletada(int index) {
        String tarea = listaTareas.getElementAt(index);

        // Reemplazar el estado
        if (tarea.endsWith("⏳ Pendiente")) {
            tarea = tarea.replace("⏳ Pendiente", "✔ Completada");
            listaTareas.set(index, tarea);
        }
    }
}
