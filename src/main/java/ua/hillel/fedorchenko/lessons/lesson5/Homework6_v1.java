package ua.hillel.fedorchenko.lessons.lesson5;
import java.util.Scanner;

public class Homework6_v1 {
    public static void main(String[] args) {
        System.out.println("Counter Strike Match ");
        Scanner scanner = new Scanner(System.in);
        int kills_player_1 = 0;
        int kills_player_2 = 0;
        int kills_player_3 = 0;
        int kills_player_4 = 0;
        int kills_player_5 = 0;
        int kills_player_1_1 = 0;
        int kills_player_2_2 = 0;
        int kills_player_3_2 = 0;
        int kills_player_4_2 = 0;
        int kills_player_5_2 = 0;
        System.out.println("Ввести ім'я першої команди 1:");
        String team1 = scanner.nextLine();
        //   System.out.println("ім'я першої команди: " + team1);int kills_player_1 = 0;
        System.out.println(" Кількість фрагів 1-го гравеця команды "+team1);
        if (scanner.hasNextInt()) {
            kills_player_1 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }
        System.out.println(" Кількість фрагів 2-го гравеця команды "+team1);
        if (scanner.hasNextInt()) {
            kills_player_2 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }
        System.out.println(" Кількість фрагів 3-го гравеця команды "+team1);
        if (scanner.hasNextInt()) {
            kills_player_3 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }
        System.out.println(" Кількість фрагів 4-го гравеця команды "+team1);
        if (scanner.hasNextInt()) {
            kills_player_4 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }
        System.out.println(" Кількість фрагів 5-го гравеця команды "+team1);
        if (scanner.hasNextInt()) {
            kills_player_5 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }

        System.out.println("Ввести ім'я першої команди 2:");
        String team2 = scanner.nextLine();
        System.out.println(" Кількість фрагів 1-го гравеця команды "+team2);
        if (scanner.hasNextInt()) {
            kills_player_1_1 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }
        System.out.println(" Кількість фрагів 2-го гравеця команды "+team2);
        if (scanner.hasNextInt()) {
            kills_player_2_2 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }
        System.out.println(" Кількість фрагів 3-го гравеця команды "+team2);
        if (scanner.hasNextInt()) {
            kills_player_3_2 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }
        System.out.println(" Кількість фрагів 4-го гравеця команды "+team2);
        if (scanner.hasNextInt()) {
            kills_player_4_2 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }
        System.out.println(" Кількість фрагів 5-го гравеця команды "+team2);
        if (scanner.hasNextInt()) {
            kills_player_5_2 = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Wrong data! Restart program!!!");
            System.exit(0);
        }

        int summary_team_1 = kills_player_1 + kills_player_2 + kills_player_3+kills_player_3+kills_player_4+kills_player_5;
        int summary_team_2 = kills_player_1_1 + kills_player_2_2 + kills_player_3_2 + kills_player_4_2 + kills_player_5_2;
        int team_players = 5;
        int arithmetic_team_1 = summary_team_1/team_players;
        int arithmetic_team_2 = summary_team_2/team_players;

        if (arithmetic_team_1 > arithmetic_team_2) {
            System.out.println("Перемогла команда : " + team1 + " набрала " + arithmetic_team_1 + " очки/ів");
        }
        else if (arithmetic_team_1<arithmetic_team_2) {
            System.out.println("Перемогла команда : " + team2 + " набрала " + arithmetic_team_2 + " очки/ів");
        } else if (arithmetic_team_1 == arithmetic_team_2) {
            System.out.println("Перемогла дружба = " + team1 +  "набрала таку саму кількість очків: " + arithmetic_team_1 + " очки/ів " + team2 + " набрала " + arithmetic_team_2 + " очки/ів ");
        }
        // System.out.println(arithmetic_team_1);
        // System.out.println(kills_player_1);
        // System.out.println(kills_player_2);
        // System.out.println(kills_player_3);
        // System.out.println(kills_player_4);
        // System.out.println(kills_player_5);
    }
}