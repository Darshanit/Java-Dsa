class Encap {
    private String name;

    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        Encap e = new Encap();
        e.setname("Darshan");
        System.out.println(e.getname());
    }
}