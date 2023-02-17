package demo;

public class ManagerGeneric <T>{
    public  void setName(T o){

    }
    public T remove(int t){
        return null;
    }

    public static void main(String[] args) {
        ManagerGeneric<User> managerGeneric=new ManagerGeneric<>();
        User a=managerGeneric.remove(3);
        managerGeneric.setName( new User());
        User b=managerGeneric.remove(4);


    }
}

