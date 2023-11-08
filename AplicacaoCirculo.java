package colecoes;
import java.util.ArrayList;
public class AplicacaoCirculo {
    public static void main(String[] args) throws Exception {
        double area;
        Circulo c;
        Circulo c1 = new Circulo(1);
        Circulo c2 = new Circulo(2.5);
        Circulo c3 = new Circulo(4);
        Circulo c4 = new Circulo(8);
        Circulo c5 = new Circulo(10.2);

        ArrayList <Circulo> conjuntoCirculos = new ArrayList <Circulo>();
        conjuntoCirculos.add(c1);
        conjuntoCirculos.add(c2);
        conjuntoCirculos.add(c3);
        conjuntoCirculos.add(c4);
        conjuntoCirculos.add(c5);

        for (int i = 0; i < 5; i++) {
            c = conjuntoCirculos.get(i);
            area = c.area();
            System.out.println("A área é de: " + area);
        }
    }
}
