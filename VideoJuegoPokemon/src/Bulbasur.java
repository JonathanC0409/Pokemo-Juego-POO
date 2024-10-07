
public class Bulbasur extends Pokemon implements IPlanta {

    public Bulbasur() {
    }

    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur uso placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasaur uso araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur uso Mordisco");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Bulbasaur uso paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasaur uso drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Bulbasaur uso hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Bulbasaur uso latigo cepa");
    }

}
