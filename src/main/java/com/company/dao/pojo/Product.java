package com.company.dao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Integer pid;

    private String pname;

    private BigDecimal price;

    private Date pdate;


}