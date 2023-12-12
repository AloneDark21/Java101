public class Student {
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
