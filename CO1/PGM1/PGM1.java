// Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of the class and find the product having the lowest price

class Product{
    String pname;
    double price;
    int pcode; 

Product(int pcode , String pname , double price){
    this.pcode = pcode;
    this.pname = pname;
    this.price = price;
}

String lowPrice(Product p1 , Product p2 , Product p3){
    if(p1.price<p2.price && p1.price<p3.price){
            return p1.pname;
        }
        else if (p2.price<p1.price && p2.price<p3.price){
            return p2.pname;        }
        else {
            return p3.pname;        }
}
}

class PGM1{
    public static void main(String args[]){
        
        Product p1 = new Product(101,"CRICKET BAT",1200);
        Product p2 = new Product(102,"CRICKET BALL ",450);
        Product p3 = new Product(105,"CRICKET WICKETS",1340);

        String low = p1.lowPrice(p1,p2,p3);
        System.out.println(" product having lowest price : " + low);       
        
    }
}