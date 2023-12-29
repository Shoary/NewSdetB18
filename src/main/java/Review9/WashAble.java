package Review9;

public interface WashAble {

    void wash();
}

interface TrustAble {
    void trust();
}

class Horse implements WashAble, TrustAble {

    @Override
    public void wash() {
        System.out.println("Washing the Horse");
    }

    @Override
    public void trust() {
        System.out.println("Horses can be trusted they are loyal");
    }
}

class Car implements WashAble, TrustAble {

    @Override
    public void wash() {
        System.out.println("Washing the car");
    }

    @Override
    public void trust() {
        System.out.println("You can trust Toyota Cars");
    }
}
