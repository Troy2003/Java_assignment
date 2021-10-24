/*
Q :WAP to print total marks of a student from given marks of 5 subject, also print percentage is
student if pass. (Passing marks 40 per subjects.) using nested if statement.

Q :WAP to print division according to given percentage.

Per Div
&gt;=75 DT
60-75 I st
50-60 II nd
40-50 III rd
&lt;40 Fail

*/

class MarkCalc {
    float M3;
    float A_and_DE;
    float Ds;
    float Oop;
    float Evs;
    float Dis_and_Gt;
    float total;
    float percent;

    public MarkCalc(float M3, float A_and_DE, float Ds, float Oop, float Evs, float Dis_and_Gt) {
        this.M3 = M3;
        this.A_and_DE = A_and_DE;
        this.Ds = Ds;
        this.Oop = Oop;
        this.Evs = Evs;
        this.Dis_and_Gt = Dis_and_Gt;

        total = this.M3 + this.A_and_DE + this.Ds + this.Oop + this.Evs + this.Dis_and_Gt;
        percent = (total / 600) * 100 ;
    }

    void printMark() {
        System.out.println("M3 Marks: " + this.M3);
        System.out.println("A&DE Marks: " + this.A_and_DE);
        System.out.println("Ds Marks: " + this.Ds);
        System.out.println("Opp Marks: " + this.Oop);
        System.out.println("EVS Marks: " + this.Evs);
        System.out.println("Dis&Gt Marks: " + this.Dis_and_Gt);

    }

    void getPercentage() {
        System.out.println("Percentage: " + percent + "%");
    }

    void isPass() {
        if (this.M3 < 40 || this.A_and_DE < 40 || this.Ds < 40 || this.Oop < 40 || this.Evs < 40
                || this.Dis_and_Gt < 40) {
            System.out.println("Sorry You are fail");
        } else {
            System.out.println("You are pass");
        }
    }

    void getPostion() {
        if (percent >= 75) {
            System.out.println("DT");
        } else if (percent < 70 && percent >= 60) {
            System.out.println("First Div");
        } else if (percent < 60 && percent >= 50) {
            System.out.println("Second Div");
        } else if (percent < 50 && percent >= 40) {
            System.out.println("Third Div");
        } else {
            System.out.println("Fail");
        }
    }

}

public class Student {
    public static void main(String[] args) {
        MarkCalc yash = new MarkCalc(60, 60, 40, 40, 50, 49);
        yash.printMark();
        yash.getPercentage();
        yash.isPass();
        yash.getPostion();
    }
}