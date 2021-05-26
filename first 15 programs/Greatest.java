class Greatest{
    public static void main(String args []){
        int a=10,b=3,c=60;
        if(a>b && a>c){
            System.out.println(a+" is greater among :"+ a + " " + b +" "+ c);
        }
        else if (b>a && b>c){
            System.out.println(b+" is greater among :"+ a + " " + b +" "+ c);
        }
        else {
            System.out.println(c+" is greater among :"+ a + " " + b +" "+ c);

        }
    }
}