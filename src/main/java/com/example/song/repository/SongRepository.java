package com.example.song.repository;

import java.util.ArrayList;

import com.example.song.model.Song;

public interface SongRepository {
	
	ArrayList <Song> getSongsList();
    
	Song addSong(Song song);

	Song getSongById(int songId);

	Song updateSong(int songId, Song song);
    
    void deleteSong(int songId);

}