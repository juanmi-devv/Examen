public class Examen {
    public static void main(String[] args) {
        double precioProducto1 = 12.5;
        double unidades1 = 4; // Lo pasamos como double en vez de int para que cuando divida coja los decimales
        double totalSinDescuento1 = getTotalSinDescuento1(precioProducto1, unidades1);
        double descuento1 = getCalcularDescuento(totalSinDescuento1);
        double precioFinal1 = getCalcularPrecioFinal1(totalSinDescuento1, descuento1);
        System.out.println("Pedido 1: " + precioFinal1 + " euros");
        double precioProducto2 = 8.0;
        double unidades2 = 5; // Lo pasamos como double en vez de int para que cuando divida coja los decimales
        double totalSinDescuento2 = getTotalSinDescuento1(precioProducto2, unidades2);
        double descuento2 = getCalcularDescuento(totalSinDescuento2);
        double precioFinal2 = getCalcularPrecioFinal1(totalSinDescuento2, descuento2);
        System.out.println("Pedido 2: " + precioFinal2 + " euros");
        double calcularPagoPlazo = getCalcularPagoPlazo(precioFinal1, precioFinal2);
        System.out.println("Pago de cada plazo (3 plazos): " + calcularPagoPlazo + " euros");
        double calcularMedia = getCalcularMedia(unidades1, unidades2);
        System.out.println("Media de unidades por pedido: " + calcularMedia);
    }

    private static double getCalcularMedia(double unidades1, double unidades2) {
        double calcularMedia = (unidades1 + unidades2) / 2;
        return calcularMedia;
    }

    private static double getCalcularPagoPlazo(double precioFinal1, double precioFinal2) {
        double calcularPagoPlazo = (precioFinal1 + precioFinal2) / 3; // Priorizamos la suma.
        return calcularPagoPlazo;
    }

    private static double getCalcularPrecioFinal1(double totalSinDescuento1, double descuento1) {
        double precioFinal1 = totalSinDescuento1 - descuento1;
        return precioFinal1;
    }

    private static double getCalcularDescuento(double totalSinDescuento1) {
        double descuento1 = totalSinDescuento1 * 10 / 100;
        return descuento1;
    }

    private static double getTotalSinDescuento1(double precioProducto1, double unidades1) {
        double totalSinDescuento1 = precioProducto1 * unidades1;
        return totalSinDescuento1;
    }
}