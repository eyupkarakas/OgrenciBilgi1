public class Course {
    Teachers teachers;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note=0;
    }

    void addTeacher(Teachers teachers){
        if(teachers.branch.equals(this.prefix)){
            this.teachers=teachers;
            printTeacher();
        }else {
            System.out.println("Öğretmen ve ders uyuşmuyor!");
        }
    }

    void printTeacher(){
        teachers.print();
    }

}
