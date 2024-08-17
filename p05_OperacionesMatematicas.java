//Realizar operaciones matematicas báscicas 

public class p05_OperacionesMatematicas{
    public static void main(String[] args) {
        double x, y, sum, resta, multi, div, res, pot;
        x = 10.5;
        y = 2.5;
        sum = x+y;
        resta = x-y;
        multi = x*y;
        div = x/y;
        res = x%y;
        pot = Math.pow(x,y);
        
        System.out.println(String.format("Lo numeros son: %.2f, %2.f",x,y));
        System.out.println("\nEl resultado de las operaciones es el siguiente:\n");
        System.out.println(String.format("Suma: %.2f\nResta: %.2f",sum,resta));
        System.out.println(String.format("Multiplicación: %.2f,\nDivision: %.2f",multi,div));
        System.out.println(String.format("Residuo: %.2f,\nPotencia: %.2f",res,pot));
        
    }
}