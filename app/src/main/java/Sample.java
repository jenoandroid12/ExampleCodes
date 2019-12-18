class MySingleton {
    static MySingleton sampl = null;
    public int x = 10;

    private MySingleton() {
    }

    static public MySingleton getInstance() {
        sampl = new MySingleton();

        return sampl;
    }
}

class Sample {
    public static void main(String args[]) {
        MySingleton a = MySingleton.getInstance();
        MySingleton b = MySingleton.getInstance();

//        MySingleton a = new MySingleton();
//        MySingleton b = new MySingleton();
        a.x = a.x + 10;
        System.out.println("Value of a.x = " + a.x);
        System.out.println("Value of b.x = " + b.x);
    }
} 