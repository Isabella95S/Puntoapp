import java.util.Objects;

public class Puntodue {
    private final double x;
    private final double y;

    public Puntodue(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Puntodue puntodue = (Puntodue) o;
        return Double.compare(x, puntodue.x) == 0 && Double.compare(y, puntodue.y) == 0;

    }
    @Override
    public int hashCode(){
        return Objects.hash(x,y);
    }

    @Override
    public String toString(){
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
    Puntodue p1 = new Puntodue(1.0, 2.0);
    Puntodue p2 = new Puntodue(3.0, 2.6);

    }
}