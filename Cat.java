
public class Cat extends Animal implements pet {
    String name;

    public Cat(String name) {
       super(Integer.parseInt(name));
    }
    public void cat(){
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("   ");
    }

    public void eat() {
        System.out.println("    ");
    }

}

