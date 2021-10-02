package FactoryMethod;

public class MovelFactory {
    public Movel MoveFactory(MovelEnum movelEnum) {
        switch (movelEnum) {
            case Cadeira:
                return new Cadeira();
            case GuardaRoupa:
                return new GuardaRoupa();
            default:
                return new Mesa();
        }
    }
}
