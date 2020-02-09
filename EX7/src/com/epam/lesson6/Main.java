package com.epam.lesson6;

public class Main {

    public static void main(String[] args) {
        Monitor monitor = new Monitor("HD39H6", "HP", 8500.0, 1024, 848);
        Device[] devices = {new Device("DHB23HD", "LG", 1100.0),
                new Monitor("HD39H6", "HP", 8500.0, 1024, 848),
                new Device("DHB23HD", "LG", 1100.0),
                new Adapter("V4S6DD", "jp", 4556.0, 5639045, "54684_e")
        };
        for (Device obj : devices) {
            System.out.println(obj.toString());
        }

        System.out.println("Equals -> " + devices[0].equals(devices[2]));
        System.out.println("Equals monitors -> " +
                devices[1].equals(monitor));
    }
}
