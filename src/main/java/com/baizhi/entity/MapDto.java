package com.baizhi.entity;

/**
 * Created by admin on 2018/7/10.
 */
public class MapDto {
    private String name;
    private Integer value;

    public MapDto(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public MapDto() {
    }

    @Override
    public String toString() {
        return "MapDto{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

}
