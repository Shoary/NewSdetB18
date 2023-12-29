package org.Class19;

public class E2Poly {

    public static void main(String[] args) {
        Dog d1=new Dog("Jacky","Black",10,25);
        Dog d2=new Dog("Macky","Black",10,25);
        Cat c1=new Cat("Macky","Black",10,25);
        Animal a1=new Animal("Macky","white",10,25);

        Animal[] arr={d1,d2,c1,a1};
        Animal animal=arr[2];
        animal.printInfo();

        Cat c=(Cat) arr[2];
    }
}
