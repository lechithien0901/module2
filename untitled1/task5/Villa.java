package task5;

public class Villa extends Facility {
    private String id;
    private String villaName;
    private double area;
    private double price;
    private int maxGuests;
    private String room;
    private double pool;

    public Villa(String id, String villaName, double area, double price, int maxGuests, String room, double pool) {
        this.id = id;
        this.villaName = villaName;
        this.area = area;
        this.price = price;
        this.maxGuests = maxGuests;
        this.room = room;
        this.pool = pool;
    }

    public Villa(String id, String villaName, double area, double price, int maxGuests) {
        this.id = id;
        this.villaName = villaName;
        this.area = area;
        this.price = price;
        this.maxGuests = maxGuests;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "id='" + id + '\'' +
                ", villaName='" + villaName + '\'' +
                ", area=" + area +
                ", price=" + price +
                ", maxGuests=" + maxGuests +
                ", room='" + room + '\'' +
                ", pool=" + pool +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setVillaName(String villaName) {
        this.villaName = villaName;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setMaxGuests(int maxGuests) {
        this.maxGuests = maxGuests;
    }

    public void setPool(double pool) {
        this.pool = pool;
    }

    public String getId() {
        return id;
    }

    public String getVillaName() {
        return villaName;
    }

    public double getArea() {
        return area;
    }

    public int getMaxGuests() {
        return maxGuests;
    }


    public String getRoom() {
        return room;
    }

    public double getPool() {
        return pool;
    }
}
