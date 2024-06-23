package br.com.bio.desafio.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private static final LocalDate initialDate = LocalDate.now();
//    private static final LocalDate endDate = initialDate.plusDays(45);
    private static final LocalDate endDate = LocalDate.now().plusDays(45);
    private Set<Devs> registeredDevs = new HashSet<>();
    private Set<Content> contents = new HashSet<>();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Devs> getRegisteredDevs() {
        return registeredDevs;
    }

    public void setRegisteredDevs(Set<Devs> registeredDevs) {
        this.registeredDevs = registeredDevs;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(registeredDevs, bootcamp.registeredDevs) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, registeredDevs, contents);
    }
}
