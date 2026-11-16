package com.mycompany.modul09;

public class Pegawai implements Comparable<Pegawai> {

    private final String name;
    private final int salary;

    public Pegawai(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "name=" + name + ", salary=" + salary;
    }

    // Urutan natural: berdasarkan nama (abjad)
    @Override
    public int compareTo(Pegawai lain) {
        return this.name.compareTo(lain.name);
    }
}