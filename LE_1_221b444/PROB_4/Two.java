class Two extends One {
    // This will cause a compilation error
}

class Two extends One {
    Two(int x) {
        super(x);
        System.out.println("Two's constructor with parameter: " + x);
    }
}
