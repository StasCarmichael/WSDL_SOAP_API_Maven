package com.example.conversion;

import javax.jws.WebService;

@WebService(endpointInterface = "com.example.conversion.ConversionPortType")
public class ConversionServiceImpl implements ConversionPortType {

    @Override
    public ConvertResponse convert(ConvertRequest request) {
        double sqKm = request.getSquareKilometers();
        double sqMeters = sqKm * 1_000_000; // 1 sq km = 1,000,000 sq m
        double sqFeet = sqKm * 10_763_910.4; // 1 sq km = 10,763,910.4 sq ft
        double sqMiles = sqKm * 0.386102; // 1 sq km = 0.386102 sq mi

        ConvertResponse response = new ConvertResponse();
        response.setSquareMeters(sqMeters);
        response.setSquareFeet(sqFeet);
        response.setSquareMiles(sqMiles);

        return response;
    }
}