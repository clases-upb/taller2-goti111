/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
    
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
     public static int Calcular_saldo(int base, int total_recaudos, int total_retiros){
        try {
            final int base_necesaria = 2000000;

            if(base != base_necesaria)
                return -1;

            int saldo_taquilla = base + total_recaudos - total_retiros;
            return saldo_taquilla;
            
        } 
        catch (Exception e) {
            return -1;
        }
    }


    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
     public static String Calcular_tip(float consumo){
        try {
            String mensaje_final = "";
            final float valor_propina_por = 0.10f;
            final float impuesto_consumo_por = 0.08f;
            float valor_propina = consumo * valor_propina_por;
            float valor_impuestos = consumo * impuesto_consumo_por;
            float total_pagar = consumo + valor_propina + valor_impuestos;

            if(consumo <= 0){
                return "Error calculando consumo";
                
            }else mensaje_final = "valor comida: $" + consumo + " - " + "valor propina $" + valor_propina + " - " + 
            "valor impoconsumo $" + valor_impuestos + " - " + "total a pagar $" + total_pagar;
             return mensaje_final;
    
            
        } 
        catch (Exception e) {
            return "Error en la funcion Calcular_tip";
        }

    }


    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */
    public static int Obtener_puntos(int partidos_ganados, int partidos_perdidos, int partidos_empatados) {
        try {
            int puntos_totales = 0;
            final int puntos_victoria = 3, puntos_empate = 1, puntos_derrota = 0;
    
            if (partidos_ganados < 0 || partidos_perdidos < 0 || partidos_empatados < 0) {
                return -1;
            } else {
                puntos_totales = partidos_ganados * puntos_victoria +
                                 partidos_perdidos * puntos_derrota +
                                 partidos_empatados * puntos_empate;
                return puntos_totales;
            }
    
        } catch (Exception e) {
            return -1;
        }
    }


    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_definitiva(float nota1, float nota2, float nota3, float nota4, float nota5, float porcentaje1, float porcentaje2, float porcentaje3, float porcentaje4, float porcentaje5){
        try {
            float calculo_porcentajes = 0, definitiva = 0;
            calculo_porcentajes = porcentaje1 + porcentaje2 + porcentaje3 + porcentaje4 + porcentaje5;

            if (calculo_porcentajes == 1 && porcentaje1 > 0 && porcentaje1 <= 1 && porcentaje2 > 0 && porcentaje2 <= 1 && porcentaje3 > 0 && porcentaje3 <= 1 && porcentaje4 > 0 && porcentaje4 <= 1 && porcentaje5 > 0 && porcentaje5 <= 1 && nota1 >= 0 && nota1 <= 5 && nota2 >= 0 && nota2 <= 5 && nota3 >= 0 && nota3 <= 5 && nota4 >= 0 && nota4 <= 5 && nota5 >= 0 && nota5 <= 5){

                definitiva = nota1 * porcentaje1 + nota2 * porcentaje2 + nota3 * porcentaje3 + nota4 * porcentaje4 + nota5 * porcentaje5;

                return definitiva;
            } else return -1;


        } catch (Exception e) {
            return -1;
        }
    }


    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_para_ganar(float nota1, float nota2, float nota3, float nota4, float porcentaje1, float porcentaje2, float porcentaje3, float porcentaje4, float porcentaje5){
        try {
            float calculo_porcentajes = 0, nota_a_sacar_parcial = 0, nota_a_sacar_total = 0;
            calculo_porcentajes = porcentaje1 + porcentaje2 + porcentaje3 + porcentaje4 + porcentaje5;

            if (calculo_porcentajes == 1 && porcentaje1 > 0 && porcentaje1 <= 1 && porcentaje2 > 0 && porcentaje2 <= 1 && porcentaje3 > 0 && porcentaje3 <= 1 && porcentaje4 > 0 && porcentaje4 <= 1 && porcentaje5 > 0 && porcentaje5 <= 1 && nota1 >= 0 && nota1 <= 5 && nota2 >= 0 && nota2 <= 5 && nota3 >= 0 && nota3 <= 5 && nota4 >= 0 && nota4 <= 5) {
                
            nota_a_sacar_parcial = 3 - (nota1 * porcentaje1 + nota2 * porcentaje2 + nota3 * porcentaje3 + nota4 * porcentaje4);
            nota_a_sacar_total = nota_a_sacar_parcial / porcentaje5;

            return Math.round(nota_a_sacar_total);
            } else return -1;


        } catch (Exception e) {
            return -1;
        }
    }


    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_salario(int cant_horas_normales, int cant_horas_extras_diurnas, int cant_horas_extras_nocturnas, float valor_hora_normal){
        try {
            float salario_total = 0;
            final float valor_horas_diurnas = 0.15f;
            final float valor_horas_nocturnas = 0.35f;

            if(valor_hora_normal > 0){
                salario_total = valor_hora_normal * cant_horas_normales + (valor_hora_normal * cant_horas_extras_diurnas * valor_horas_diurnas) + (valor_hora_normal * cant_horas_extras_nocturnas * valor_horas_nocturnas);
                return salario_total;

            }else return -1;
             

        } 
        catch (Exception e) {
            return -1;
        }
    }


    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
     public static float Calcular_area_triangulo(float base, float altura){
        try {
            float area_total = 0;
            final float un_medio = 0.5f;

            area_total = un_medio * base * altura;

            if(base > 0 && altura > 0) return area_total;
            else return -1;
                
            
        }
         catch (Exception e) {
            return -1;
        }
    }


    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_perimetro_cuadrado(float lado){
        try {
            float perimetro = 0;
            final byte cuatro = 4;
            perimetro = lado * cuatro;

            if(lado > 0)return perimetro;
            else return -1;
            
        } 
        catch (Exception e) {
            return -1;
        }
    }


    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_volumen_cilindro(float radio, float altura){
        try {
            float volumen = 0;
            final float pi = 3.1415927f;

            volumen = pi * radio * radio * altura;

            if(radio > 0 && altura > 0)return volumen;
            else return -1;
            
        } 
        catch (Exception e) {
            return -1;
        }
    }


    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_area_circulo(float radio){
        try {
            float area_total = 0;
            final float pi = 3.1415927f;

            area_total = pi * radio * radio;

            if(radio > 0)return area_total;
            else return -1;
            
        }
         catch (Exception e) {
            return -1;
        }
    }




}
