public class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("Amilcar", 1000.0);
        vendedor.cambiarEstrategia(new ComisionPersonalizada());
        vendedor.mostrarDetalle();
    }
}
