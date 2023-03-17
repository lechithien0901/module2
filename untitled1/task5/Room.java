package task5;

public class Room extends Facility {
    private String id;
    private String name;
    private double Area;
    private double Price;
    private int maxGuests;
    private String roomExtraService;

    public Room(String id, String name, double area, double price, int maxGuests, String roomExtraService) {
        this.id = id;
        this.name = name;
        Area = area;
        Price = price;
        this.maxGuests = maxGuests;
        this.roomExtraService = roomExtraService;
    }

    public Room(String id, String name, double area, double price, int maxGuests) {
        this.id = id;
        this.name = name;
        Area = area;
        Price = price;
        this.maxGuests = maxGuests;
    }

    public Room(String id, String name, double area, double price, String roomExtraService) {
        this.id = id;
        this.name = name;
        Area = area;
        Price = price;
        this.roomExtraService = roomExtraService;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public void setMaxGuests(int maxGuests) {
        this.maxGuests = maxGuests;
    }

    public String getRoomExtraService() {
        return roomExtraService;
    }

    public void setRoomExtraService(String roomExtraService) {
        this.roomExtraService = roomExtraService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Area=" + Area +
                ", Price=" + Price +
                ", maxGuests=" + maxGuests +
                ", roomExtraService='" + roomExtraService + '\'' +
                '}';
    }
}
