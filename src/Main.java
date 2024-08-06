import conductores.Conductor;
import conductores.ConductorDeCoche;
import conductores.ConductorDeMoto;

public class Main {
    public static void main(String[] args) {
        ConductorDeCoche conductorCoche = new ConductorDeCoche("Roberto", "C577448", 10);
        ConductorDeMoto conductorMoto = new ConductorDeMoto("Celeste", "M445757", true);

        System.out.println("Informacion del Conductor de Coche:");
        conductorCoche.mostrarInformacion();


        System.out.println("\nInformacion del Conductor de Moto:");
        conductorMoto.mostrarInformacion();
        lll
    }
}
