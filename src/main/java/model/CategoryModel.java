package model;

public class CategoryModel extends AbstractModel {

    private String name;
    private String code;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
