public class CalculadoraInteresCompuesto {
    public static void main(String[] args) {
        double principal = 10000; // Monto principal
        double tasaInteresAnual = 0.06; // Tasa de interés anual (6%)
        int tiempoEnAnios = 5; // Tiempo en años
        int capitalizacionesPorAnio = 12; // Capitalizaciones mensuales

        // Cálculo del interés compuesto
        double factor = 1 + (tasaInteresAnual / capitalizacionesPorAnio);
        double exponente = capitalizacionesPorAnio * tiempoEnAnios;
        double montoFinal = principal * Math.pow(factor, exponente);
        double interesCompuesto = montoFinal - principal;

        System.out.println("Inversion inicial: $" + principal);
        System.out.println("Interes compuesto despues de " + tiempoEnAnios + " anios: $" + interesCompuesto);
        System.out.println("Valor futuro despues de " + tiempoEnAnios + " anios: $" + montoFinal);
    }
}
