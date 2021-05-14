public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1200;
        int every20Rubles = 20;
        int mile = 1;
        int totalMileBonus = ticketPrice / every20Rubles * mile;
        System.out.println("Начисленно миль: " + totalMileBonus);
    }
}


