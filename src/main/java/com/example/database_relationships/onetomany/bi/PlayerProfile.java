package com.example.database_relationships.onetomany.bi;

import com.example.database_relationships.onetoone.Player;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class PlayerProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String twitter;

    @OneToOne(mappedBy = "playerProfile" ,cascade = CascadeType.ALL)
    @JsonBackReference
    private com.example.database_relationships.onetoone.Player player;

    public PlayerProfile() {
    }

    public com.example.database_relationships.onetoone.Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerProfile(String twiter) {
        this.twitter = twiter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @Override
    public String toString() {
        return "PlayerProfile{" +
                "id=" + id +
                ", twitter='" + twitter + '\'' +
                ", player=" + player +
                '}';
    }
}
