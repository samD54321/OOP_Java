package costumeHire;

import java.time.LocalDate;
import java.time.ZoneId;

public class CostumeHire extends Hire {

    private Costume costume;

    public CostumeHire(Costume costume, int numberDays, Customer client) {
        this.costume = costume;
        daysHired = numberDays;
        this.client = client;
        hireFee = daysHired * costume.getHireFee();
        costume.hire();
    }

    public void endHire(int hireIndex)
    {
        hireInProgress = false;
        costume.endHire();
        ZoneId zoneId = ZoneId.of("Australia/Sydney");

        endDate = LocalDate.now(zoneId).toString();
    }
    public Costume getCostume() {
        return this.costume;
    }

    public String toString() {
        String hireState;
        if (hireInProgress)
            hireState = "On Loan";
        else
            hireState = "Hire Completed";

        return String.format("Hire Ref#: %d.\t%s.\tCostume %s: %s \tHire commenced: %s\tHire completed: %s.\tTotal: %d days for $%.2f.\tStatus: %s", hireID, client.toString(), costume.getId(), costume.getCharacterName(), startDate, endDate, daysHired, hireFee, hireState);
    }
}
