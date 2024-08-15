public class Singer extends Person{
    private String bendName;

    public Singer() {
    }

    public Singer(String name, String designation, String bendName) {
        super(name, designation);
        this.bendName = bendName;
    }

    public String getBendName() {
        return bendName;
    }

    public void setBendName(String bendName) {
        this.bendName = bendName;
    }

    public void singing(){
        System.out.println(getName() + "is singing in " + bendName);
    }
    public void playGuitar(){
        System.out.println(getName() + " is playing guitar");
    }

    @Override
    public String toString() {
        return "Singer ---------------"+ '\n' + super.toString() + '\n' +
                "bendName: " + bendName;
    }
}
