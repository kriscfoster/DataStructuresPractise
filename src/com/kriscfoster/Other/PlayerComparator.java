package com.kriscfoster.Other;

import java.util.*;

// Comparators are used to compare two objects
class PlayerComparator implements Comparator<Player> {
    public int compare(Player s1, Player s2) {
        int diff = s2.score - s1.score;

        if (diff == 0) {
            diff = s1.name.compareTo(s2.name);
        }

        return diff;
    }

    public static void main(String[] args) {
        System.out.println("COMPARATORS");
        List<Player> list = new ArrayList();
        list.add(new Player("john", 60));
        list.add(new Player("simon", 80));
        list.add(new Player("billy", 55));
        list.add(new Player("conor", 60));
        list.add(new Player("billy", 99));

        System.out.println("\nBEFORE SORT");
        list.forEach(System.out::println);
        list.sort(new PlayerComparator());
        System.out.println("\nAFTER SORTING SCORE DESCENDING && NAME DESCENDING");
        list.forEach(System.out::println);
        list.sort(Comparator.comparing(Player::getScore).thenComparing(Player::getName));
        System.out.println("\nAFTER SORTING SCORE ASCENDING && NAME DESCENDING");
        list.forEach(System.out::println);
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
