package org.example;

import org.example.model.MusicType;

import java.util.ArrayList;
import java.util.List;

public class MusicService {

    public List getAvailableArtist(MusicType type){

        List artist = new ArrayList();

        if (type.equals(MusicType.ROCK)){
            artist.add("BMTH");
            artist.add("MCR");
        } else if (type.equals(MusicType.POP)) {
            artist.add("Dua Lipa");
            artist.add("Halsey");
        }else if (type.equals(MusicType.INDIE)){
            artist.add("Tamino");
            artist.add("Frank Ocean");
        }else
            artist.add("No artist available :(");
        return artist;
    }
}
