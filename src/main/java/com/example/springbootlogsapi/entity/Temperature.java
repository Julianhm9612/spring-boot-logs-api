package com.example.springbootlogsapi.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.vividsolutions.jts.geom.Point;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "temperature", schema = "public")
public class Temperature {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "temperature_seq")
    @SequenceGenerator(name = "temperature_seq", sequenceName = "temperature_seq", allocationSize = 1)
    @Column(name = "id", updatable = false, nullable = false)
    private BigInteger id;

    @Column(name = "identification", nullable = false, length = 18)
    private String identification;

    @Column(name = "temp", nullable = false)
    private Float temp;

    @Column(name = "country", nullable = false)
    private String country;

    // @JsonSerialize(using = GeometrySerializer.class)
    // @JsonDeserialize(contentUsing = GeometryDeserializer.class)
    @Column(name = "coordinates", columnDefinition = "geometry(Point,4326)", nullable = false)
    private Point coordinates;

}
