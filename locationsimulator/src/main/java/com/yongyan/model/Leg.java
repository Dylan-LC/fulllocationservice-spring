package com.yongyan.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Leg { // one part of your polyline
    private Integer id;
    private Point startPosition;
    private Point endPosition;
    private Double length;
    private Double heading;
}
