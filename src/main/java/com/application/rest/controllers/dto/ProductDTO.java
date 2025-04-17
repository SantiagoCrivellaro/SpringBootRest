package com.application.rest.controllers.dto;

import com.application.rest.entites.Maker;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {


    private Long id;
    private String name;
    private BigDecimal price;
    private Maker maker;
}
