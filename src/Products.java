//Napisz program, w którym korzystając ze zmiennych najpierw zapamiętasz informacje o dwóch produktach spożywczych, np.:
//
//nazwa: Mleko, producent: Mlekowita, cena: 2.5zł
//nazwa: Czekolada, producent: Wedel, cena: 2.19zł

public class Products {
    public static void main(String[] args) {
        String product1="Mleko";
        String producer1="Mlekowita";
        double price1=2.5;
        String product2="Czekolada";
        String producer2="Wedel";
        double price2=2.19;

        System.out.println("nazwa: "+ product1 + ", producent: " + producer1 +", cena: "+price1 +"zł");
        System.out.println("nazwa: "+ product2 + ", producent: " + producer2 +", cena: "+price2 +"zł");
    }
}
