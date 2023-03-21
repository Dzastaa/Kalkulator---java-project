//Lab1 - wykonala Justyna Slosarz

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;


        do {
            System.out.println("KALKULATOR POL I OBWODOW FIGUR DWU- I TROJWYMIAROWYCH");
            System.out.println("1.Oblicz pole i obwod kwadratu.");
            System.out.println("2.Oblicz pole i obwod trojkata.");
            System.out.println("3.Oblicz pole i obwod kola.");
            System.out.println("4.Oblicz pole i objetosc graniastoslupa o podstawie kwadratu.");
            System.out.println("5.Oblicz pole i objetosc graniastoslupa o podstawie trojkata.");
            System.out.println("6.Oblicz pole i objetosc walca.");
            System.out.println("0.Wyjscie.");

            number = scanner.nextInt();

            switch (number) {

                case 1:
                    System.out.println("KWADRAT");
                    System.out.println("Podaj bok kwadratu: ");
                    double aSquare = scanner.nextDouble();
                    Square square = new Square(aSquare);
                    square.print();
                    break;

                case 2:
                    System.out.println("TROJKAT");
                    System.out.println("Podaj podstawę trójkąta: ");
                    double aTriangle = scanner.nextDouble();

                    System.out.println("Podaj drugi bok trójkąta: ");
                    double bTriangle = scanner.nextDouble();

                    System.out.println("Podaj trzeci bok trójkąta: ");
                    double cTriangle = scanner.nextDouble();



                    Triangle triangle = new Triangle(aTriangle, bTriangle, cTriangle);
                    triangle.print();
                    break;


                case 3:
                    System.out.println("KOLO:");
                    System.out.println("Podaj promień koła: ");
                    double rCircle = scanner.nextDouble();
                    Circle circle = new Circle(rCircle);
                    circle.print();
                    break;

                case 4:
                    System.out.println("GRANIASTOSLUP O PODSTAWIE KWADRATU: ");
                    System.out.println("Podaj bok kwadratu (podstawa graniastołupa): ");
                    double aSquarePrism = scanner.nextDouble();
                    Square baseSquare = new Square(aSquarePrism);

                    System.out.println("Podaj wysokość graniastosłupa: ");
                    double hSquarePrism = scanner.nextDouble();

                    Prism prismSquare = new Prism(baseSquare, hSquarePrism);
                    prismSquare.print();
                    break;

                case 5:
                    System.out.println("GRANIASTOSLUP O PODSTAWIE TROJKATA: ");
                    System.out.println("Podaj dlugość boku trójkąta (podstawy graniastoslupa): ");

                    double aBaseTriangle = scanner.nextDouble(); //długiśc podstawy trójkąta
                    double bBaseTriangle = aBaseTriangle;
                    double cBaseTriangle = aBaseTriangle;


                    System.out.println("Podaj wysokosc graniastolupa: ");

                    double hPrismTriangle = scanner.nextDouble();
                    Triangle BasePrismTriangle = new Triangle(aBaseTriangle, bBaseTriangle, cBaseTriangle);
                    Prism prismTriangle = new Prism(BasePrismTriangle, hPrismTriangle);

                    prismTriangle.print();
                    break;

                case 6:
                    System.out.println("WALEC: ");
                    System.out.println("Podaj promien kola (podstawa walca): ");
                    double rBaseCircle = scanner.nextDouble();

                    System.out.println("Podaj wysokosc graniastolupa: ");
                    double hPrismCircle = scanner.nextDouble();
                    Circle basePrismCircle = new Circle(rBaseCircle);
                    Prism prismCircle = new Prism(basePrismCircle, hPrismCircle);

                    prismCircle.print();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Wybierz jedną z figur bądź zakończ program.");
            }
        }while(number !=0);

    }
}