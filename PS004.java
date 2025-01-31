class PS004 {
   
    private double basePay;
    private int hoursWorked;

    public PS004(double basePay, int hoursWorked) {
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    
    public PS004() {
    }

   
    public void computeSalary() {
        
        final double MIN_WAGE = 8.00;
        final int MAX_HOURS = 60;
        final int REGULAR_HOURS = 40;
        
    
        if (basePay < MIN_WAGE) {
            System.out.println("Error: Base pay must be at least $" + MIN_WAGE);
            return;
        }

        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked cannot exceed " + MAX_HOURS + " hours.");
            return;
        }

        double totalPay = 0.0;

     
        if (hoursWorked <= REGULAR_HOURS) {
            totalPay = hoursWorked * basePay;
        } else {
            
            totalPay = REGULAR_HOURS * basePay;
            
            int overtimeHours = hoursWorked - REGULAR_HOURS;
            totalPay += overtimeHours * basePay * 1.5;
        }

        System.out.println("Total pay: $" + totalPay);
    }

    public static void main(String[] args) {
        
        PS004 employee1 = new PS004(7.50, 35);
        PS004 employee2 = new PS004(8.20, 47);
        PS004 employee3 = new PS004(10.00, 3);

        System.out.println("Employee 1:");
        employee1.computeSalary();

        System.out.println("Employee 2:");
        employee2.computeSalary();

        System.out.println("Employee 3:");
        employee3.computeSalary();
    }
}
