public class Prism implements Printable{

    Figure base;
    double h;

    public Prism(Figure base, double h){
        this.base =base;
        this.h=h;
        if(h<=0){
            throw new IllegalArgumentException("Wysokosc graniastoslupa musi byc dodatnia!");
        }
    }

    public double calculateAreaPrism(){
        double pole = 2* base.calculateArea() + base.calculatePerimeter()*h;
        if(pole <=0){
            throw new IllegalArgumentException("Pole jest ujemne badz rowne 0!");
        }
        return pole;
    }

    public  double calculateVolumePrism(){

        return base.calculateArea()*h;
    }
    @Override
    public void print() {
        System.out.println("Pole graniastosłupa wynosi: "+calculateAreaPrism());
        System.out.println("Objetosc graniastoslupa wynosi: "+calculateVolumePrism());
    }
}
