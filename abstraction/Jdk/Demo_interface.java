package Jdk;

interface Demo321{
    default void dis() {
    	System.out.println("heii");
    }
   
}
/*class Demo123 implements Demo321{
   @Override
   public void dis(){
	   Demo321.super.dis();
        System.out.println("hello000");
   }*/

public class Demo_interface implements Demo321 {

	public static void main(String[] args) {
		
	      // Demo123 d=new Demo123();
	       //d.dis();
		Demo_interface d=new Demo_interface();
		//	Demo321.super.dis();
	d.dis(); 
	       
	       
	}

}
