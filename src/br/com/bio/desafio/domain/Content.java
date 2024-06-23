package br.com.bio.desafio.domain;

import java.time.LocalDate;

public abstract class Content {

    protected static final double XP_DEFAULT = 100;

    private String title;
    private String description;

    public abstract double calculateXP();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Content{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
