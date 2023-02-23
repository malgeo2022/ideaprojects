package airport.domain.enumerator;

public enum Destination {
    ATHENS(1, "Eleftherios Venizelos"),
    THESSALONIKI(2, "Macedonia"),
    KALAMATA(3, "Kalamatas"),
    MYKONOS(4, "Mykonoy");

    private final long id;
    private final String airportName;

    Destination(long id, String airportName) {
        this.id = id;
        this.airportName = airportName;
    }
}
