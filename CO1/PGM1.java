class Product{
    String pname;
    double price;
    int pcode; 

}
class PGM1{
    public static void main(String args[]){
        
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        p1.pname="CRICKET BAT";
        p1.price=1200;
        p1.pcode=101;

        p2.pname="CRICKET BALL";
        p2.price=450;
        p2.pcode=102;
    
        p3.pname="CRICKET WICKETS";
        p3.price=1340;
        p3.pcode=105;

        
        if(p1.price<p2.price && p1.price<p3.price){
            System.out.println(p1.pname + " has lowest price");
        }
        else if (p2.price<p1.price && p2.price<p3.price){
            System.out.println(p2.pname + " has lowest price");
        }
        else {
            System.out.println(p3.pname + " has lowest price");
        }

    }
}