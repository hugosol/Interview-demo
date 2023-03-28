package demo;

import demo.constant.Orientation;
import demo.impl.DriverlessCar;

/**
 * Created by chenlihao on 2021/1/7.
 */
public class Run {

    public static void main(String[] args){
        DriverlessCar carImpl = new DriverlessCar(4,4,1,1, Orientation.N);
        try {
            System.out.println("test");
            carImpl.move("forward");
            carImpl.move("clockwise");
            carImpl.move("forward");
            carImpl.move("clockwise");
            carImpl.move("forward");
            carImpl.move("forward");

            carImpl.move("clockwise");
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
