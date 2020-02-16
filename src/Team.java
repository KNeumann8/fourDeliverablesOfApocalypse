public enum Team {
    HAWKS ("Atlanta","Hawks"),
    CELTICS ("Boston","Celtics"),
    HORNETS ("Charlotte","Hornets"),
    BULLS ("Chicago","Bulls"),
    CAVALIERS ("Cleveland","Cavaliers"),
    NETS ("Brooklyn","Nets"),
    MAVERICKS ("Dallas","Mavericks"),
    NUGGETS ("Denver","Nuggets"),
    KNICKS ("New York","Knicks"),
    RAPTORS ("Toronto","Raptors");

    private String city;
    private String name;

    private Team(String city, String name){
        this.city = city;
        this.name = name;
    }

    public String getCity(){
        return this.city;
    }

    public String getName(){return this.name;}

}
