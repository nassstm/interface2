public class Trumpet implements Instrument
{
    int Diametr;

    @Override
    public void play()
    {
        System.out.println("Играет труба диаметром "+Diametr+" см");
    }
}
