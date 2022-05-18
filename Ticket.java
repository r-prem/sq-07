public class Ticket {



    public Ticket() {
    }

    double calculateTicketPrice(float distance, int age) throws Exception {
        // test case 4 + 5 + 6
        if(distance < 0 || age < 0 || distance > 200) throw new Exception();

        // test case 2
        if(distance > 100) return 15;
        else if(distance <= 100 && distance > 10) {
            // test case 3
            return distance * 0.1;
        } else {
            // test case 1
            return 1;
        }
    }

    double calculateTicketPriceErweitert(float distance, int age) throws Exception {
        // test case 4 + 5 + 6
        if(distance < 0 || age < 0 || distance > 200 || age > 150) {
            throw new Exception();
        }

        double preisNachlass = 1;

        if(age < 15) {
            return 0;
        } else if((age > 14 && age < 19) || age > 64) {
            preisNachlass = 0.5;
        }

        // test case 2
        if(distance > 100) {
            return 15 * preisNachlass;
        } else if(distance <= 100 && distance > 10) {
            // test case 3
            return distance * 0.1 * preisNachlass;
        } else {
            // test case 1
            return 1 * preisNachlass;
        }
    }

}
