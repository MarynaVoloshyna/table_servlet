package com.example.table_servlet;

public class Users {
    private String name;
    private String lastName;
    private Integer age;
    private String city;
    private String street;
    private Integer postcode;
    private String university;
    private String occupation;
    private String laptop;
    private String network;
    private Integer salary;

    public Users(String name, String lastName, Integer age, String city, String street, Integer postcode, String university, String occupation, String laptop, String network, Integer salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
        this.street = street;
        this.postcode = postcode;
        this.university = university;
        this.occupation = occupation;
        this.laptop = laptop;
        this.network = network;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getLaptop() {
        return laptop;
    }

    public void setLaptop(String laptop) {
        this.laptop = laptop;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", postcode=" + postcode +
                ", university='" + university + '\'' +
                ", occupation='" + occupation + '\'' +
                ", laptop='" + laptop + '\'' +
                ", network='" + network + '\'' +
                ", salary=" + salary +
                '}';
    }
}
