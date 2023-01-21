package ObjectsAnd2DArrays;

public class Task2 {
    public static void main(String[] args) {
        String[][] cars = {{"american", "german", "korean", "italian"},
                {"Dodge", "Mercedes", "Hyundai", "Ferrari"}
        };
        for (String[] car : cars) {
            for (String country : car) {
                System.out.print(country + ", ");
            }
            System.out.println();
        }
        System.out.println("***************");

            for (int i = 0; i < cars.length; i++) {
                for (int j = 0; j < cars[i].length; j++) {
                    System.out.print(cars[i][j] + ", ");
                }
                System.out.println();
            }
        }
    }