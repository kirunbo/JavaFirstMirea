package ru.mirea.task24.no2;

class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void sit() {
        System.out.println("you're sitting on a victorian chair, it's age is " + age + " years.");
    }
}

class MultifunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sit() {
        System.out.println("you're sitting on a multifunctional chair");
    }
}

class MagicalChair implements Chair {
    public void doMagic() {
        System.out.println("bazinga");
    }

    @Override
    public void sit() {
        System.out.println("you're sitting on a magical chair");
    }
}

interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicalChair createMagicChair();
    MultifunctionalChair createFunctionalChair();
}

public class ChairFactory implements AbstractChairFactory{

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(150);
    }

    @Override
    public MagicalChair createMagicChair() {
        return new MagicalChair();
    }

    @Override
    public MultifunctionalChair createFunctionalChair() {
        return new MultifunctionalChair();
    }
}

class Client {
    private Chair chair;

    public void sit() {
        try {
            if (chair == null) {
                throw new NullPointerException("there is no chair to sit on");
            }
            chair.sit();
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}

class Main {
    public static void main(String[] args) {
        ChairFactory factory = new ChairFactory();
        Client client = new Client();

        Chair victorianChair = factory.createVictorianChair();
        client.setChair(victorianChair);
        client.sit();
        System.out.println();

        Chair magicalChair = factory.createMagicChair();
        client.setChair(magicalChair);
        client.sit();
        ((MagicalChair) magicalChair).doMagic();
        System.out.println();

        Chair multifunctionalChair = factory.createFunctionalChair();
        client.setChair(multifunctionalChair);
        client.sit();
        int sum = ((MultifunctionalChair) multifunctionalChair).sum(5, 10);
        System.out.println("sum = " + sum);

    }
}
