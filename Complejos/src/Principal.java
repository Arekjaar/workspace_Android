class Principal {
    public static void main(String[] main) {
        Complejo z, w;
        z = new Complejo(-1.5, 3.0);
        w = new Complejo(-1.2, 2.4);
        z.suma(w);
        System.out.println("Complejo: " + z);
        z.suma(w.getReal(), w.getImaginario());
        System.out.println("Complejo: " + z);
        z.suma(w.getReal());
        System.out.println("Complejo: " + z);
    }
}
