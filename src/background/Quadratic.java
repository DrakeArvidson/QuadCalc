package background;

public class Quadratic {
    int a;
    int b;
    int c;
    
    public Quadratic(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        
    }
    
    public String solve() {
        String result = "";
        
        double ans1 = (-b + (Math.sqrt(Math.pow(b, 2) - 4*a*c)))/(2*a);
        double ans2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4*a*c)))/(2*a);
        result = result + "X = " + ans1 + "\n or X = " + ans2;
        
        return result;
    }
    
    public static void main(String[] args) {
        Quadratic quad = new Quadratic(2, 3, 1);
        System.out.println(quad.solve());
    }
}
