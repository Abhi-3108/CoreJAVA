
/*CoreJAVA Coding Test(27-12-2024)  10Q * 10Marks  = 100
                                  
  1.  MultiLevelInheritance
  2.  LoginDetails (Method Overloading 
  3.  Employee5 (Constructors)
  4.  Inheritance_Overriding8
  5.  StaticProg6
  6.  StringBuilderExample
  7.  SpiltDemo
  8.  BookImpl4 (interface)
  9.  ProductImpl3 (abstract class)
 10.  AgeNotSupportException

*/
//Q & A :

//1.  MultiLevelInheritance

class Myperson
{	   public void personInfo() {
		   System.out.println("Rajesh");
 
	   }
}
class PersonDetails  extends Myperson{
 	public void personData() {
 		System.out.println("Hyderabad");
 	}
 }
public class MultiLevelInheritance extends PersonDetails {
	public void show() {
		System.out.println("Local methods ");
	}
	public static void main(String[] args) {
		MultiLevelInheritance mi=new MultiLevelInheritance();
		mi.personInfo();
		mi.personData();
		mi.show();
	}
}

// 2.  LoginDetails

