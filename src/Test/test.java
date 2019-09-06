package Test;

public class test {


    String ename;
    int eid;
    Address address;

    public test() {
    }

    //constructor Injection
    public test(Address address) {
        this.address = address;

    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public Address getAddress() {
        return address;
    }

    //Setter Injection
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "test{" +
                "ename='" + ename + '\'' +
                ", eid=" + eid +
                ", address=" + address +
                '}';
    }
}

