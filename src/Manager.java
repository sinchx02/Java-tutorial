public class Manager extends Employee 
{
 private int bonus;

public int getBonus() {
    return bonus;
}

public void setBonus(int bonus) {
    bonus = bonus;
} 
 
 public void isBonusGranted()
 {
    if(bonus==0)
   System.out.println("Bonus not granted");
    else
   System.out.println("Bonus granted");
 }
}
