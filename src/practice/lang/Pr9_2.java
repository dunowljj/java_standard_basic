package practice.lang;

public class Pr9_2 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1,2,3);
        Point3D p2 = new Point3D(1,2,3);

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p1==p2?" + (p1==p2));
        System.out.println("p1.eqauols(p2)?" + (p1.equals(p2)));
    }
}

class Point3D {
    int x, y, z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point3D(){
        this(0,0,0);
    }
    //넓이 비교? 각각 비교?
    public boolean equals(Object obj){
        if(obj instanceof Point3D){
            int x,y,z;
            x = ((Point3D) obj).x;
            y = ((Point3D) obj).y;
            z = ((Point3D) obj).z;
            return (this.x==x || this.y==y || this.z == z);
        }
        return false;
    }

    public String toString(){
        return "["+x+","+y+","+z+"]";
    }
}