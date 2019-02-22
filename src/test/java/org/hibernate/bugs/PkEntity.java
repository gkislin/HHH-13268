package org.hibernate.bugs;

import javax.persistence.*;

@Entity
@Table(name = "pk_entity")
public class PkEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "value")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}