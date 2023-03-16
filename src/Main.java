public class Main {
    public static void main(String[] args) {



        BuilderPizzas miBuilder = new BuilderPizzas();//Creo builder
        Pizzas pizzaDefault = new Pizzas();
        pizzaDefault = miBuilder.build();
        System.out.println(pizzaDefault);


        Pizzas miPizza = new BuilderPizzas().setChampinhones(true).setPinha(true).build();
        System.out.println(miPizza);

        Pizzas miPizza2 = new BuilderPizzas()
                .setJamon(true)
                .setRelleno(true)
                .setTamanho(Pizzas.FAMILIAR)
                .setSalsa(true)
                .build();
        System.out.println(miPizza2);



















    }
}