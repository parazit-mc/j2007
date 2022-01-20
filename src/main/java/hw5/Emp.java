package hw5;

public class Emp {

    private String fio;
    private String post;
    private String email;
    private String phone;
    private int wage;
    private int age;

    public Emp(String fio, String post, String email, String phone, int wage, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.wage = wage;
        this.age = age;
    }

    public void info() {
        if (age>=40) {
            System.out.println("Name " + fio + ", post " + post + ", email " + email + ", phone " + phone + ", wage " + wage + ", age " + age);
        }
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        if (wage < 0) {
            System.out.println("wage cannot be negative");
        } else {
            this.wage = wage;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("age cannot be negative");
        } else {
            this.age = age;
        }
    }


}
