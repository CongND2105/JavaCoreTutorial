package org.example.generic;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    void  eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    String maulong;
    public Dog(String name){
        super(name);

    }
    public Dog(String name ,String maulong){
        super(name);
        this.maulong = maulong;
    }
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }


}
class Cat extends Animal{
    String mausac;
    public Cat(String name){
        super(name);
    }
    public Cat(String name,String mausac){
        super(name);
        this.mausac = mausac;
    }
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}

class Data{
    static ArrayList<Animal> animals = new ArrayList<>();

    static{
        animals.add(new Dog("DogBlack","Black"));
        animals.add(new Dog("DogYellow","Yellow"));
        animals.add(new Dog("DogRed","Red"));
        animals.add(new Cat("CatBlack","Black"));
        animals.add(new Cat("CatRed","Red"));
        animals.add(new Cat("CatYellow","Yellow"));

    }
}
class Data2{
    static Map<Integer, Animal> map = new HashMap<Integer, Animal>();
    static{
        map.put(1,new Dog("DogBlack","Black"));
    }
}
class Main{
    public static void main(String[] args) {
        Main m = new Main();
        m.findAnimalByName(Data.animals,"CatRed");
        m.displayAnimals(Data.animals, Cat.class);
        ArrayList <Cat> onlyCat = m.getAnimalByType(Data.animals,Cat.class);
        Cat reslut = m.findAnimalByName(onlyCat,"CatRed");
        System.out.println("ket qua : "+reslut);
        m.displayAllAnimals(Data.animals);
    }
    //method tìm Animal theo tên
    public <T extends Animal> T findAnimalByName(ArrayList<T> list , String name){
        for(T animal : list){
            if(animal.name.equals(name)){
                System.out.println("co ten : " +animal.name);
                return animal;
            }
        }
        System.out.println("Khong co cai ten nào");
        return null;
    }

    //method in ra Animal theo dạng chó hoặc mèo
    public <T extends Animal> ArrayList<T> getAnimalByType(ArrayList<Animal> animals, Class<T> clazz){
        ArrayList<T> temp = new ArrayList<>();
        for(int i = 0 ; i < animals.size(); i++){
            if(clazz.isInstance(animals.get(i))){
                temp.add(clazz.cast(animals.get(i)));
            }
        }
        return temp;
    }
    public void displayAnimals(ArrayList<Animal> allAnimals, Class<? extends Animal> clazz){
        ArrayList<? extends Animal> filterList = getAnimalByType(allAnimals, clazz);
        System.out.println("--- Danh sách " + clazz.getSimpleName() + " ---");
        for (Animal a : filterList) {
            System.out.println(a.name);
        }

    }
    public void displayAllAnimals(ArrayList<Animal> allAnimals){
        System.out.println("Danh Sach tat ca cac Animal");
        for (Animal a : allAnimals) {
            System.out.println(a.name);
        }
    }
}
