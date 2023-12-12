public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int quizNote;
    double quizOranı;


    Course(String name,String code,String prefix,double quizOranı)
    {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.quizOranı = quizOranı;
        int note = 0;
        double quizNote = 0;
    }

    public void addTeacher(Teacher teacher)
    {
        if(teacher.branch.equals(this.prefix))
            this.teacher = teacher;
        else
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor.");
    }

    public void printTeacher()
    {
        this.teacher.print();
    }
}
