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
        if(src == Orientation.E){
            return Orientation.S;
        }else if(src == Orientation.S){
            return Orientation.W;
        }else if(src == Orientation.W){
            return Orientation.N;
        }else if(src == Orientation.N){
            return Orientation.E;
        }else{
            return null;
        }
    }


}
