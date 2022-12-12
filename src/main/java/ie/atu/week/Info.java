package ie.atu.week;

public class Info {
    public Info(String name, String gender, String age, String shift) {
        this.name = name;
        Gender = gender;
        Age = age;
        Shift = shift;
    }

    public String name;
    public String Gender;
    public String Age;
    public String Shift;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) { Shift = shift;}

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

}
