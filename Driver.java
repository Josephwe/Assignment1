public class Driver {
    public static void main(String[] args){
        Students s1 = new Students("001", "Wendell Joseph", "CISC220", "Cedar Valley");
        Students s2 = new Students("002", "Newton Charles", "CISC220", "Cedar Grove");
        Students s3 = new Students("003", "Cristal Jarvis", "ENG105", "English Harbour");
        Students s4 = new Students("004", "Kaleel Boston", "ENG105", "Cooks Hill");
        Students s5 = new Students("004", "Alanzo Williams", "CISC125", "Cooks Hill");




        Course c1 = new Course("Object Oriented Programming", "001", "2");
        Course c2 = new Course("English Language", "002","2");
        Course c3 = new Course("Java", "002","1");

        Faculty f1 = new Faculty("Martin Imhoff", "100", "Cedar Valley");
        Faculty f2 = new Faculty("English Language", "200", "Potters");
        Faculty f3 = new Faculty("Java", "300", "Potters");

        c1.addStudents("Wendell Joseph");
        c1.addStudents("Newton Charles");

        c2.addStudents("Cristal Jarvis");
        c2.addStudents("Kaleel Boston");

        c3.addStudents("Alanzo Williams");


        System.out.println();
        System.out.println("Students in Course 1:"
            + c1.getNumStudents());

        System.out.println();
        System.out.println("Students in Course 2:"
            +c2.getNumStudents());

        System.out.println();
        System.out.println("Students in Course 2:"
                +c3.getNumStudents());

        System.out.println();
        System.out.println("Teacher for Course 1:"
                +f1.getFacultyName());

        System.out.println();
        System.out.println("Teacher for Course 2:"
                +f2.getFacultyName());

        System.out.println();
        System.out.println("Teacher for Course 3:"
                +f3.getFacultyName());





    }
}
