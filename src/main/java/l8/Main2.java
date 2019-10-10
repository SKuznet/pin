package l8;

public class Main2 {
    public static void main(String[] args) {
        CatInterface catInterface1 = new CatInterface() {
            @Override
            public String getInfo(String name) {
                return "I am " + name;
            }
        };

        CatInterface catInterface2 = name -> "I am " + name;

        FuncEx funcEx = new FuncEx() {
            @Override
            public String getInfo() {
                return "I am cat";
            }
        };

        FuncEx funcEx2 = () -> "I am cat";

        System.out.println(catInterface1.getInfo("Barsik"));
        System.out.println(catInterface2.getInfo("Barsik"));
        System.out.println(funcEx.getInfo());
        System.out.println(funcEx2.getInfo());

        FuncEx2 func = new FuncEx2() {
            @Override
            public String getInfo(String name) {
                return name.toUpperCase();
            }
        };
        System.out.println(getName(func));
        System.out.println(getName(O -> O.toUpperCase()));

        FuncEx3 funcEx3 = new FuncEx3() {
            @Override
            public void getInfo(String name) {
                String result = "jack " + name;
                System.out.println("I am " + result);
            }
        };

        FuncEx3 funcEx5 = name -> {
            String result = "jack " + name;
            System.out.println("I am " + result);
        };

        FuncEx3 funcEx4 = name -> System.out.println("I am " + name);

        FuncEx4 f = new FuncEx4() {
            @Override
            public void getInfo(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };

        FuncEx4 f2 = (s1, s2) -> {
            s1 = s1.toUpperCase();
            System.out.println(s1 + " " + s2);
        };
    }

    private static String getName(FuncEx2 funcEx2) {
        return funcEx2.getInfo("Barsik");
    }
}
