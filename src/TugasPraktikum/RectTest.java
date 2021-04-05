package TugasPraktikum;

public class RectTest {
    public static void main(String[] args) {
        Rect r1 = new Rect(1,1,4,4);
        Rect r2 = new Rect (2,3,5,6);
        Rect a = r1.union(r2);
        Rect b = r2.intersection(r1);

        if(a.isInside(r2.x1, r2.y1))
            System.out.println("("+r2.x1+","+r2.y1+") is inside the union");
        System.out.println(r1+"union"+r2+"="+a);
        System.out.println(r1+"intersect"+r2+"="+b);

    }
}
