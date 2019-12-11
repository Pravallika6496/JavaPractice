
class Parent1
{
  protected int i,j;
  void set_ij(int a, int b)
  {
    i=a;
    j=b;
  }
  void show_ij()
  {
    System.out.println("i=" +i +" j="+j);
  }
}
class Child1 extends Parent1
{
  int k;
  void set_ijk(int a, int b, int c)
  {
	super.set_ij(a,b);
    k=c;
  }
  void show_ijk()
  {
    super.show_ij();
    System.out.println("k="+k);
  }
  void sum()
  {
    System.out.println("i+j+k=" +(i+j+k));
  }
}
public class Inheritance
{
  public static void main(String args[])
  {
    Parent1 p1=new Parent1();
    p1.set_ij(10,15);
    p1.show_ij();
    Child1 c1=new Child1();
    c1.set_ijk(16,20,30);
    c1.show_ijk();
    c1.sum();
  }
}