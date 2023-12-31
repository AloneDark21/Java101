/*
    *Java'da "Employee" adında fabrika çalışanlarını temsil eden
ve metotları ile çalışanların maaşlarını hesaplayan bir sınıf yazmalısınız. Bu sınıf 4 nitelik ve 5 metoda sahip olacaktır.

    *Sınıfın Nitelikleri
    ->name : Çalışanın adı ve soyadı
    ->salary : Çalışanın maaşı
    ->workHours : Haftalık çalışma saati
    ->hireYear : İşe başlangıç yılı

    *Sınıfın Metotları
    ->Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
    ->tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
        ->Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        ->Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
    ->bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise
fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    ->raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
        ->Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        ->Eğer çalışan 10 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        ->Eğer çalışan 20 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
    ->toString() : Çalışana ait bilgileri ekrana bastıracaktır.
*/
public class Main {
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Kerem Yıldırım",2000.0,1985,45);
        e1.toStrings();
        Employee e2 = new Employee("Aslı Koç",3000,2000,50);
        e2.toStrings();
    }
    static class Employee
    {
        String name;
        double salary;
        int workHouse;
        int hireYear;

        Employee(String name, double salary, int hireYear, int workHouse)
        {
            this.name = name;
            this.salary = salary;
            this.hireYear = hireYear;
            this.workHouse = workHouse;
        }

        public double tax()
        {
            double vergi;
            if(this.salary < 1000)
            {
               vergi = 0;
               return vergi;
            }
            else
            {
                return this.salary*0.03;
            }

        }
        public double bonus()
        {
            if(this.workHouse < 40)
            {
               return this.salary;

            }
            else
            {
                 return  (this.workHouse - 40)*30;
            }
        }
        public double raiseSalary()
        {
            int calıstıgı_yıl = (2021 - this.hireYear );

            if(calıstıgı_yıl < 10)
            {
                if(calıstıgı_yıl > 9 && calıstıgı_yıl < 10){
                    return this.salary*0.10;
                }
                else
                    return this.salary*0.05;
            }
            if(calıstıgı_yıl > 9 && this.hireYear < 20)
            {
                if(calıstıgı_yıl > 19 && calıstıgı_yıl < 20)
                {
                    return this.salary*0.15;
                }
                else
                    return this.salary*0.10;
            }
            else
            {
                return this.salary*0.15;
            }
        }
        public void toStrings()
        {
            System.out.println( "\n*******Çalışan Bilgileri*******"
                               +"\nAdı : " +this.name
                               + "\nMaaşı : " + this.salary
                               + "\nÇalışma Saati : "+ this.workHouse
                               + "\nBaşladığı Sene : "+ this.hireYear
                               + "\nVergi : "+ this.tax()
                               + "\nBonus :"+ this.bonus()
                               + "\nMaaş Artışı : "+this.raiseSalary()
                               + "\nVergi ve Bonuslar ile maaş : "+(-tax()+bonus()+this.salary)
                               + "\nToplam maaş : "+ (-this.tax()+this.bonus()+this.raiseSalary()+this.salary));
        }
    }
}
