package ArrayHomeWorks;

public class CapitalCity {
    public static void main(String[] args) {
        String[] country= {"USA","France","England","Italy","Spain","Brazil"};

        for (int i = 0; i < country.length; i++) {
            switch (country[i]) {
                case "USA":
                    System.out.print("The capital of " + country[0] + " is Washington DC");
                    break;
                case "France":
                    System.out.print("The capital of " + country[1] + " is Paris");
                    break;
                case "England":
                    System.out.print("The capital of " + country[2] + " is London");
                    break;
                case "Italy":
                    System.out.print("The capital of " + country[3] + " is Romer");
                    break;
                case "Spain":
                    System.out.print("The capital of " + country[4] + " is Madrid");
                    break;
                case "Brazil":
                    System.out.print("The capital of " + country[5] + " is Rio De Janeiro");

            }
            System.out.println();
        }
    }
}
