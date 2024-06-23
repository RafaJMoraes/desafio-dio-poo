import br.com.bio.desafio.domain.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Desafio POO Dio!");

        Content curso1 = new Course();
        curso1.setTitle("Java POO");
        curso1.setDescription("Paradgma de Programação Orientada a objetos");

        Content courseJavaIA = new Course();
        courseJavaIA.setTitle("Java IA");
        courseJavaIA.setDescription("Desvendando IA com Spring IA");


        Content mentoringIA = new Mentoring();
        mentoringIA.setTitle("Mentoria Java IA");
        mentoringIA.setDescription("Desafios da Inteligência Arificial com Spring IA");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java");
        bootcamp.setDescription("Bootcamp Java Desciprtion");
        bootcamp.getContents().add(curso1);
        bootcamp.getContents().add(courseJavaIA);
        bootcamp.getContents().add(mentoringIA);


        Devs devRafa = new Devs();
        devRafa.setName("Rafael Moraes");
        devRafa.registerBootCamp(bootcamp);
        System.out.println("Conteúdos inscritos Rafa: " + devRafa.getContentsRegistered());
        devRafa.progressBootcamp();
        System.out.println("---- progress Rafael ----");
        System.out.println("Conteúdos inscritos Rafa: " + devRafa.getContentsRegistered().toString());
        System.out.println("Conteúdos concluídos Rafa: " + devRafa.getConcludedContents().toString());
        System.out.println("******** xp ************");
        System.out.println("XP Rafael; " + devRafa.calculatedTotalXP());


        Devs devCamilaDio = new Devs();
        devCamilaDio.setName("Camila DIO");
        devCamilaDio.registerBootCamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + devCamilaDio.getContentsRegistered().toString());
        devCamilaDio.progressBootcamp();
        devCamilaDio.progressBootcamp();
        devCamilaDio.progressBootcamp();
        System.out.println("---- progress Camila ----");
        System.out.println("Conteúdos inscritos Camila: " + devCamilaDio.getContentsRegistered().toString());
        System.out.println("Conteúdos concluídos Camila: " + devCamilaDio.getConcludedContents().toString());

        System.out.println("******** xp ************");
        System.out.println("XP Camila: "+ devCamilaDio.calculatedTotalXP());

        System.out.println("******** bootcamp ************");
        System.out.println(bootcamp.toString());




    }
}