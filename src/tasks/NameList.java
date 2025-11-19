package tasks;

import java.util.ArrayList;

public class NameList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Gleb");
        names.add("Max");
        names.add("Asror");
        names.add("Sergey");
        names.add("Alexandro");

        int count = 0;
        System.out.println("Имена длиной 4 и более символов:");
        for (String name : names){
            if (name.length() >= 4) {
                System.out.println(name);
                count++;
            }
        }
        System.out.println("Кол имен длиннее 4 символов: " + count);
    }
}
