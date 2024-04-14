import java.util.ArrayList;

public class Opreation {

    ArrayList<User> list ;

    // constructer
    public Opreation() {
        list = new ArrayList<>();
    }

    //add function
    public void addData(User data){
        list.add(data);
    }

    //display
    public void displayAll(){
        for(User i : list){
            System.out.println(i.toString());
        }
    }
    public void removeData(String id){
        for(User i : list){
            if(i.getId().equalsIgnoreCase(id)){
                System.out.println("delete "+i);
                list.remove(i);
                return;
            }
        }
    }

    public User sreachData(String id){
        for(User i : list){
            if(i.getId().equalsIgnoreCase(id)){
                return i;
            }
        }
        return null;
    }
}
