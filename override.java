class Parent 
{
 void display()
 {
   System.out.println("Parent method invoked"); 
 }
}
class Child extends Parent
{
 void display()
 {
   System.out.println("child method invoked");
 }
}
class DMD
{
 public static void main(String ar[])
 {
  Parent p=new Child();
  p.display();
  Child c=new Child();
  c.display();
  Parent p1=new Child();
  p1.display();
 }
}