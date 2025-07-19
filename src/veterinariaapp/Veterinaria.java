package veterinariaapp;
//josue cuja
public class Veterinaria {
    public void registrarMascotas() {
        Mascota m1 = new Mascota("Firulais", "Perro", 4, true);
        Mascota m2 = new Mascota("Michi", "Gato", 2, false);
        Mascota m3 = new Mascota("Max", "Conejo", 1, true);

        m1.mostrarInformacion();
        m2.mostrarInformacion();
        m3.mostrarInformacion();
    }
}
