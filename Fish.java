public class Fish extends Animal implements pet{
    String name;

    public  Fish( String name) {
      super(Integer.parseInt(name));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(" Fish is Playing");
    }

    public void eat() {
        System.out.println("Fish is eating");
    }

}
