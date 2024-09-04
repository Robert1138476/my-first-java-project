public class App {
    public static void main(String[] args) throws Exception {
        duck[] duckarray = new duck[]{
            new duck("tom", 28),
            new duck("beanguy", 777),
            new duck("speedy hotdog comsumer", 99999),
            new duck("the goldfish i just ate", 0),
            new duck("ultramax giganerd 3k", 53),
        };

        duck pizzaGOD = duckarray[0];

        for (int i = 0; i < duckarray.length; i++) {
            if (duckarray[i].pizzas > pizzaGOD.pizzas) {
                pizzaGOD = duckarray[i];
            }
        }

        System.out.println(pizzaGOD.Name);
    }
}
