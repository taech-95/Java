package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private ArrayList<Song> songs;
    private String name;
    private String artist;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    
    public boolean addSong(String title, double duration){
        if(findSong(title)== null){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }
    
    private Song findSong(String title){
        for (Song checkedSong: this.songs) {
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackedNumber, LinkedList<Song> playlist){
        int index = trackedNumber;
        if(index>=0 && index <= this.songs.size()){
            playlist.add(this.songs.get(index));
            return true;
        }

        System.out.println("This album does not have a track " + trackedNumber);
        return false;

    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This song " + title + " is not in this album");
        return false;
    }


}
