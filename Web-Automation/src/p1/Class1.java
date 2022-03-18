//How to return an object?

package p1;

public class Class1 {

	public static void main(String[] args) 
	{
		Sample o=Sample.Return();
	}
	

}

class Sample
{
	public static Sample Return()
	{
		Sample obj=new Sample();
		return obj;
	}
}
