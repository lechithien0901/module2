package task5;

public class House extends Facility{
    private String id;
    private String name;
    private double Area;
    private double price;
    private int maxGuest;
    private String room;
    private int floors;

    public House(String id, String name, double area, double price, int maxGuest) {
        this.id = id;
        this.name = name;
        Area = area;
        this.price = price;
        this.maxGuest = maxGuest;
    }

    public House(String id, String name, double area, double price, int maxGuest, String room, int floors) {
        this.id = id;
        this.name = name;
        Area = area;
        this.price = price;
        this.maxGuest = maxGuest;
        this.room = room;
        this.floors = floors;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setArea(double area) {
        Area = area;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getArea() {
        return Area;
    }

    public double getPrice() {
        return price;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public String getRoom() {
        return room;
    }

    public int getFloors() {
        return floors;
    }

    @Override
    public String toString() {
        return "House{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Area=" + Area +
                ", price=" + price +
                ", maxGuest=" + maxGuest +
                ", room='" + room + '\'' +
                ", floors=" + floors +
                '}';
    }
}
