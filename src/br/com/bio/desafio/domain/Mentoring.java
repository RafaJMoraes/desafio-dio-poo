

package br.com.bio.desafio.domain;


import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate workload;


    @Override
    public double calculateXP() {
        return XP_DEFAULT + 10;
    }

    public LocalDate getWorkload() {
        return workload;
    }

    public void setWorkload(LocalDate workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "title='" + super.getTitle() + '\'' +
                ", description='" + super.getDescription() + '\'' +
                ", workload=" + getWorkload() +
                '}';
    }
}
