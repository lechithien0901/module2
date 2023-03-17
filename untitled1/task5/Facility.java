package task5;

public class Facility {
    private String name;
    private String phone;
    private int getUsageCount=0;

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", getUsageCount=" + getUsageCount +
                '}';
    }

    public int getGetUsageCount() {
        return getUsageCount;
    }

    public void setGetUsageCount(int getUsageCount) {
        this.getUsageCount = getUsageCount;
    }

    public Facility(){}
    public Facility(String name,String phone){
        this.name=name;
        this.phone=phone;



    }




    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }




}
