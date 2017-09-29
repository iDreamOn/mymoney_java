package com.idreamon.mymoney.web.Spending;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class SpendingModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String category;
    private String name;
    private boolean complete;

    public SpendingModel() {}

    public SpendingModel(String category, String name) {
        this.category = category;
        this.name = name;
        this.complete = false;
    }

    @Override
    public String toString() {
        return String.format(
                "SpendingModel[id=%d, category='%s', name='%s', complete='%b']",
                id, category, name, complete);
    }
}