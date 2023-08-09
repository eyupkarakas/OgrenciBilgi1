

public class Main {
    public static void main(String[] args) {
        Teachers t1 = new Teachers("Eyüp",1111111111,"MAT");
        Course mat = new Course("Maths","101","MAT");
        mat.addTeacher(t1);

    }
}