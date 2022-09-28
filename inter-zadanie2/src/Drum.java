public class Drum implements Instrument
{
    int Size;

    @Override
    public void play()
    {
        System.out.println("Играет барабан размером " +Size+ " см");
    }
}
