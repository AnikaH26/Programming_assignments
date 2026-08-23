import javax.lang.model.util.ElementScanner14;

public class Quadratic {
    public static void main(String[] args) {
    int a=5;
    int b=3;
    int c=4;
    int discriminant=(b^2)-(4*a*c);
    if (discriminant==0)
        {System.out.println("One root exists");}
    else if (discriminant>0)
            {System.out.println("Two roots exist");}
    else if (discriminant<0)
        {System.out.println("No roots exist");}

    if (a>0)
        {System.out.println("Opens Up");}
    else if (a<0)
        {System.out.println("Opens Down");}
    
    else {
        System.out.println("Not a parabola");
    }
        
    
}
}
        

