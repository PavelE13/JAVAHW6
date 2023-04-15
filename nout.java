package JAVAHW6;

public class nout {
    int id;
    String brand;
    String color;
    String model;
    int ozu;
    int hddsize;
    String chipmod;
    double freq;
    String video;
    int vidsize;
    String osname;

    public nout(int id, String brand, String color, String model, int ozu, int hddsize, String chipmod,double freq, String video, int vidsize, String osname)
    {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.ozu = ozu;
        this.hddsize = hddsize;
        this.chipmod = chipmod;
        this.freq = freq;
        this.video = video;
        this.vidsize = vidsize;
        this.osname = osname;
    }

    @Override
    public String toString() {
        return String.format("ID-" + id + " Vendor-" + brand + " Color-" + color + " Model " + model + " Memory-" + ozu +"Gb " + hddsize +"Gb " +
                "Core-" + chipmod + " " + freq + "GHz G.Card-" + video + " " + vidsize + "Gb " + osname);
    }

    void getspec()
    {
        System.out.println("ID-" + id + " Vendor-" + brand + " Color-" + color + " Model " + model + " Memory-" + ozu +"Gb " + hddsize +"Gb " +
                " Core-" + chipmod + " " + freq + "GHz G.Card-" + video + " " + vidsize + "Gb " + osname);
    }

    public int getOzu() {
        return ozu;
    }

    public int getHddsize() {
        return hddsize;
    }

    public String getOsname() {
        return osname;
    }

    public String getcolor ()
    {
        return color;
    }
}
