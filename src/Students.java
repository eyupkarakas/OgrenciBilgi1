public class Students {
    String name;
    int stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double avarage;
    boolean isPass;

    Students(String name,int stuNo,String classes,Course course1,Course course2,Course course3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.course1=course1;
        this.course2=course2;
        this.course3=course3;
        this.avarage=0.0;
        this.isPass=false;

    }



}
