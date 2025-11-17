/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio7.conversortemperatura;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ControladorConversor implements ActionListener {
    private VistaConversor vista;
    private ModeloConversor modelo;

    public ControladorConversor(VistaConversor vista, ModeloConversor modelo) {
        this.vista = vista;
        this.modelo = modelo;

        // Escuchar el botón
        vista.btnConvertir.addActionListener(this);
    }

    //@Override
    public void actionPerformed(ActionEvent e) {

        try {
            double valor = Double.parseDouble(vista.txtEntrada.getText());
            double resultado = 0;

            String opcion = vista.cmbConversor.getSelectedItem().toString();

            if (opcion.equals("Celsius → Fahrenheit")) {
                resultado = modelo.celsiusAFahrenheit(valor);
            } else {
                resultado = modelo.fahrenheitACelsius(valor);
            }

            vista.txtResultado.setText(String.format("%.2f", resultado));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista,
                "Ingrese un valor numérico válido",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }
}
