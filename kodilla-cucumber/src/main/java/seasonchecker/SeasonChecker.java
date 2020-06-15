package seasonchecker;

import java.time.MonthDay;

public class SeasonChecker {

    public String checkIfSummer(MonthDay season) {
        if (season.isAfter(MonthDay.of(6,21)) && season.isBefore(MonthDay.of(9,23)))
            return "it's Summer";
        return "Nope";
    }
}
