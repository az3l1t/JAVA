// Интерфейс стула
interface Chair {
    void sit();
}

// Конкретная реализация VictorianChair
class VictorianChair implements Chair {
    private int age;

    VictorianChair(int age) {
        this.age = age;
    }

    @Override
    public void sit() {
        System.out.println("Sitting on a Victorian chair");
    }

    public int getAge() {
        return age;
    }
}

// Конкретная реализация MagicChair
class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Performing magic on the chair");
    }

    @Override
    public void sit() {
        System.out.println("Sitting on a magic chair");
    }
}

// Конкретная реализация FunctionalChair
class FunctionalChair implements Chair {
    int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sit() {
        System.out.println("Sitting on a functional chair");
    }
}

// Интерфейс абстрактной фабрики стульев
interface AbstractChairFactory {
    VictorianChair createVictorianChair();
    MagicChair createMagicanChair();
    FunctionalChair createFunctionalChair();
}

// Конкретная реализация фабрики стульев
class ChairFactory implements AbstractChairFactory {
    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(getAge());
    }

    @Override
    public MagicChair createMagicanChair() {
        return new MagicChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }

    private int getAge() {
        // Логика получения возраста для VictorianChair
        return 5;
    }
}

// Класс клиента
class Client {
    private Chair chair;

    void sit() {
        chair.sit();
    }

    void setChair(Chair chair) {
        this.chair = chair;
    }

    Chair getChair() {
        return chair;
    }
}

// Пример использования
public class Main1 {
    public static void main(String[] args) {
        // Создаем экземпляр фабрики
        AbstractChairFactory factory = new ChairFactory();

        // Создаем различные типы стульев с помощью фабрики
        VictorianChair victorianChair = factory.createVictorianChair();
        MagicChair magicChair = factory.createMagicanChair();
        FunctionalChair functionalChair = factory.createFunctionalChair();

        // Создаем клиента
        Client client = new Client();

        // Устанавливаем стулья клиенту
        client.setChair(victorianChair);
        client.sit();

        client.setChair(magicChair);
        client.sit();

        client.setChair(functionalChair);
        client.sit();
    }
}
