public class County {

    private String name;
    private int population;
    private int area;
    private String capital;
    boolean sea;

    public County(String name, int population, int area, String capital, boolean sea) {
        this.name = name;
        this.population = population;
        this.area = area;
        this.capital = capital;
        this.sea = sea;
    }

       public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public boolean isSea() {
        return sea;
    }

    public void setSea(boolean sea) {
        this.sea = sea;
    }




}
