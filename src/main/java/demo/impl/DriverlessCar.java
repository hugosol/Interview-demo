package demo.impl;

import demo.Car;
import demo.constant.Orientation;

import static demo.constant.Orientation.*;


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
     * init the DriverlessCar
     * @param dimensionX
     * @param dimensionY
     * @param initX initialize with positionX
     * @param initY initialize with positionY
     * @param initOrt initial direction
     * @return
     * @throws Exception
     */
    public DriverlessCar(Integer dimensionX, Integer dimensionY, Integer initX, Integer initY, Orientation initOrt){

        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
        this.positionX = initX;
        this.positionY = initY;
        this.orientation = initOrt;

        System.out.println("A car is initially positioned at X = " + positionX + " and Y = " + positionY + " and facing " + initOrt.getName() + " , and the car park with dimension "+dimensionX+"x"+dimensionY);

    }

    /**
     * give a command to move the car
     * @param command command should be "forward" or "clockwise"(otherwise treat as forward)
     * @throws Exception
     */
    public void move(String command) throws Exception {

        System.out.print("-Given the Car is in position X = " + this.positionX + " and Y = " + this.positionY + " and facing " + this.orientation.getName());
        System.out.print(", when the Car ");
        if("clockwise".equalsIgnoreCase(command)){
            Orientation newDirection = clockwise(this.orientation);
            System.out.print(" turns clockwise, then the Car is still in the same position but is now facing "+ newDirection.getName());
            this.orientation = newDirection;
        }
        else{
            //"forward" or other command treat as forward
            System.out.print(" moves forward, ");
            forward();
            boundaryCheck();
            System.out.print(" then the Car is still facing " + this.orientation.getName() + " but is now in position X = " + this.positionX + " and Y = " + this.positionY);
        }
        System.out.println();



    }

    /**
     * move forward
     */
    private void forward(){
        switch (this.orientation) {
            case E:
                this.positionX++;
                break;
            case S:
                this.positionY--;
                break;
            case W:
                this.positionX--;
                break;
            case N:
                this.positionY++;
                break;
        }
    }

    /**
     * check if the car is run out of the boundary
     * @throws Exception
     */
    private void boundaryCheck() throws Exception {
        if(positionX > dimensionX || positionY > dimensionY || positionX < 1 || positionY < 1){
            System.out.print(" the Car is out of boundary!");
            System.out.println();
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
