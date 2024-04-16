import java.util.ArrayList;
public class OnlinePurchaseManager
{
  /** An ArrayList of purchased Gizmo objects,
  * instantiated in the constructor.
  */
  private ArrayList<Gizmo> purchases;
  
  /** Returns the number of purchased Gizmo objects that are electronic
  * whose manufacturer is maker, as described in part (a).
  */
  public int countElectronicsByMaker(String maker)
  {
 
Int p=0;
for(int I=0;I<purchases.size();I++)
{
if((purchases.get(I).getMaker().equals(maker))&& (purchases.get(I).isElectronic()==true))
{
p++;
}
}
return p;


  }
  
  /** Returns true if any pair of adjacent purchased Gizmo objects are
  * equivalent, and false otherwise, as described in part (b).
  */
  public boolean hasAdjacentEqualPair()
  {
For(int I=0;I<purchases.size()-1;I++)
{
if(purchases.get(I).equals(purchases.get(I+1))){return true;}
}
Return false;

  }
  public OnlinePurchaseManager()
  {
    purchases = new ArrayList <Gizmo>();
  }
  public void add(Gizmo g)
  {
    purchases.add(g);
  }
}
