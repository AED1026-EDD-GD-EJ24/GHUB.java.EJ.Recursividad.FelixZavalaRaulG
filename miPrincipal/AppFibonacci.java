package miPrincipal;

public class AppFibonacci {
    package miPrincipal;

import java.util.Scanner;

public class AppFibonacci{
public static void menu(){
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
//double f=




}
public static double fibonacciIte(int n){
    double f=1, r1=1, r2=1;
    for(int i=3; i<=n; i++){
        f=r1+r2;
        r1=r2;
        r2=f;
    }
    return f;
}
public static double fibonacciRec(int n){
    if(n<=2)
        return 1;
    else
        return fibonacciRec(n-1)+fibonacciRec(n-2);
        
}
static long getContador(){
return cont;
}
static double fibonacciRecOptimizado(int x,Hashtable<integer,Double>t){
    ///primero verificamos si el resiltado en la tabla
    double d=t.get(x);
    //si no estaba entonces lo calculamos y lo ingresamos al la tabla
    if (d==null)
    {
        d=fibonacciRecOptimizado(x-1,t)+fibonacciRecOptimizado(x-2,t);
        t.put(x,d);
    }
    //retorna resultado
    return d;
}
}

