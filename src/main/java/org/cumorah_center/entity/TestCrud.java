package org.cumorah_center.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Gabriel Aguilera on 03-05-2022
 */

@Data
@Entity
@Table(name = "test_crud")
public class TestCrud extends PanacheEntityBase {

    @Id
    private String uuid;

    private String name;

    TestCrud(String name) {
        this.name = name;
    }

    TestCrud() {
    }


}
