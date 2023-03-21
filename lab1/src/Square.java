import static java.lang.Math.pow;

public class Square extends Figure implements Printable{

    double a;
    public Square(double a){
        this.a=a;
        if(a <= 0){
            throw new IllegalArgumentException("Dlugosc boku kwadratu musi byc dodatnia!");
        }
    }

    @Override
    public double calculateArea() {
        return pow(a,2);
    }

    @Override
    public double calculatePerimeter() {
        return 4*a;
    }

    @Override
    public void print() {
        System.out.println("Kwadrat o boku a= "+ a + "\nPole kwadratu: "+ calculateArea()+"\nObwod kwadratu: "+ calculatePerimeter());
    }
}
