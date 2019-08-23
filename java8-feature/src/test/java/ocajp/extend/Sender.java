package ocajp.extend;

public interface Sender extends FindFather,FindFatherFather{
    public void Send();

    @Override
    void Good();
}
