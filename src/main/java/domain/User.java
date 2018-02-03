package domain;

/**
 * User.
 *
 * @author: huang
 * Date: 18-2-3
 */
public class User {

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void returnVoid() {
        System.out.println("返回void");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static String staticFun() {
        System.out.println("调用静态方法");
        return "静态方法";
    }
}
