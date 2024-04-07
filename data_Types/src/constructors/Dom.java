package constructors;

public class Dom {
    public String type;
    public boolean ogorod;
    public  int kv2;
    public int jiteli;
    public int rooms;
    public Dom(String types, int kvm22,int jiteli1,int rooms1){
        type =types;
        kv2 = kvm22;
        jiteli=jiteli1;
        rooms = rooms1;

    }

    @Override
    public String toString() {
        return "Dom{" +
                "type='" + type + '\'' +
                ", ogorod=" + ogorod +
                ", kv2=" + kv2 +
                ", jiteli=" + jiteli +
                ", rooms=" + rooms +
                '}';
    }
}

