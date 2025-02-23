public class Teamlead extends Manager
{
    private int teamsize;

    public int getTeamsize() {
        return teamsize;
    }

    public void setTeamsize(int teamsize) {
        this.teamsize = teamsize;
    }

    public void teamMembers()
    {
        if (teamsize>0)
        {
            System.out.println("Team Exists");
        }
        else
        {
            System.out.println("Team does not exist");
        }
    }
    
}
