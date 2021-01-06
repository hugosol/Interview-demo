package demo;

import demo.constant.Orientation;
import demo.impl.DriverlessCar;

/**
 * Created by chenlihao on 2021/1/7.
 */
public class Run {

    public static void main(String[] args){
        DriverlessCar carImpl = new DriverlessCar(4,4,0,0, Orientation.N);
        try {
            carImpl.move("test");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
