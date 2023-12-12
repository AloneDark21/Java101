public class Teacher {
    String name;
    String phoneNo;
    String branch;

    Teacher(String name,String phoneNo,String branch)
    {
        this.name = name;
        this.phoneNo = phoneNo;
        this.branch = branch;
    }

    void print()
    {
        System.out.println("Adı : "+this.name);
        System.out.println("Telefon Numarası : "+this.phoneNo);
        System.out.println("Bölümü : "+this.branch);

    }
}
