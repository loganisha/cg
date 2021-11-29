abstract class Bank{    
abstract int getRateOfInterest();    
}    
class hdfc extends Bank{    
int getRateOfInterest(){return 6;}    
}    
class icici extends Bank{    
int getRateOfInterest(){return 7;}    
}    
    
class TestBank{    
public static void main(String args[]){    
Bank b;  
b=new hdfc();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
b=new icici();  
System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
}} 