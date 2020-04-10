package pers.leowy.springboot.sqlite.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@ToString(includeFieldNames = true)
public class UserInfo implements Serializable {

    private static final long serialVersionUID = -268542089775975151L;
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String gender;

    private int age;
}
