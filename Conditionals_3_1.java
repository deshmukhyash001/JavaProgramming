class Main{
    public static void main(String[] args){
        int a = 18; 
        if(a>=18 && a<=40){
            System.out.println("You are eledgible to applying for Driving lisence");
        }
        else if(a>40 && a<100){
            System.out.println("You can apply for Driving lisence but you need Medical certificate");
        }
        else{
            System.out.println("You are not eledgible for Driving lisence ");
        }
    }
}
