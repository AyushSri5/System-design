public class DataTypes {
}

class Address {

    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;
    private String country;
}

class Person {
    private String name;
    private Address address;

    private String email;
    private String phoneNumber;
}

class Driver extends Person {
    private int driverId;
}
