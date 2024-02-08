package Coffee_Machine;

public enum KahveBoyutu {
    SMALL("Küçük"), MEDIUM("Orta"), LARGE("Büyük"), XLARGE("Çok Büyük");
    private String name;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    KahveBoyutu(String name) {
        this.name = name;
    }
}
