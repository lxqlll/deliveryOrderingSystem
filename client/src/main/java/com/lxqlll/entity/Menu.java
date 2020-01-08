package com.lxqlll.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 *
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private int id;
    private String name;
    private double price;
    private String flavor;
    private Type type;
}
