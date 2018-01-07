package uk.ac.mmu.project;

public class Controller {

    public static void main(String[] args) {
        DoomsdayTester[] testDates = new DoomsdayTester[49];
        testDates[0] = new DoomsdayTester(1,1,2015);
        testDates[1] = new DoomsdayTester(31,1,2015);
        testDates[2] = new DoomsdayTester(1,2,2015);
        testDates[3] = new DoomsdayTester(28,2,2015);
        testDates[4] = new DoomsdayTester(1,3,2015);
        testDates[5] = new DoomsdayTester(31,3,2015);
        testDates[6] = new DoomsdayTester(1,4,2015);
        testDates[7] = new DoomsdayTester(30,4,2015);
        testDates[8] = new DoomsdayTester(1,5,2015);
        testDates[9] = new DoomsdayTester(31,5,2015);
        testDates[10] = new DoomsdayTester(1,6,2015);
        testDates[11] = new DoomsdayTester(30,6,2015);
        testDates[12] = new DoomsdayTester(1,7,2015);
        testDates[13] = new DoomsdayTester(31,7,2015);
        testDates[14] = new DoomsdayTester(1,8,2015);
        testDates[15] = new DoomsdayTester(31,8,2015);
        testDates[16] = new DoomsdayTester(1,9,2015);
        testDates[17] = new DoomsdayTester(30,9,2015);
        testDates[18] = new DoomsdayTester(1,10,2015);
        testDates[19] = new DoomsdayTester(31,10,2015);
        testDates[20] = new DoomsdayTester(1,11,2015);
        testDates[21] = new DoomsdayTester(30,11,2015);
        testDates[22] = new DoomsdayTester(1,12,2015);
        testDates[23] = new DoomsdayTester(31,12,2015);
        testDates[24] = new DoomsdayTester(1,1,2016);
        testDates[25] = new DoomsdayTester(31,1,2016);
        testDates[26] = new DoomsdayTester(1,2,2016);
        testDates[27] = new DoomsdayTester(28,2,2016);
        testDates[28] = new DoomsdayTester(29,2,2016);
        testDates[29] = new DoomsdayTester(1,3,2016);
        testDates[30] = new DoomsdayTester(31,3,2016);
        testDates[31] = new DoomsdayTester(1,4,2016);
        testDates[32] = new DoomsdayTester(30,4,2016);
        testDates[33] = new DoomsdayTester(1,5,2016);
        testDates[34] = new DoomsdayTester(31,5,2016);
        testDates[35] = new DoomsdayTester(1,6,2016);
        testDates[36] = new DoomsdayTester(30,6,2016);
        testDates[37] = new DoomsdayTester(1,7,2016);
        testDates[38] = new DoomsdayTester(31,7,2016);
        testDates[39] = new DoomsdayTester(1,8,2016);
        testDates[40] = new DoomsdayTester(31,8,2016);
        testDates[41] = new DoomsdayTester(1,9,2016);
        testDates[42] = new DoomsdayTester(30,9,2016);
        testDates[43] = new DoomsdayTester(1,10,2016);
        testDates[44] = new DoomsdayTester(31,10,2016);
        testDates[45] = new DoomsdayTester(1,11,2016);
        testDates[46] = new DoomsdayTester(30,11,2016);
        testDates[47] = new DoomsdayTester(1,12,2016);
        testDates[48] = new DoomsdayTester(31,12,2016);

        System.out.println("Testing edge cases:");
        for (DoomsdayTester testDate : testDates) {
            System.out.println(testDate.toString() + " is a " + testDate.getWeekday(testDate.getDayOfWeek()));
        }

        DateGenerator[] randomDates = new DateGenerator[10];
        randomDates[0] = new DateGenerator();
        randomDates[1] = new DateGenerator();
        randomDates[2] = new DateGenerator();
        randomDates[3] = new DateGenerator();
        randomDates[4] = new DateGenerator();
        randomDates[5] = new DateGenerator();
        randomDates[6] = new DateGenerator();
        randomDates[7] = new DateGenerator();
        randomDates[8] = new DateGenerator();
        randomDates[9] = new DateGenerator();

        System.out.println("\n\nGenerating random dates:");
        for (DateGenerator date: randomDates) {
            System.out.println(date.toString() + " is a " + date.getWeekday(date.getDayOfWeek()));
        }
    }
}