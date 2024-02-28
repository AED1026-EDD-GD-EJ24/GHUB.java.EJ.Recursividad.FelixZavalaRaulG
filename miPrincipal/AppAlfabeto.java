package miPrincipal;

public class AppAlfabeto {
    public static void main(String[] args) {
        System.out.print("");
    metodoA("z");
    System.out.println("");
    }
    static void metodoA(char c){
        if(c>'A')
        metodoB(c);
        System.out.println(c);
    }
    static void MetodoB(char c){
        metodoA(--c);
    }
}
