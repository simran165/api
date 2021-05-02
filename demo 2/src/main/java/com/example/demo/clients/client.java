package com.example.demo.clients;

import javax.persistence.*;

@Entity
@Table
public class client {
    @Id
    @SequenceGenerator(
            name= "client_sequence",
            sequenceName= "client_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "client_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private String address;
    private Double loan;

    public client() {
    }

    public client(Long id,
                  String name,
                  String email,
                  String address,
                  Double loan) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.loan = loan;
    }

    public client(String name,
                  String email,
                  String address,
                  Double loan) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.loan = loan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLoan() {
        return loan;
    }

    public void setLoan(Double loan) {
        this.loan = loan;
    }

    @Override
    public String toString() {
        return "client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", loan=" + loan +
                '}';
    }
}
