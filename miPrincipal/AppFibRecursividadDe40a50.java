package miPrincipal;

public class AppFibRecursividadDe40a50 {
    public static void main(String[] args) {
    menu();
        
    }

    public static void menu(){
        Performace p = new Performace();  

        int desde=40,hasta=50; 
        double ant=-1;
        for(int i=desde;i<=hasta;i++){
            p.start();
            double f=AppFibonacci.fibonacciRec(i);
            p.stop();


            System.out.println("Fibonacci de "+i+" es "+f+" en "+p.getMillis()+" segundos");
            if(ant>=0){
                System.out.println("El tiempo de ejecucion es "+(p.time()-ant)+" segundos");
            ant=p.time();
            }else
            System.out.println();
            ant=f;
        }
    }
    
    
}