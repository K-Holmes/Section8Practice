public class Teams {
    private int wins;
    private int losses;
    private int ties;
    private int totalGoalsScored;
    private int totalGoesAllowed;
    private String name;

    public Teams(String name) {
        this.setName(name);
        this.setWins(0);
        this.setLosses(0);
        this.setTies(0);
        this.setTotalGoalsScored(0);
        this.setTotalGoesAllowed(0);
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public int getTotalGoalsScored() {
        return totalGoalsScored;
    }

    public void setTotalGoalsScored(int totalGoalsScored) {
        this.totalGoalsScored = totalGoalsScored;
    }

    public int getTotalGoesAllowed() {
        return totalGoesAllowed;
    }

    public void setTotalGoesAllowed(int totalGoesAllowed) {
        this.totalGoesAllowed = totalGoesAllowed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
