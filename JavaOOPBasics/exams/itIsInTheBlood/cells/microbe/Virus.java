package exam.cells.microbe;

public class Virus extends Microbe {

    public Virus(String id, int health, int positionRow, int positionCol, int virulence) {
        super(id, health, positionRow, positionCol, virulence);
    }

    @Override
    public int calculateEnergy() {
        return (super.getHealth() + super.getVirulence());
    }

    @Override
    public String toString() {
        return String.format("%s--------Health %d | Size %d | Energy %d%n", super.toString(),
                super.getHealth(),super.getVirulence(),this.calculateEnergy());
    }
}
