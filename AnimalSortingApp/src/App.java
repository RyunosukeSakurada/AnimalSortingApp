public class App {

    public static void main(String[] args) throws Exception {
        
        /*
        To actually use a class, you need to create an object, and creating an object is called "instantiation.
        [Instant class] : "Class instance = new constructor();"
        */
        Crocodile croc = new Crocodile();
        //instance.class
        System.out.println(croc.showInfo());


        Eel eel = new Eel();
        System.out.println(eel.showInfo());

        Eagle eagle = new Eagle();
        System.out.println(eagle.showInfo());
        
    }

}

