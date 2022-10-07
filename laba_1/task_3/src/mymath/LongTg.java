package mymath;

public class LongTg {
    public float a;
    public float b;

    public LongTg(float a, float b){
        this.a = a;
        this.b = b;
    }

    public void Calculate(float step){
        for(float x = a; x <= b; x += step){
            System.out.printf("%10.4f\t %10.4f\n", x, Math.tan(x));
        }
    }

}
