package com.example.conversion;

public class ConversionClient {
    public static void main(String[] args) {
        ConversionService service = new ConversionService();
        ConversionPortType port = service.getConversionPort();

        ConvertRequest request = new ConvertRequest();
        request.setSquareKilometers(1.0);

        ConvertResponse response = port.convert(request);
        System.out.println("Square Meters: " + response.getSquareMeters());
        System.out.println("Square Feet: " + response.getSquareFeet());
        System.out.println("Square Miles: " + response.getSquareMiles());
    }
}
