package com.example.TuneIn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyUser implements User {

    private String name;
    private int age;

    @Autowired
    private Playlist playlist;

    @Override
    public void setUserDetail(String name, Integer age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public Playlist getPlaylist() {
        return this.playlist;
    }
}
