import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        List<String> dogLines = FileReader.fileReadHandler("res/dog.txt");
        for (String line : dogLines) {
            String[] linaAsArray = line.split(",");
            dogs.add(new Dog(linaAsArray[0],
                    Integer.parseInt(linaAsArray[1]),
                    linaAsArray[2]));
        }
        for (var actual : dogs) {
            System.out.println(actual);
        }

        List<Chicken> chickens = new ArrayList<>();
        List<String> chickenLines = FileReader.fileReadHandler("res/chicken.txt");
        for (String line : chickenLines) {
            String[] linaAsArray = line.split(",");
            chickens.add(new Chicken(Integer.parseInt(linaAsArray[0]),
                    Double.parseDouble(linaAsArray[1])));
        }
        for (var actual : chickens) {
            System.out.println(actual);
        }
    }
}
