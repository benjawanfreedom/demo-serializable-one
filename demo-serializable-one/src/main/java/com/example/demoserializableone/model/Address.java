package com.example.demoserializableone.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    public String number;
    public String house;
    public String road;
//    public String subDistrict;
//    public String district;
//    public String province;
//    public String postalCode;
}





