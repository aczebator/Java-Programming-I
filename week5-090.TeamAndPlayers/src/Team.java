//
//import java.util.ArrayList;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author adrianneczebator
// */
//public class Team {
//  private String name;
//  private ArrayList<Player> players;
//  private int maxSizeOfTeam;
//  //private ArrayList<Player> player;
//    
//  public Team(String name){
//        this.name = name;
//        this.players = new ArrayList<Player>();
//        this.maxSizeOfTeam = 16;
//        
//        }
////    public void addPlayer (Player name, int goals){
////        this.list.add(name);
////        
////    }
//   public void addPlayer (Player name){
//       if(players.size() < maxSizeOfTeam) {
//       players.add(name);
//       }
//    }
//   public String getName(){
//       return this.name;
//   } 
//   public  void printPlayers() {
////        String playerAsString = "";
//        for ( Player member : players) {
//            System.out.println(member);
//        }
//       
//    }
//
//    
////    public String getName(){
////        return this.name; 
////   }
////}
//
//    public void setMaxSize(int maxSize){
//        maxSizeOfTeam = maxSize;
//    }
// 
//    public int size(){
//        if(this.maxSizeOfTeam < players.size()) {
//            return players.size();
//        }else{
//            return this.players.size();
//        }
//    }
//    
//    public int goals(){
//        int goal = 0;
//        for(Player members : players){
//            goal += members.goals();
//        }return goal;
//    }
//}
import java.util.ArrayList;
 
public class Team {
    private String teamName;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSizeOfTeam;
 
    public Team(String name){
        this.teamName = name;
        //this.players = new ArrayList<Player>();
        this.maxSizeOfTeam = 16;
 
    }
 
    public String getName(){
        return this.teamName;
    }
 
    public void addPlayer(Player name){
        if(players.size() < maxSizeOfTeam) {
            players.add(name);
        }
    }
 
    public void printPlayers(){
        for(Player members : players){
            System.out.println(members);
        }
    }
 
    public void setMaxSize(int maxSize){
        maxSizeOfTeam = maxSize;
    }
 
    public int size(){
        if(this.maxSizeOfTeam < players.size()) {
            return players.size();
        }else{
            return this.players.size();
        }
    }
 
    public int goals(){
        int goal = 0;
        for(Player members : players){
            goal += members.goals();
        }return goal;
    }
}