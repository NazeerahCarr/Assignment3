public class EncapsulationTest  extends Encapsulation{

 public void sound(){
  System.out.println("Neigh");
 }

 public void multiplication(int x, int y) {
  z = x * y;
  System.out.println("The product of the given numbers:"+z);


 }

  public static void main(String args[]) {
   //Encapsulation
   Encapsulation enc = new Encapsulation();
   int a = 20, b = 10;
   System.out.println("Example of inheritance");
   Encapsulation demo = new Encapsulation();
   demo.addition(a, b);
   demo.Subtraction(a, b);
   System.out.println("----------------");
   System.out.println("----------------");
   System.out.println("----------------");
   System.out.println("----------------");
   System.out.println("----------------");
   System.out.println("----------------");
  // demo.multiplication(a, b);

   enc.setEmpName("Mario");
   enc.setEmpAge(32);
   enc.setEmpSSN(112233);


    System.out.println("Example of Encapsulation");
   System.out.println("Employee Name: " + enc.getEmpName());
   System.out.println("Employee SSN: " + enc.getEmpSSN());
   System.out.println("Employee Age: " + enc.getEmpAge());
   System.out.println("----------------");
   System.out.println("----------------");
   System.out.println("----------------");
   System.out.println("----------------");
   System.out.println("----------------");
   System.out.println("----------------");

//polymorphism
   System.out.println("Example of polymorphism");
   EncapsulationTest obj = new EncapsulationTest();
   obj.sound();

  }
}