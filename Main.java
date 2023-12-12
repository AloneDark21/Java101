public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Kerem","90532145674","MAT");
        Teacher t2 = new Teacher("Ahmet","90532654566","FZK");
        Teacher t3 = new Teacher("Hakan","90535645568","KMY");

        Course matematik = new Course("Matematik","101","MAT",0.30);
        matematik.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK",0.20);
        fizik.addTeacher(t2);

        Course kimya = new Course("Kimya","104","KMY",0.20);
        kimya.addTeacher(t3);

        Student s1 = new Student("Mehmet Koç","15","7",matematik,fizik,kimya);
        Student s2 = new Student("Aslı Kara","11","7",matematik,fizik,kimya);
        Student s3 = new Student("Ezgi Su","23","7",matematik,fizik,kimya);

        s1.addBulkExamNote(95,85,90,80,70,90);
        s1.isPass();

        s2.addBulkExamNote(75,110,90,85,70,65);
        s2.isPass();

        s3.addBulkExamNote(55,25,40,50,60,40);
        s3.isPass();

    }
}