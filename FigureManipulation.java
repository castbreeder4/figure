import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Андрей on 28.06.2016.
 */
public class FigureManipulation {

    Figure circle;
    Figure triangle;
    Figure square;
    Figure ellips;

    Scanner scanner = new Scanner(System.in);
    List<Figure> figureList = new ArrayList<>();



    public  void createFigure(int i){

        switch(i){
            case 1:

                createrF("krug");
                 break;

            case 2:

                createrF("treugolnik");
                break;

            case 3:
                createrF("kvadrat");
                break;

            case 4:
                createrF("ellips");
                break;
        }


    }

    public void createrF(String name){
        Figure obj = null;
        switch (name){

            case "krug":
                obj = new Circle(name);
                break;
            case "kvadrat":
                obj = new Square(name);
                break;
            case "treugolnik":
                obj = new Triangle(name);
                break;
            case "ellips":
                obj = new Ellips(name);
                break;
        }

        obj.setParametrs();
        figureList.add(obj);

}







    public  void deleteFigure(int i) {
        Class clazz = null;
        switch (i) {
            case 1:
                clazz = Circle.class;
                break;
            case 2:
                clazz = Triangle.class;
                break;
            case 3:
                clazz = Square.class;
                break;
            case 4:
                clazz = Ellips.class;
                break;
        }
        if (clazz != null) {
            for (Figure figure : figureList) {
                if (figure.getClass().equals(clazz)) {
                    figureList.remove(figure);
                    break;
                }
            }


        }
        else {
            System.out.println("Вы еще не создавали этой фигуры");
        }
    }



public void countArea(int iFigure){
    switch (iFigure){
        case 1:

            break;

        case 2:

            break;

        case 3:

            break;

        case 4:

            break;
    }

}






    public void showFigureList(){
        for(Object obj:figureList){
            System.out.println(obj);
        }
    }




}
