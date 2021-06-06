class Complex{
    int n;
    int j;
}

class PGM3{
    public static void main(String args[]){

        int real;
        int image;

        Complex cn1 = new Complex();
        Complex cn2 = new Complex();

        cn1.n=5;
        cn1.j=2;

        cn2.n=3;
        cn2.j=3;

        real = cn1.n + cn2.n;
        image = cn1.j + cn2.j;

        System.out.println( "(" + cn1.n + "+" + cn1.j + "i ) + " + "(" + cn2.n + "+" + cn2.j + "i ) = " + real + "+" + image + "i");

    }
}