package Entities;

public class Team {
    private int TID, teamColor;
    private String teamName;
    private User team_leader;

    public Team(int teamColor, String teamName, User team_leader) {
        this.teamColor = teamColor;
        this.teamName = teamName;
        this.team_leader = team_leader;
    }

    public int getTID() {
        return TID;
    }

    public void setTID(int TID) {
        this.TID = TID;
    }

    public int getTeamColor() {
        return teamColor;
    }

    public void setTeamColor(int teamColor) {
        this.teamColor = teamColor;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public User getTeam_leader() {
        return team_leader;
    }

    public void setTeam_leader(User team_leader) {
        this.team_leader = team_leader;
    }
}