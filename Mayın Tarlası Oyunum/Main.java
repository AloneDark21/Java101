public class Main {
    public static void main(String[] args) {
        MineSweeper game = new MineSweeper(5,5);//oyun tahtasının boyutunu kendinize gore belirleyebilirsiniz
        System.out.println("---> Oyunuma Hosgeldiniz <---");
        game.run();
    }
}
