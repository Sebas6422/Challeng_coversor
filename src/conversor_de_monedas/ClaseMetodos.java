/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor_de_monedas;
//"De Soles a Dólar", "De soles a Euros", "De Soles a Libras Esterlina", "De Soles a Yen Japonés", "De Soles a Won sul-coreano",
               // "De Dólar a Soles", "De Euros a Soles", "De Libras Esterlina a Soles", "De Yen Japonés a Soles", "De Won sul-coreano a Soles"
/**
 *
 * @author USER
 */
public class ClaseMetodos {
    public double conversorMoneda(double valor, String conversion){
        double convertido = 0;
        switch(conversion){
            case "De Soles a Dólar":
                    convertido = (double) Math.round(0.27 * valor);
                break;
            case "De soles a Euros":
                    convertido = (double) Math.round(0.25 * valor);
                break;
            case "De Soles a Libras Esterlina":
                    convertido = (double) Math.round(0.21 * valor);
                break;
            case "De Soles a Yen Japonés":
                    convertido = (double) Math.round(38.41 * valor);
                break;
            case "De Soles a Won sul-coreano":
                    convertido = (double) Math.round(354.69 * valor);
                break;
            case "De Dólar a Soles":
                    convertido = (double) Math.round(3.64 * valor);
                break;
            case "De Euros a Soles":
                    convertido = (double) Math.round(4.01 * valor);
                break;
            case "De Libras Esterlina a Soles":
                    convertido = (double) Math.round(4.71 * valor);
                break;
            case "De Yen Japonés a Soles":
                    convertido = (double) Math.round(0.026 * valor);
                break;
            case "De Won sul-coreano a Soles":  
                    convertido = (double) Math.round(0.0028 * valor);
                break;
        }
        return convertido;
    }
    
    //"Selecciona", "De Celsius a Fahrenheit", "De Celcius a Kelvin",
                  //  "De Fahrenheit a Celcius", "De Fahrenheit a Kelvin",
                    //"De Kelvin a Celcius", "De Kelvin a Fahrenheit"};
    public double conversorTemperatura(double valor, String conversion){
        double convertido = 0;
        switch(conversion){
            case "De Celsius a Fahrenheit":
                    convertido = (double) Math.round((1.29*valor) + 32);
                break;
            case "De Celcius a Kelvin":
                    convertido = (double) Math.round(valor + 273);
                break;
            case "De Fahrenheit a Celcius":
                    convertido = (double) Math.round(0.6 * (valor - 32));
                break;
            case "De Fahrenheit a Kelvin":
                    convertido = (double) Math.round((0.6 * (valor - 32)) + 273);
                break;
            case "De Kelvin a Celcius":
                    convertido = (double) Math.round(valor - 273.15);
                break;
            case "De Kelvin a Fahrenheit":
                    convertido = (double) Math.round((1.29 * (valor - 273) + 32));
                break; 
        }
        return convertido;
    }
    
    
    public String nombreConvertido(String frase){
        char letraDeterminada = ' ';

        // Encontrar la posición de la letra determinada en la frase
        int posicionLetra = frase.lastIndexOf(letraDeterminada);

        // Verificar si la letra determinada se encuentra en la frase
        if (posicionLetra != -1) {
            // Extraer el texto que sigue a la letra determinada
            String ultimoTexto = frase.substring(posicionLetra + 1);

            return ultimoTexto;
        } else {
            return "No existe";
        }
    }
}
