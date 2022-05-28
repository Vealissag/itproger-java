package com.itproger;

public class Transport {

    private float speed;
    private float weigt;
    private String color;
    private byte[] coordinate;

    public Transport (float _speed, float _weigt, String _color, byte[] _coordinate) {
        System.out.println("Объект создан: ");
        setValues(_speed, _weigt, _color, _coordinate);
        System.out.println(getValues());
    }

    public Transport (int weight, byte[] coordinate){
        this.weigt = weight;
        this.coordinate = coordinate;
        System.out.println(this.getValues());
    }
    public void setValues (float speed, float weigt, String color, byte[] coordinate) {
        this.speed = speed;
        this.weigt = weigt;
        this.color = color;
        this.coordinate = coordinate;
    }

    private static int sum (int number1, int number2){
        int res = number1 + number2;
        return res;
    }

    public String getValues() {
        String info = "Скорость объекта: " + this.speed + ". Вес: " + this.weigt + ". Цвет: " + this.color + ".\n";
        String infoCoordinate = "Координаты:\n";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinate += coordinate[i] + "\n";
        }
    return info + infoCoordinate;
    }

}
