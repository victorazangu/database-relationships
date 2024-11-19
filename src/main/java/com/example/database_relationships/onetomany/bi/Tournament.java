package com.example.database_relationships.onetomany.bi;

import com.example.database_relationships.onetomany.uni.Registration;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String name;
    private String location;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "tournament_id")
    private List<com.example.database_relationships.onetomany.uni.Registration> registrations = new ArrayList<>();

    public Tournament() {
    }

    public Tournament(String name, String location, List<com.example.database_relationships.onetomany.uni.Registration> registrations) {
        this.name = name;
        this.location = location;
        this.registrations = registrations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<com.example.database_relationships.onetomany.uni.Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<com.example.database_relationships.onetomany.uni.Registration> registrations) {
        this.registrations = registrations;
    }

    public void addRegistration(Registration reg) {
        registrations.add(reg);
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", registrations=" + registrations +
                '}';
    }
}
