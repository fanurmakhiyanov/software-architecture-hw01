package ru.geekbrains.lesson1.store3D.models;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int ID;
    public List<PoligonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> cameras = new ArrayList<Camera>();
    public Scene (int ID, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception{
        this.ID = ID;
        if (!models.isEmpty()) {
            this.Models = models;
        } else {
            throw new Exception("Должна быть хотя бы одна модель");
        }
        this.Flashes = flashes;
        if (!cameras.isEmpty()) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть хотя бы одна камера");
        }
    }
    public <T, E> T method1(T Model, T Flash) {
        return Model;
    }
    public <T, E> T method2(T Model, E Flash) {
        return Model;
    }
}
