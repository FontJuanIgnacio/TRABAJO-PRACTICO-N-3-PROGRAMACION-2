import java.util.ArrayList;
import java.util.Collections;

public class CasaInteligente {
    public static void main(String[] args) {
        // Consumo de electricidad de cada electrodoméstico inteligente en kWh por mes
        ArrayList<Double> consumos = new ArrayList<>();
        consumos.add(90.0);
        consumos.add(40.0);
        consumos.add(50.0);
        consumos.add(35.0);

        // Reducción de consumo de electricidad en porcentaje
        double reduccionConsumo = 0.30;

        // Calcular el ahorro de energía anual en kWh
        double ahorroAnual = calcularAhorroAnual(consumos, reduccionConsumo);

        // Mostrar el ahorro de energía anual
        System.out.println("El ahorro de energia anual es: " + ahorroAnual + " kWh");

        // Determinar el máximo y el mínimo consumo de energía entre los electrodomésticos
        double maxConsumo = Collections.max(consumos);
        double minConsumo = Collections.min(consumos);

        // Mostrar el máximo y el mínimo consumo de energía
        System.out.println("El maximo consumo de energia es: " + maxConsumo + " kWh");
        System.out.println("El minimo consumo de energia es: " + minConsumo + " kWh");
    }

    // Método para calcular el ahorro de energía anual en kWh
    public static double calcularAhorroAnual(ArrayList<Double> consumos, double reduccionConsumo) {
        double ahorroTotal = 0;
        for (double consumo : consumos) {
            double ahorroMensual = consumo * reduccionConsumo;
            ahorroTotal += ahorroMensual;
        }
        // Calcular el ahorro anual suponiendo 12 meses
        return ahorroTotal * 12;
    }
}