package shubham;

import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        Player[] players = new Player[1001];
        while (sc.hasNextInt()) {
            int id = sc.nextInt();
            String str = sc.nextLine();
            String country = sc.nextLine();
            String side = sc.nextLine().toLowerCase();
            double price = sc.nextDouble();
            players[count++] = new Player(id, country, side, price);
        }
        String str = sc.nextLine();
        String search = sc.nextLine().toLowerCase();
        Player[] result = searchPlayerForMatch(search, players);
        for (int i = 0; i < result.length; i++) {
            if (result[i] != null) {
                System.out.println(result[i].getId() + " ");
            }
        }
    }

    public static Player[] searchPlayerForMatch(String search, Player[] players) {
        // method logic
        Player[] result = new Player[1001];
        int count = 0;

        for (int i = 0; i < players.length; i++) {
            if (players[i] != null && players[i].getSide().equals(search))
                result[count++] = players[i];
        }

        if (count >= 1) {
            Arrays.sort(result, 0, count - 1, new IdComparator());
        }
        return result;

    }
}

class IdComparator implements Comparator<Player> {
    @Override
    public int compare(Player p1, Player p2) {
        return p1.getId() - p2.getId();
    }
}

class Player {
    int id;
    String country;
    String side;
    double price;

    public Player(int id, String country, String side, double price) {
        this.id = id;
        this.country = country;
        this.side = side;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getCountry() {
        return country;
    }

    public String getSide() {
        return side;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Id: " + id + "  Country: " + country + "  Side: " + side + "  Price : " + price;
    }
}
