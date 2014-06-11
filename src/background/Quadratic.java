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
        if (Double.isNaN(ans1) && Double.isNaN(ans2)) {
        	result = result + "X is an imaginary number";
        }
        
        else if (Double.isNaN(ans1) && !Double.isNaN(ans2)) {
        	result = result + "X = " + ans2;
        }
        
        else if (Double.isNaN(ans2) && !Double.isNaN(ans1)) {
        	result = result + "X = " + ans1;
        }
        
        else {
        	result = result + "X = " + ans1 + "\n or X = " + ans2;
        }
        return result;
    }
    
//    public static void main(String[] args) {
//        Quadratic quad = new Quadratic(2, 3, 1);			This was only here to test the Quadratic function.
//        System.out.println(quad.solve());
//    }
}
