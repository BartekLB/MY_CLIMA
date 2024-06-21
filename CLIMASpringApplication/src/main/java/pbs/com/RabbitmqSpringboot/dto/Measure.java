package pbs.com.RabbitmqSpringboot.dto;

import lombok.Data;

@Data
public class Measure
{
    private int id;
    private int temperature;
    private int humidity;
    private int dust_concentration;
    private String measure_time;
}
