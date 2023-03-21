//biblioteka matematyczna
import static java.lang.Math.pow;

public class Circle extends Figure implements Printable  {
    double pi = Math.PI;
    double r;

    public Circle(double r){
        this.r=r;
        if(r <= 0){
            throw new IllegalArgumentException("Dlugosc promienia musi byc dodatnia!");
        }
    }
    @Override
    public double calculateArea() {

        double poleO=pi*pow(r,2);
        if(poleO<=0){
            throw new IllegalArgumentException("Pole jest ujemne badz rowne 0!");
        }
        return poleO;
    }

    @Override
    public double calculatePerimeter() {
        return 2*pi*r;
    }

    @Override
    public void print() {
        System.out.println("Koło o promieniu r= "+ r + "\nPole kola: "+ calculateArea()+"\nObwod kola: "+ calculatePerimeter());
    }
}
