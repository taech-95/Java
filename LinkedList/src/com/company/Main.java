package com.company;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
	// write your code here

        Album album = new Album("Back in Black", "AC/DC");
        album.addSong("Back in black", 3.4);
        album.addSong("You shook me all night long", 3.5);
        album.addSong("Holy man", 3.9);
        album.addSong("Thunderstruck", 4.4);
        album.addSong("Hold on", 4.6);
        album.addSong("Blitz", 2.4);
        album.addSong("Hells Bells", 5.4);
        album.addSong("Highway to hell", 4.2);
        albums.add(album);

        album = new Album("Stormbringer", "Deep purple");
        album.addSong("Let's go", 3.4);
        album.addSong("C.O.D", 3.5);
        album.addSong("Evil Walks", 3.9);
        album.addSong("Thunderstruck", 4.4);
        album.addSong("I put the finger on you", 4.6);
        album.addSong("Blitz", 2.4);
        album.addSong("Hells Bells", 5.4);
        album.addSong("Highway to hell", 4.2);

        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlayList("Back in Black",playlist);
        albums.get(0).addToPlayList("Blitz",playlist);
        albums.get(0).addToPlayList("You shook me all night long",playlist);
        albums.get(0).addToPlayList(7,playlist);

        play(playlist);

    }

    public static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size()==0){
            System.out.println("No songs in a playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing + " + listIterator.next().toString());
                    } else {
                        System.out.println("End of the list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing + " + listIterator.next().toString());
                    } else {
                        System.out.println("Start of the list");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Replay " + listIterator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("We are at the start of the list");
                        }
                    }else {
                        if(listIterator.hasNext()){
                            System.out.println("Replay " + listIterator.next().toString());
                            forward = true;
                        }else {
                            System.out.println("We are at the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song"+
                "3 - to replay the current song\n"+
                "4 - list songs in the playlist\n"+
                "5 - print available actions.");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> listIterator = playlist.iterator();
        System.out.println("=================================");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next().toString());
        }
        System.out.println("=================================");
    }


}
