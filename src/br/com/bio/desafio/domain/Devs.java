package br.com.bio.desafio.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Devs {
    private String name;
    private Set<Content> contentsRegistered = new LinkedHashSet<>();
    private Set<Content> concludedContents = new LinkedHashSet<>();


    public void registerBootCamp(Bootcamp bootcamp){
        this.contentsRegistered.addAll(bootcamp.getContents());
    }
    public void progressBootcamp(){
        Optional<Content> optContent = this.contentsRegistered.stream().findFirst();
        if(optContent.isPresent()){
            this.concludedContents.add(optContent.get());
            this.contentsRegistered.remove(optContent.get());
        } else {
            System.err.println("Erro ao tentar progredir no bootcamp. Você não está matriculado em nenhum conteúdo.");
        }
    }
    public double calculatedTotalXP(){
        return concludedContents.stream().mapToDouble(Content::calculateXP).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentsRegistered() {
        return contentsRegistered;
    }

    public void setContentsRegistered(Set<Content> contentsRegistered) {
        this.contentsRegistered = contentsRegistered;
    }

    public Set<Content> getConcludedContents() {
        return concludedContents;
    }

    public void setConcludedContents(Set<Content> concludedContents) {
        this.concludedContents = concludedContents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Devs devs = (Devs) o;
        return Objects.equals(name, devs.name) && Objects.equals(contentsRegistered, devs.contentsRegistered) && Objects.equals(concludedContents, devs.concludedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentsRegistered, concludedContents);
    }
}
