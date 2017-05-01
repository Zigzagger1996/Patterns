/**
 * Created by Zigzagger on 01.05.2017.
 */
public class AddSingleton {

    public static AddSingleton instance;

    public static AddSingleton getInstance(){
        if(instance == null){
            instance = new AddSingleton();
        }
        return instance;
    }

    private AddSingleton(){
    }

}
