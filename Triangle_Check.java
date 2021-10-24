/*
12 :WAP to check if a triangle can be formed from given three angle.
14 :WAP to check if a triangle can be equilateral or not.
*/

class Check_Tri {
    float angle1;
    float angle2;
    float angle3;

    public Check_Tri(float a1, float a2, float a3) {
        this.angle1 = a1;
        this.angle2 = a2;
        this.angle3 = a3;
    }

    void checkTheTriange() {
        if (this.angle1 + this.angle2 + this.angle3 == 180) {
            System.out.println("Triange can be formed");
        } else {
            System.out.println("Triangle not formed");
        }
    }
}

/*
 * Equilateral Triangle: A triangle is said to be equilateral triangle if all
 * the sides are equal. If X, Y, Z are three sides of the triangle. Then, the
 * triangle is equilateral only if X = Y = Z.
 */
class Check_Equi_Tri {
    float side1;
    float side2;
    float side3;

    public Check_Equi_Tri(float a1, float a2, float a3) {
        this.side1 = a1;
        this.side2 = a2;
        this.side3 = a3;
    }

    void checkTheTriange() {
        if (this.side1 == this.side2 && this.side2 == this.side3) {
            System.out.println("Equilateral Triangle");
        } else {
            System.out.println("Not a Equilateral Triangle");
        }
    }
}

public class Triangle_Check {
    public static void main(String[] args) {
        // for angle check
        // valid case
        Check_Tri t1 = new Check_Tri(60, 60, 60);
        t1.checkTheTriange();
        // in-valid case
        Check_Tri t2 = new Check_Tri(50, 60, 60);
        t2.checkTheTriange();

        // for side check
        // valid case
        Check_Equi_Tri t3 = new Check_Equi_Tri(60, 60, 60);
        t3.checkTheTriange();
        // in-valid case
        Check_Equi_Tri t4 = new Check_Equi_Tri(50, 60, 60);
        t4.checkTheTriange();

    }
}
