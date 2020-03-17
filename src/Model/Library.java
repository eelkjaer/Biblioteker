package Model;

import java.util.ArrayList;

public class Library {
    //postnr(0),by(1),kortnavn(2),væsensnavn(3),adresse(4),latitude(5),bibliotekstype(6),id(7),longitude(8),navn(9)
    //2750,Ballerup,Ballerup Bibliotek,Ballerup Bibliotekerne,Banegårdspladsen 1,55.729601,Folkebibliotek,715100,12.359601,Ballerup Bibliotek
    private double id;
    private double postal,latitude,longitude;
    private String city, mapName, callName, address, type, name;


    public Library(double id, double postal, double latitude, double longitude, String city, String mapName, String callName, String address, String type, String name) {
        this.id = id;
        this.postal = postal;
        this.latitude = latitude;
        this.longitude = longitude;
        this.city = city;
        this.mapName = mapName;
        this.callName = callName;
        this.address = address;
        this.type = type;
        this.name = name;
    }

    public double getId() {
        return id;
    }

    public double getPostal() {
        return postal;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getCity() {
        return city;
    }

    public String getMapName() {
        return mapName;
    }

    public String getCallName() {
        return callName;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\n"+name+"{" +
                "\nid=" + id +
                "\npostal=" + postal +
                "\nlatitude=" + latitude +
                "\nlongitude=" + longitude +
                "\ncity='" + city + '\'' +
                "\nmapName='" + mapName + '\'' +
                "\ncallName='" + callName + '\'' +
                "\naddress='" + address + '\'' +
                "\ntype='" + type + '\'' +
                "\n}\n\n";
    }
}
