
public class Charmander extends Pokemon implements IFuego{

    public Charmander() {
    }

    
     @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander uso placaje");
    }

    @Override
    protected void atacarAraniazo() {
                System.out.println("Charmander uso araniazo");
    }

    @Override
    protected void atacarMordisco() {
                System.out.println("Charmander uso Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander uso punio fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander uso ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander uso lanzallamas");
    }
    
}
