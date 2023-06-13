package com.example.DatabaseLearning;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Amresh Tripathy
 */

@Table
@Entity
public class Client {
    @Id
    private int id;

    private String name;

    private int funding;

    private String emailId;

    private int contactNo;

    private String address;
}
