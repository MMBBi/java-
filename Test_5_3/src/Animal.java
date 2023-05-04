public class Animal {
    public String name;
    public String sex;
    public int age;


    public void eat() {
        System.out.println(name+"正在吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
