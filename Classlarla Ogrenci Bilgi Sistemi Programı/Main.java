/*
Öğrenci Not Sistemi

Course Sınıfı Özellikleri :
Nitelikler : name,code,prefix,note,Teacher,quizNote,quizOrani
Metotlar : Course() , addTeacher() , printTeacher()

Teacher Sınıfı Özellikleri :
Nitelikler : name,mpno,branch
Metotlar : Teacher()

Student Sınıfı Özellikleri :
Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
*/

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Kerem", "90532145674", "MAT");
        Teacher t2 = new Teacher("Ahmet", "90532654566", "FZK");
        Teacher t3 = new Teacher("Hakan", "90535645568", "KMY");

        Course matematik = new Course("Matematik", "101", "MAT", 0.30);
        matematik.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK", 0.20);
        fizik.addTeacher(t2);
        Course kimya = new Course("Kimya", "104", "KMY", 0.20);
        kimya.addTeacher(t3);

        Student s1 = new Student("Mehmet Koç", "15", "7", matematik, fizik, kimya);
        Student s2 = new Student("Aslı Kara", "11", "7", matematik, fizik, kimya);
        Student s3 = new Student("Ezgi Su", "23", "7", matematik, fizik, kimya);

        s1.addBulkExamNote(95, 85, 90, 80, 70, 90);
        s1.isPass();

        s2.addBulkExamNote(75, 110, 90, 85, 70, 65);
        s2.isPass();

        s3.addBulkExamNote(55, 25, 40, 50, 60, 40);
        s3.isPass();

    }
    static class Student
    {
        Course c1;
        Course c2;
        Course c3;
        String name;
        String stuNo;
        String classes;
        double avarage;
        boolean isPass;

        Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3)
        {
            this.name = name;
            this.stuNo = name;
            this.classes = classes;
            this.c1 = c1;
            this.c2 = c2;
            this.c3 = c3;
            this.avarage = 0.0;
            this.isPass = false;

        }
        void addBulkExamNote(int note1,int note2,int note3,int quizNote1,int quizNote2,int quizNote3)
        {
            if((note1 >= 0 && note1 <= 100) && (quizNote1 >= 0 && quizNote1 <= 100))
            {
                this.c1.note = note1;
                this.c1.quizNote = quizNote1;

            }

            if((note2 >= 0 && note2 <= 100) && (quizNote2 >= 0 && quizNote2 <= 100))
            {
                this.c2.note = note2;
                this.c2.quizNote = quizNote2;
            }

            if((note3 >= 0 && note3 <= 100) && (quizNote3 >= 0 && quizNote3 <= 100))
            {
                this.c3.note = note3;
                this.c3.quizNote = quizNote3;
            }

        }
        void isPass() {
            this.avarage = ((this.c1.note)*(1-this.c1.quizOranı)+(this.c1.quizNote*this.c1.quizOranı) +(this.c2.note*(1-this.c2.quizOranı))+(this.c2.quizNote*this.c2.quizOranı) +(this.c3.note*(1-this.c3.quizOranı))+(this.c3.quizNote*this.c3.quizOranı))/3.0;
            System.out.println();
            System.out.println("************************");
            if (this.avarage > 55) {
                System.out.println("Hababam Sınıfı Uyanıyor.");
                isPass = true;
            } else {
                System.out.println("Hababam Sınıfı Sınıfta Kaldı.");
                isPass = false;
            }
            printNote();
        }
        void printNote()
        {
            System.out.println(this.c1.name + " Notu\t : " + c1.note);
            System.out.println(this.c1.name + " Quiz Notu\t : " + c1.quizNote);

            System.out.println(this.c2.name + " Notu\t : " + c2.note);
            System.out.println(this.c2.name + " Quiz Notu\t : " + c2.quizNote);

            System.out.println(this.c3.name + " Notu\t : " + c3.note);
            System.out.println(this.c3.name + " Quiz Notu\t : " + c3.quizNote);

            System.out.printf("Ortalamanız : %.2f",avarage);
            System.out.println();
        }
    }
    static class Course {
        Teacher teacher;
        String name;
        String code;
        String prefix;
        int note;
        int quizNote;
        double quizOranı;


        Course(String name, String code, String prefix, double quizOranı) {
            this.name = name;
            this.code = code;
            this.prefix = prefix;
            this.quizOranı = quizOranı;
            int note = 0;
            double quizNote = 0;
        }

        public void addTeacher(Teacher teacher) {
            if (teacher.branch.equals(this.prefix))
                this.teacher = teacher;
            else
                System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
        }

        public void printTeacher() {
            this.teacher.print();
        }
    }

    static class Teacher {
        String name;
        String phoneNo;
        String branch;

        Teacher(String name, String phoneNo, String branch) {
            this.name = name;
            this.phoneNo = phoneNo;
            this.branch = branch;
        }

        void print() {
            System.out.println("Adı : " + this.name);
            System.out.println("Telefon Numarası : " + this.phoneNo);
            System.out.println("Bölümü : " + this.branch);

        }
    }
}
