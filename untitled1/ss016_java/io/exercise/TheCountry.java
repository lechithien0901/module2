package ss016_java.io.exercise;

public class TheCountry {
    private int id;
    private String code;
    private String name;
    public TheCountry(int id,String code,String name){
        this.id=id;
        this.code=code;
        this.name=name;
    }
    public int getId(){
        return this.id;
    }
    public String getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }
    @Override
    public  String toString(){
        return "Country{"+
                "id="+getId()+"\\"+
                "code"+getCode()+"\\"+
                "name"+getName();

    }
}
