package Test;

public class test {

     private  String name;
     private  int age;
     private  String Email;

    public test() {

    }

    public test(String name, int age, String email) {
        this.name = name;
        this.age = age;
        Email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "test{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Email='" + Email + '\'' +
                '}';
    }
}

