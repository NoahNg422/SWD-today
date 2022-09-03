public class greetclass {
    private final String Default = "People of the world";

    private String name;

    public void Greeter() {
        name = Default;
    }

    public void greeter(String prompt) {
        name = prompt;
    }

    public void set_name(String name_in) {
        name = name_in;
    }   
    
    public String Return_string() {
        return "Greetings " + name + ":";
    }
}
