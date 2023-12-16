public class rundom {
    public static void main(String[] args) {
//        MainKt.sum3(4,6);
//        int res= MainKt.sum(3,7);
//        System.out.println("from java run "+res);
        System.out.println("MainKt running from  rundom.java");
        MainKt.main();
        rundomX r=new rundomX();
        System.out.println("With Interest");
        r.runner();
        System.out.println("With Constant Interest");
        r.runnerX();
    }
}
