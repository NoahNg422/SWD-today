public class lab0822 {
    public static void main(String[] args) {

        greetclass gn;

        if(args.length > 0) {
            gn = new greetclass(args[0]);
        }
        else {
            gn = new greetclass();
        }

        System.out.println(gn);

        String word = args.length > 0 ? args[0] : gn;

        gn.set_name("Fly");
        System.out.printf("Greetings, %s ...\n", word);
        System.out.println(gn);
        System.out.println("Enjoy your day!");
    }
}
