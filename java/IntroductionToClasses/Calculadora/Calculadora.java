
    import java.util.Scanner;
public class Calculadora{
    double a;
    double b;
    double c;
    //Metodo contructor´
    public Calculadora(double x,double y,double z){
        a = x;
        b = y;
        c = z;
    }
    public double suma(){
        c=a+b;
        return c;
    }
    public double resta(){
        c=a-b;
        return c;
    }
    public double multiplicacion(){
        c=a*b;
        return c;
    }
    public double division(){
        if(b==0){
            System.out.println("No se puede dividir por cero, por favor ingrese otro numero");
            return Double.NaN;
        }
        else {
            c=a/b;
            return c;
        }
    }
    public void imprimir(double x){

        System.out.println(x);
    }
    public void imprimirMenu(){
        System.out.println("---------Calculadora---------");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.division");
        System.out.println("5.Salir");
        
    }
    public static void main(String[] args){
        int opcion;
        Calculadora obj = new Calculadora(0,0,0);
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        obj.a = leer.nextDouble();
        System.out.println("Ingrese un numero");
        obj.b = leer.nextDouble();
        obj.imprimirMenu();        
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
            obj.imprimir(obj.suma());
                break;
            case 2:
            obj.imprimir(obj.resta());
                break;
            case 3:
            obj.imprimir(obj.multiplicacion());
                break;
            case 4:
            obj.imprimir(obj.division());
                break;
            default:
            System.out.println("Ingrese una opcion valida");
                break;
        }
       
    }
}
    

