import java.util.Scanner;
class Result
{
    public float calculateArea(float radius)
    {
        float Area = 3.14f * radius * radius;
        return Area;
    }
    public float calculatePerimeter(float radius)
    {
        float Perimeter = 2* 3.14f * radius;
        return Perimeter;
    }
}
public class AreaPeriCircle 
{
    public static void main(String[] args)
    {
    float radius;
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter radius of circle: ");
    radius = ob.nextFloat();

    Result re = new Result();
    System.out.println("Area Of Circle: "+ re.calculateArea(radius));
    System.out.println("Perimeter Of Circle: "+re.calculatePerimeter(radius));
    }
}
