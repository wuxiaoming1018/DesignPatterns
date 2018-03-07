package singleton.myenum;

/**
 * @author wuxiaoming
 * @date 2018-03-07 15:14
 */
public enum MyEnum {
    RED(1,"红色");

    private int index;
    private String name;

    MyEnum(int index,String name){
       this.index = index;
       this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }
}
