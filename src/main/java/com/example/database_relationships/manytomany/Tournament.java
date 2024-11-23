package com.example.database_relationships.manytomany;

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
    private List<Registration> registrations = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(
            name = "tournament_categories",
            joinColumns = @JoinColumn(name = "tournament_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> playingCategories = new ArrayList<>();


    public Tournament() {
    }

    public Tournament(String name, String location, List<Registration> registrations) {
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

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }

    public void addRegistration(Registration reg) {
        registrations.add(reg);
    }

    public List<Category> getPlayingCategories() {
        return playingCategories;
    }

    public void setPlayingCategories(List<Category> playingCategories) {
        this.playingCategories = playingCategories;
    }
    public void addCategory(Category category) {
        playingCategories.add(category);
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", registrations=" + registrations +
                ", playingCategories=" + playingCategories +
                '}';
    }
}
