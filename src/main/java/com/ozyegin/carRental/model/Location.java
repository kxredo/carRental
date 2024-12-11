package com.ozyegin.carRental.model;
import jakarta.persistence.*;

@Entity
@Table
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String name;
    private String address;

//    @OneToOne(mappedBy = "pickUpLocation")
//    private Reservation pickUpReservation;
//
//    @OneToOne(mappedBy = "dropOffLocation")
//    private Reservation dropOffReservation;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
