public class Main {
    public static void main(String[] args) {
    
        //Retornos
        System.out.println("Exercícios de retornos:");

        double areaQuadrado = AreaQuadrilateros.area(3);
        System.out.println("Área do quadrado: "+areaQuadrado);

        double areaRetangulo = AreaQuadrilateros.area(5,4);
        System.out.println("Área do retângulo: "+areaRetangulo);

        double areaTrapezio = AreaQuadrilateros.area(2,3,2);
        System.out.println("Área do trapézio: "+areaTrapezio);
    }
}