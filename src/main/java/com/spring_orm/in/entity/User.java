package com.spring_orm.in.entity;

import jakarta.persistence.*;
import lombok.*;

@Data //@Getter + @Setter + @ToString + @EqualsAndHashCode + @RequiredArgsConstructor
@NoArgsConstructor // Generates a no-arguments constructor
@AllArgsConstructor // Generates an all-arguments constructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private int id;
    @Column(name="user_name", length = 100)
    private String name;
    @Column(name="user_city", length = 50)
    private String city;
    @Column(name="user_age", length = 2)
    private int age;
    @Column(name="user_email", unique = true)
    private String email;
}
