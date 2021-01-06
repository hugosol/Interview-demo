package demo.constant;

/**
 * Created by chenlihao on 2021/1/6.
 */
public enum Orientation
{
    E("East"),
    W("West"),
    S("South"),
    N("North");

    private String name;

    private Orientation(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    /**
     * return the clockwise direction
     * @param src original orientation
     * @return  clockwise direction
     * @throws Exception
     */
    public static Orientation clockwise(Orientation src){
        switch (src) {
            case E:
                return Orientation.S;
            case S:
                return Orientation.W;
            case W:
                return Orientation.N;
            case N:
                return Orientation.E;
        }
        return null;
    }


}
