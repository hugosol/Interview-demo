package demo.impl;

import demo.Car;
import demo.constant.Orientation;


/**
 * Created by chenlihao on 2021/1/6.
 */
public class DriverlessCar implements Car {

    private Integer dimensionX;

    private Integer dimensionY;

    private Integer positionX;

    private Integer positionY;

    private Orientation orientation;


    /**
     * 上传文件到文件存储服务
     * @param dimensionX
     * @param dimensionY
     * @param initX
     * @param initY
     * @param initOrt
     * @return
     * @throws Exception
     */
    public DriverlessCar(Integer dimensionX, Integer dimensionY, Integer initX, Integer initY, Orientation initOrt){

        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
        this.positionX = initX;
        this.positionY = initY;
        this.orientation = initOrt;

    }

    /**
     * 上传文件到文件存储服务
     * @param command
     * @throws Exception
     */
    public void move(String command) throws Exception {

        System.out.print("-Given the Car is in position X = " + this.positionX + " and Y = " + this.positionY + " and facing " + this.orientation.getName());
        System.out.print(", when the Car ");
        if("clockwise".equalsIgnoreCase(command)){
            Orientation newDirection = Orientation.clockwise(this.orientation);
            System.out.print(" turns clockwise, then the Car is still in the same position but is now facing "+ newDirection);
            this.orientation = newDirection;
        }
        else{
            //输入forward或其他command时前进
            System.out.print(" moves forward, ");
            boundaryCheck();

        }



    }

    private void boundaryCheck() throws Exception {
        if(positionX > dimensionX || positionY > dimensionY || positionX < 0 || positionY < 0){
            System.out.print(" the Car is out of boundary!");
            throw new Exception("the Car is out of boundary!");
        }
    }


    public int getPositionX() {
        return this.positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }

    public String getOrientation() {
        return this.orientation.getName();
    }
}
