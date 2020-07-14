package Java_Certification__Questions;

public class QQ86 {

}


class Vehiicle {
    int x;

    Vehiicle() {
        this(10);// line n1
    }

    Vehiicle(int x) {
        this.x = x;
    }
}

class Caaar extends Vehiicle {
    int y;

    Caaar() {
        super(10); // line n2
    }

    Caaar(int y) {
        super(y);
        this.y = y;
    }

    public String toString() {
        return super.x + ":" + this.y;
    }

    public static void main(String[] args) {
        Vehiicle y = new Caaar(20);
        System.out.println(y);
    }
}

//What is the result?
//A. Compilation fails at line n2.
// B. Compilation fails at line n1.
// C. 20:20
//D. 10:20
//Answer: C