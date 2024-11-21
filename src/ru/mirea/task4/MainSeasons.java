package ru.mirea.task4;

enum Seasons {
    WINTER(-10),
    SPRING(13),
    SUMMER(20){
        @Override
        public String getDescription(){
            return "Теплое время года";
        }
    },
    FALL(10);

    private final int avg_temp;

    Seasons(int avgTemp) {
        this.avg_temp = avgTemp;
    }

    public String getDescription(){
        return "Холодное время года";
    }

    public int getAvg_temp(){
        return avg_temp;
    }

    public void print(){
        switch(this){
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case FALL:
                System.out.println("Я люблю осень");
                break;
        }
    }
}


public class MainSeasons {
    public static void main(String[] args) {
        Seasons season = Seasons.SPRING;
        System.out.println("spring description: " + season.getDescription());
        System.out.println("average temperature in spring: " + season.getAvg_temp());
        season.print();
        System.out.println();

        for(Seasons s : Seasons.values()){
            System.out.println("current season: " + s);
            System.out.printf("average temperature in %s: %d\n", s, s.getAvg_temp());
            System.out.printf("%s description: %s\n", s, s.getDescription());
        }
    }
}


