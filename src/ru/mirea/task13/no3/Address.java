package ru.mirea.task13.no3;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String country, String region, String city, String street, String house, String building, String apartment) {
        this.country = country.trim();
        this.region = region.trim();
        this.city = city.trim();
        this.street = street.trim();
        this.house = house.trim();
        this.building = building.trim();
        this.apartment = apartment.trim();
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getBuilding() {
        return building;
    }

    public String getApartment() {
        return apartment;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country=" + country +
                ", region=" + region +
                ", city=" + city +
                ", street=" + street +
                ", house=" + house +
                ", building=" + building +
                ", apartment=" + apartment +
                '}';
    }

    public static Address parseWithSplit(String address) {
            String[] parts = address.split(",");
            if (parts.length == 7) {
                Address new_address = new Address(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]);
                return new_address;
            }
            return new Address("-", "-", "-", "-", "-", "-", "-");
    }

    public static Address parseWithStringTokenizer(String address) {
        StringTokenizer token= new StringTokenizer(address, ",.;");
        List<String> arrayList = new ArrayList<>();
        while (token.hasMoreTokens()) {
            arrayList.add(token.nextToken());
        }
        Address new_address = new Address(arrayList.get(0), arrayList.get(1), arrayList.get(2),
                arrayList.get(3), arrayList.get(4), arrayList.get(5), arrayList.get(6));
        return new_address;
    }
}

class main {
    public static void main(String[] args) {
        String address1 = "Россия, Ростовская область, Шахты, Чехова, 13, 5, 220";
        String address2 = "США, Калифорния, Лос-Анджелес, Холливуд, 100, 2";
        String address3 = "Франс, Иль-де-Франс, Париж, Шанз-Элизе, 45.1., 2";
        String address4 = "Германия, Максимилианштрассе; Берлин; Бранденбург, 9, 1, 12";

        Address addr1 = Address.parseWithSplit(address1);
        Address addr2 = Address.parseWithSplit(address2);
        Address addr3 = Address.parseWithStringTokenizer(address3);
        Address addr4 = Address.parseWithStringTokenizer(address4);

        System.out.println(addr1);
        System.out.println(addr2);
        System.out.println(addr3);
        System.out.println(addr4);
    }
}