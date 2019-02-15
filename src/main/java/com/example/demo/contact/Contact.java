package com.example.demo.contact;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "contact")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Contact {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "gender")
  private String gender;

  @Column(name = "phone_number")
  private String phoneNumber;

  @Column(name = "dob")
  private Date dob;

  @Column(name = "email")
  private String email;

  @Column(name = "active")
  private Boolean active;

}
