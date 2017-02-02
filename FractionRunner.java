public class FractionRunner {

    public static void main(String[] args) {
        
       Fraction frac = new Fraction(3,4);
       System.out.println(frac);
       Fraction frac2 = new Fraction(8,9); 
       System.out.println(frac2); 

       System.out.print("Inverse of " + frac + " = ");
       System.out.println(frac.inverse());
       
       System.out.print(frac + " + " + frac2 + "=");
       System.out.println(frac.plus(frac2));
       System.out.print(frac + " - " + frac2 + " = ");
       System.out.println(frac.minus(frac2));

       System.out.print(frac + " * " + frac2 + " = ");
       System.out.println(frac.times(frac2));
       System.out.print(frac + " / " + frac2 + " = ");
       System.out.println(frac.divided(frac2));


    }


}