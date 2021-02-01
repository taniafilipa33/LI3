import java.util.*;

public interface IFilial
{
   Map <Integer,Map<String,Set<Venda>>> getFilial();
   Filial clone();
   void fazFilial(Set<Venda> v) ;
}
