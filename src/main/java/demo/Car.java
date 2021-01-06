package demo;

/**
 * Created by chenlihao on 2021/1/6.
 */
public interface Car {

    void move(String command) throws Exception;
    int getPositionX();
    int getPositionY();
    String getOrientation();

}
