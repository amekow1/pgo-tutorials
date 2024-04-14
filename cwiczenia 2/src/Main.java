public class Main {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.firstName="Alicja";
        s1.lastName="Kowalska";
        s1.indexNumber="s30627";
        s1.email="s30627@pjwstk.edu.pl";
        s1.adress="Wolskiego 1";
        s1.grades=new double[]{4,3,5,2};
        double srednia1=s1.ZliczanieOcenIobliczSrednia();


        Student s2=new Student();
        s1.firstName="Karol";
        s1.lastName="Nowak";
        s1.indexNumber="s30457";
        s1.email="s30457@pjwstk.edu.pl";
        s1.adress="Tęczowa 3";
        s1.grades=new double[]{5,2,3,4};
        double srednia2=s2.ZliczanieOcenIobliczSrednia();

        Student s3=new Student();
        s1.firstName="";
        s1.lastName="Kowalska";
        s1.indexNumber="s30627";
        s1.email="s30627@pjwstk.edu.pl";
        s1.adress="Wolskiego 1";
        s1.grades=new double[]{4,3,5,2};
        double srednia3= s3.ZliczanieOcenIobliczSrednia();



    }
}