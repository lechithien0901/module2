package task3;

public  class  Employee {
    private static int id;
    private  String name;
    private String position;
    public Employee(){}

    public Employee(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }
    public  Employee(String name,String position){
        this.position=position;
        this.name=name;
    }

    public  static void setId(int id) {
        Employee.id = id;
    }

    public  void setName(String name) {
        this.name = name;
    }

    public  void setPosition(String position) {
        this.position = position;
    }

    public  int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
