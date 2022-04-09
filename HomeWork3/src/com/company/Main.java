package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] firstTeam = {45, 31, 24, 22, 20, 17, 14, 13, 12, 10};
        int[] secondTeam = {31, 18, 15, 12, 10, 8, 6, 4, 2, 1};
        int[] thirdTeam = {51, 30, 10, 9, 8, 7, 6, 5, 2, 1};

        int[] regionalTeam12 = merge(firstTeam, secondTeam);
        int[] nationalTeam = merge(regionalTeam12, thirdTeam);

        System.out.println(Arrays.toString(nationalTeam));
    }

    public static int[] merge (int[] team1, int[] team2) {
        int[] team12 = new int[team1.length + team2.length - 10];
        int i = 0;
        int j = 0;
        int k = 0;

        while((i < team1.length - 5 || j < team2.length - 5) && k < 10) {
            if(i == team1.length) {
                team12[k] = team2[j];
                j++;
            } else if(j == team2.length) {
                team12[k] = team1[i];
                i++;
            }
            else {
                if(team1[i] >= team2[j]) {
                    team12[k] = team1[i];
                    i++;
                } else {
                    team12[k] = team2[j];
                    j++;
                }
            }
            k++;
        }
        return team12;
    }
}
