/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor_de_monedas;

import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class ClaseMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here.
        //Variables queme ayudan a controlar las opciones en el programa
        conversor_de_monedas.ClaseMetodos metodos = new conversor_de_monedas.ClaseMetodos();
        String opcion1;
        String opcion2;
        int salir = 0;
        double valor = 0;
        double convertido;
        String monedaConvertida;
        do{ 
            //Elegir la opcion de conversion
            int s1 = 0;
            do{
                Object[] conversores = {"Selecciona", "Conversor de monedas", "Conversor de temperatura"};
                opcion1 = (JOptionPane.showInputDialog(null, "Selecciona una opción de conversion", "Menu", JOptionPane.PLAIN_MESSAGE, 
                    null, conversores, "Selecciona")).toString();
                if(opcion1 != "Selecciona"){
                    s1 = 1;
                }
        
            }while(s1 == 0);
            
            //Ingresa al convertidor ya sea de monedas o temperatura
            if(opcion1 == "Conversor de monedas"){
        
                //JOption para registrar el valor a convertir
                boolean salida = false;
                while(salida == false){        
                    try{
                        valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que deseas convertir: "));
                        salida = true;
                    }catch(Exception e){
                        Object [ ] opciones = {"OK"};
                        JOptionPane.showOptionDialog ( null, "Valor no válido", "Message",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, opciones, opciones [ 0 ] );
                    }
                }

                //Opciones de consercion de la moneda.
                int s2 =0;
                do{
                    Object[] tipoConversion = {"Selecciona", "De Soles a Dólar", "De soles a Euros", "De Soles a Libras Esterlina", "De Soles a Yen Japonés", "De Soles a Won sul-coreano",
                    "De Dólar a Soles", "De Euros a Soles", "De Libras Esterlina a Soles", "De Yen Japonés a Soles", "De Won sul-coreano a Soles"};
                    opcion2 = (JOptionPane.showInputDialog(null, "Elija la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, 
                            null, tipoConversion, "Selecciona")).toString();
                    convertido = metodos.conversorMoneda(valor, opcion2);
                    monedaConvertida = metodos.nombreConvertido(opcion2 );
                    if(opcion2 != "Selecciona"){
                        s2 = 1;
                    }
                }while(s2 == 0);
                //Mostramos el resultado de la conversion
                JOptionPane.showMessageDialog(null, "Tienes " + convertido + " " + monedaConvertida);

            }else if(opcion1 == "Conversor de temperatura"){
                //Comienzo del conversor de temperatura
                //JOption para registrar el valor a convertir
                boolean salida = false;
                while(salida == false){        
                    try{
                        valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida de temperatura que deseas convertir: "));
                        salida = true;
                    }catch(Exception e){
                        Object [ ] opciones = {"OK"};
                        JOptionPane.showOptionDialog ( null, "Valor no válido", "Message",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, opciones, opciones [ 0 ] );
                    }
                }
                
                //Opciones de consercion de la moneda.
                int s2 =0;
                do{
                    Object[] tipoConversion = {"Selecciona", "De Celsius a Fahrenheit", "De Celcius a Kelvin",
                    "De Fahrenheit a Celcius", "De Fahrenheit a Kelvin",
                    "De Kelvin a Celcius", "De Kelvin a Fahrenheit"};
                    opcion2 = (JOptionPane.showInputDialog(null, "Elija la medida a la que deseas convertir la temperatura", "Monedas", JOptionPane.PLAIN_MESSAGE, 
                            null, tipoConversion, "Selecciona")).toString();
                    convertido = metodos.conversorTemperatura(valor, opcion2);
                    monedaConvertida = metodos.nombreConvertido(opcion2 );
                    if(opcion2 != "Selecciona"){
                        s2 = 1;
                    }  
                }while(s2 == 0); 
                //Mostramos el resultado de la conversion
                JOptionPane.showMessageDialog(null, "Tienes " + convertido + " " + monedaConvertida);
            }
            
            //Opcion para salir o continuar dentro del programa
            Object [ ] opciones = {"Yes", "No", "Cancel"};
            int resultado = JOptionPane.showOptionDialog ( null, "¿Desea cotinuar?", "Select an Option",
            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opciones, opciones [ 0 ] );
            if (resultado == 1) {
                salir = 1;
            } 
        }while(salir == 0);
        //Cuadro de diálogo- Finalizar programa
        Object [ ] opc = {"Ok"};
        JOptionPane.showOptionDialog ( null, "Programa terminado", "Message",
        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
            null, opc, opc [ 0 ] );
    }
    
}
