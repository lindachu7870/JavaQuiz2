package com.zipcodewilmington.assessment2.part3;

public class RedRobin extends Bird {

    // field
    private String migrationMonth;

    // getter
    public String getMigrationMonth() {
        return migrationMonth;
    }

    // setter
    public void setMigrationMonth() {
        this.migrationMonth = migrationMonth;
    }

    @Override
    public int getSpeed() {
        return 10;
    }

    @Override
    public String color() {
        return "red";
    }
}
