public class Dancer extends Person{
    private String groupName;

    public Dancer() {
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing(){
        System.out.println(getName() + "is dancing in " + getGroupName());
    }

    @Override
    public String toString() {
        return "Dancer ---------------"+ '\n' + super.toString() + '\n' +
                "groupName: " + groupName;
    }
}
