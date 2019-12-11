
public class ConstructorPractice {

	int test=10;
int id;
String name;
int age;
static String college="ABC";
ConstructorPractice(int id, String name)
{
	this.id=id;
	this.name=name;
}
ConstructorPractice(int i, String n, int a)
{
//	id=i;
//	name=n; Can be replaced by using this call for current class constructor
	this(i,n);
	age=a;
}

void display()
{
	System.out.println("ID:" +id + " Name:" +name + " Age:" +age +" School:" +college);
}

static void change()
{
	college="XYZ";
	// System.out.println(test); Static method cannot acces non-static variable or method
}
	public static void main(String[] args) {
		ConstructorPractice s1=new ConstructorPractice(1,"Sindhu");
		ConstructorPractice s2=new ConstructorPractice(2,"Pravs",20);
		s1.display();
		//ConstructorPractice.change(); Class name not required since calling the method from same class 
		change();		
		s2.display();	
	}

}
