import java.util.*;


public interface IFaturacao
{
    Map <Integer,Set<Venda>> getFat();
    Faturacao clone();
    void addFaturacao(Set<Venda> v);
}
