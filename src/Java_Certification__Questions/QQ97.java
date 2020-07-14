package Java_Certification__Questions;

public class QQ97 {

}
class Annimal {
    String type = "Canine";
    int maxSpeed = 60;

    Annimal (){

    }

    Annimal(String type, int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;
    }
}

class WWildAnimal extends Annimal {
    String bounds;

    WWildAnimal(String bounds) {
        //line n1

    }

    WWildAnimal(String type, int maxSpeed){
        //line n2
    }
}
/*
       And given the code fragment:
     WildAnimal wolf = new WildAnimal("Long");
     WildAnimal tiger = new WildAnimal("Long", 80, "Short");
     System.out.println(wolf.type+ " " + wolf.maxSpeed + " " + wolf.bounds);
     System.out.println(tiger.type+ " " + tiger.maxSpeed + " " + tiger.bounds);
        Which two modifications enable the code to print the following output? Canine 60 Long Feline 80 Short
            A. Replace line n1 with:super ();this.bounds = bounds;
            B. Replace line n1 with:this.bounds = bounds;super ();
            C. Replace line n2 with:super (type, maxSpeed);this (bounds);
            D. Replace line n1 with:this (“Canine”, 60);this.bounds = bounds
            E. Replace line n2 with:super (type, maxSpeed);this.bounds = bounds;
 */












//public class Q97Q {
//    private double length;
//    private double heigth;
//    private double area;
//
//    public void setLength(double length){
//        this.length = length;
//
//    }
//    public void setHeigth(double heigth){
//        this.heigth = heigth;
//
//    }
//
//    public void setArea(){
//        area = length*heigth;
//    }
//
//}
///*
//Which two changes would encapsulate this class and ensure that the area field is always equal to length * height whenever the Rectangle class is used?
//A.	Call the setArea method at the end of the setHeight method.
//B.	Call the setArea method at the beginning of the setHeight method.
//C.	Call the setArea method at the end of the setLength method.
//D.	Call the setArea method at the beginning of the setLength method.
//E.	Change the setArea method to private.
//F.	Change the area field to public.
//Answer: AC
// */