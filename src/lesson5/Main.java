package lesson5;

public class Main {
    public static void main(String[] args) {
        String email = "dvdfdfdf@dfg.cgf";
        String[] splitByDog= email.split("@");
        if ( splitByDog.length==1){
            System.out.println("Эмаил не содержит собачек");
            return;
        }
        if (splitByDog.length>2){
            System.out.println("Эмаил содержит больше чем одну собачку");
            return;
        }
        if (email.startsWith(".") || email.endsWith(".") || splitByDog[0].endsWith(".") || splitByDog[1].startsWith(".")){
            System.out.println("В эмаил точка не в нужном месте");
            return;
        }
    }
}
