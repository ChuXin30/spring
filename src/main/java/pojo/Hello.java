package pojo;

public class Hello {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return "hello{"+
                "str=" + str +"}";
    }
}

