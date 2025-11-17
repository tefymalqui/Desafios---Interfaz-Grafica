/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio7.conversortemperatura;

/**
 *
 * @author USUARIO
 */
public class ModeloConversor {
    // Celsius a Fahrenheit
    public double celsiusAFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    // Fahrenheit a Celsius
    public double fahrenheitACelsius(double f) {
        return (f - 32) * 5/9;
    }
}
