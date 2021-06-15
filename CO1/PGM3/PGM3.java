// Add complex numbers 

class Complex{
    int real;
    int image;

    Complex(int real , int image){
        this.real = real;
        this.image = image;
    }

    void addComplex(Complex cn1 , Complex cn2){
        int realNum = cn1.real + cn2.real ;
        int imageNum = cn1.image + cn2.image ;
    
        System.out.println( "(" + cn1.real + " + " + cn1.image + " i ) + ( " + cn2.real + " + " + cn2.image + " i ) = " + realNum + " + " + imageNum + "i" );
    }
}
class PGM3{
    public static void main(String args[]){
        Complex cn1 = new Complex(5,3);
        Complex cn2 = new Complex(3,2);

        cn1.addComplex(cn1,cn2);
    }
}