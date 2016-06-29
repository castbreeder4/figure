import java.util.Scanner;

/**
 * Created by Андрей on 20.06.2016.
 */
public abstract class Figure {
Scanner scanner = new Scanner(System.in);
    protected  String name;

    private  double a;
    private  double b;
    public String getName(){

        return  name;
    }
    public void setParametrs(){
        System.out.println("Введите параметр A: ");
        int a = scanner.nextInt();
        System.out.println("Введите параметр B: ");
        int b = scanner.nextInt();
        this.a = a;

        this.b = b;
    }
    public void getParametrs(){
        System.out.println(a);
        System.out.println(b);

    }

    public  double getArea(){
       double area = a * b;
        return area;
    }
}
