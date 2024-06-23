package br.com.bio.desafio.domain;

import java.time.LocalDate;

public class Course extends Content {

    private LocalDate workload;

    @Override
    public double calculateXP() {
        return XP_DEFAULT + 20;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload= " + getWorkload() +
                '}';
    }

    public LocalDate getWorkload() {
        return workload;
    }

    public void setWorkload(LocalDate workload) {
        this.workload = workload;
    }
}
