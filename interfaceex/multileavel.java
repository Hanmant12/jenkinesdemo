package interfaceex;
interface Area
{
    float compute(float x, float y);
}
class Rectangle implements Area
{    public float compute(float x, float y)
    {    return(x * y);
    }
}
class Triangle implements Area
{    public float compute(float x,float y)
    {    return(x * y/2);
    }
}
public class multileavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();
        Area area;
        area = rect;
        System.out.println ("Area Of Rectangle = "+ area.compute(1,2));
        area = tri;
        System.out.println ("Area Of Triangle = "+ area.compute(10,2));
	}

}
