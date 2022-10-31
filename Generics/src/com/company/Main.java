package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam  = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        System.out.println(baseballTeam.numPlayers());


        Team<SoccerPlayer> soccerTeam  = new Team<>("Real Madrid");
        soccerTeam.addPlayer(beckham);
        System.out.println(soccerTeam.numPlayers());

    }
}
