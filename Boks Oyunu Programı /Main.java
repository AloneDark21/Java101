/*
    * Java Sınıflar ile boks maçını simüle eden programı yazıyoruz.
    * iki sınıfımız olacak birisi maç diğeri boksçuların olduğu sınıf
    * weight -> boksçuların ağırlıkları
    * damage -> bir vuruşta rakipte yaratıkkları hasar miktarı
    * healt -> kalan gücleri
    * dodge -> karşıdan gelen hasarı bloklama miktarı
*/

public class Main
{
    public static void main(String[] args)
    {
        Fighter f1 = new Fighter("X",90,30,150,20);
        Fighter f2 = new Fighter("Y",95,30,150,20);

        Match match = new Match(f1,f2,80,100);
        match.run();
    }
    static class Fighter
    {
        String name;
        int weight;
        int damage;
        int healt;
        double dodge;

        Fighter(String name, int weight, int damage, int healt, double dodge)
        {
            this.damage = damage;
            this.healt = healt;
            this.name = name;
            this.weight = weight;
            this.dodge = dodge;
        }
        public int hit(Fighter foe)
        {
            System.out.println(this.name + " => " + foe.name + " " + this.damage + " Hasar vurdu.");

            if(foe.isDodge())
            {
                System.out.println(foe.name + " Gelen hasarı blokladı!");
                System.out.println("----------------");
                return foe.healt;
            }
            if(foe.healt - this.damage < 0)
            {
                return 0;
            }

            return foe.healt - this.damage;
        }

        boolean isDodge()
        {
            double randomNumber = Math.random() * 100;
            return randomNumber <= this.damage;
        }
    }
    static class Match
    {
        Fighter f1;
        Fighter f2;
        int maxWeight;
        int minWeight;

        Match(Fighter f1, Fighter f2, int minWeight, int maxWeight)
        {
            this.f1 = f1;
            this.f2 = f2;
            this.minWeight = minWeight;
            this.maxWeight = maxWeight;
        }

        public void run()
        {
            if(isCheck())
            {
                boolean isFirstFighterTurn = Math.random() < 0.5;
                //0 - 1 arasında rastgele değer üretilecek eğer değer 0.5 ten küçükse ilk vuruşu f1 yapacak
                //eğer 0.5 te büyükse ilk vuruşu f2 yapcak
                while (this.f1.healt > 0 && this.f2.healt > 0 )
                {
                    System.out.println("*****YENİ ROUND*****");
                    if(isFirstFighterTurn){
                        this.f2.healt = this.f1.hit(this.f2);
                    }
                    else
                    {
                        this.f1.healt = this.f2.hit(this.f1);
                    }
                    if(isWin())
                    {
                        break;
                    }

                    System.out.println(this.f1.name + " Kalan Gücü : " + this.f1.healt);
                    System.out.println(this.f2.name + " Kalan Gücü : " + this.f2.healt);

                    isFirstFighterTurn = !isFirstFighterTurn;
                }
            }
            else
            {
                System.out.println("Bu boksörler aynı siklette yarışamazlar");
            }
        }
        public boolean isCheck()
        {
            return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
        }

        public boolean isWin()
        {
            if(this.f1.healt == 0)
            {
                System.out.println(this.f2.name + " Kazandı.");
            }
            if(this.f2.healt == 0)
            {
                System.out.println(this.f1.name + " Kazandı.");
            }

            return false;
        }
    }
}
