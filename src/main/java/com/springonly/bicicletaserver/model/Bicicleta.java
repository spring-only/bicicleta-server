package com.springonly.bicicletaserver.model;

public class Bicicleta {
    private String id;
    private String model;

    public Bicicleta(String id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String toString() {
        return "BicicletaResponse{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
