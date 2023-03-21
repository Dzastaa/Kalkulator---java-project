public class Triangle extends Figure implements Printable {
    double  a, b, c;

    public Triangle(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
       // this.h=h;

        if(a <= 0 || b<=0  || c<=0){
            throw new IllegalArgumentException("Wymiary trojkata musza byc liczbami dodatnimi!");
        }
        else if(a+b<c || a+c<b ||c+b<a){
            throw new IllegalArgumentException("Wymiary trojkata nie sa poprawne!");
        }
    }

    @Override
    public double calculateArea() {

        double polowaObwodu=calculatePerimeter()/2;
        double pole = Math.sqrt(polowaObwodu*(polowaObwodu-a)*(polowaObwodu-b)*(polowaObwodu-c));
        if(pole <=0){
            throw new IllegalArgumentException("Pole trojkata jest rowne 0 badz jest ujemne!");
        }
        return pole;
        //wzor Herona
    }

    @Override
    public double calculatePerimeter() {
        double obwod = a+b+c;
        if(obwod <=0){
            throw new IllegalArgumentException("Obwod trojkata jest rowne 0 badz jest ujemne!");
        }
        return obwod;
    }

    @Override
    public void print() {
        System.out.println("Trojkat o bokach a= "+ a +" ,b= "+b+" ,c= "+c);
        System.out.println( "Pole trojkata: "+ calculateArea()+"\nObwod trojkata: "+ calculatePerimeter());
    }
}
