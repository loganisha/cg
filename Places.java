class Hillstations{
	void location(){
      System.out.println("Location is:");
     }  
    void famousfor(){
     System.out.println("Famous for:");
    }  
 
}  
class Manali extends Hillstations {  
  void location(){
    System.out.println("It is in Himachal Pradesh");
   }  
  void famousfor(){
    System.out.println("It is Famous for adventure sports like skiing,hiking,paragliding ");
   }  
}
class Mussoorie extends Hillstations {  
  void location(){
    System.out.println("It is in Uttarakhand");
   }  
  void famousfor(){
    System.out.println("It is Famous for THE SPECTACULAR GUN hill ");
   }  
}
class Gulmarg extends Hillstations {  
  void location(){
    System.out.println("It is in Kashmir");
   }  
   void famousfor(){
    System.out.println("It is a shooting spot for many bollywood films ");
   }  
}
public class Places {

	public static void main(String[] args) {
	
		//Hillstations t= new Hillstations();
	    //t.location();
	    //t.famousfor();
	    Hillstations himachal = new Manali();
	    himachal.location();
     	himachal.famousfor();
     	Hillstations uttarkand= new Mussoorie();
     	uttarkand.location();
        uttarkand.famousfor();
		Hillstations kashmir= new Gulmarg();
		kashmir.location();
		kashmir.famousfor();
		
	}


}