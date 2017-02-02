public class Fraction  {

    private int num;
    private int den; 


    //constructors 
    public Fraction() {
        this.num = 1;
        this.den = 1; }
    
    public Fraction(int num, int den) {
        this.num = num;
        this.den = den; }
    
    //accessors
    public int getnum(){
        return num;
    }

    public int getden(){
        return den;
    }

    public Fraction inverse() {

        return new Fraction(this.getden(), this.getnum()); }

    public Fraction times(Fraction f) {
        int numMult = this.getnum() * f.getnum(); 
        int denMult = this.getden() * f.getden();
        return new Fraction(numMult, denMult); }

    public Fraction divided(Fraction f) {

       return  this.times(f.inverse()); }

    public Fraction minus(Fraction f) {
        
        int top = this.getnum()*f.getden() - this.getden()*f.getnum(); 
        int bottom = this.getden() * f.getden();

        return new Fraction(top, bottom);
    }

    public Fraction plus(Fraction f) {
        
        int top = this.getnum()*f.getden() + this.getden()*f.getnum(); 
        int bottom = this.getden() * f.getden();

        return new Fraction(top, bottom);
    }

    public String toString() {
        return (num + "/" + den);
    }












}