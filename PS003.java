public class PS003 {
    private String name;
    private int wickets;
    private int matches;
    private int ballsBowled;
    private int runsConceded;

    public PS003() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    public PS003(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    public void computeBowlingAverage() {
        if (wickets <= 0 || runsConceded < 0) {
            System.out.println("Error");
            return;
        }

        double bowlingAverage = (double) runsConceded / wickets;
        System.out.println("Name: " + name);
        System.out.println("bowling_avg=" + bowlingAverage);
    }

    public void showStatistics() {
        if (wickets < 0 || matches < 0 || ballsBowled < 0 || runsConceded < 0 || 
            (matches == 0 && (runsConceded > 0 || ballsBowled > 0))) {
            System.out.println("Error");
            return;
        }

        System.out.println("Name=" + name);
        System.out.println("wickets=" + wickets);
        System.out.println("matches=" + matches);
        System.out.println("balls_bowled=" + ballsBowled);
        System.out.println("runs_conceded=" + runsConceded);
    }

    public void computeStrikeRate() {
        if (ballsBowled <= 0 || runsConceded < 0) {
            System.out.println("Error");
            return;
        }

        double strikeRate = (double) runsConceded / ballsBowled;
        System.out.println("Strike_Rate=" + strikeRate);
    }

    public static void main(String[] args) {
        PS003 sachin = new PS003("Sachin", 10, 5, 750, 463);

        sachin.showStatistics();
        sachin.computeBowlingAverage();
        sachin.computeStrikeRate();
    }
}
