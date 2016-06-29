import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

FigureManipulation figureManipulation = new FigureManipulation();

        int iMethod = 1;
        int iFigure = 0;

        do {
             System.out.println("Выберите пункт");
            System.out.println("1-создать");
             System.out.println("2-удалить");
            System.out.println("3-вычислить площадь");
            System.out.println("0-выйти");
            Scanner sc = new Scanner(System.in);
        iMethod = sc.nextInt();
            if(iMethod!=0) {
                System.out.println("Выберите фигуру:");
                System.out.println("1 – круг");
                System.out.println("2 – треугольник");
                System.out.println("3 – квадрат");
                System.out.println("4 – эллипс");
                iFigure = sc.nextInt();
    }

    switch (iMethod) {
                 case 1:
                    figureManipulation.createFigure(iFigure);
                    System.out.println("Фигура " + iFigure + " создана");
                break;
                 case 2:
                     figureManipulation.deleteFigure(iFigure);
                     break;
                case 3:
                    figureManipulation.countArea(iFigure);
                    break;

    }
}
while (iMethod>=1);
figureManipulation.showFigureList();



    }

    }
