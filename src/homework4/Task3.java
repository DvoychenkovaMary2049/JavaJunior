package homework4;

public class Task3 {
    public static void main(String[] args) {
        String email = "easyUm@yandex.ru";
        int dog = 0;
        int emailOk = 0;

        if (!email.contains("@")) {
            emailOk++;
            System.out.println("В почте отсутствует '@'. ");
        }
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == ('@')) {
                dog++;
                {
                    if (dog > 1) {
                        emailOk++;
                        System.out.println("В почте ошибка в кол-ве @ .");
                    }
                }
            }
        }
        if (!email.contains(".")) {
            emailOk++;
            System.out.println("В почте отсутствует '.'. ");
        }
        if (email.contains(" ")) {
            emailOk++;
            System.out.println("В почте присутствуют пробелы.");
        }
        if (email.contains("abcdefghijklmnopqrstuvwxyz")) {
            emailOk++;
            System.out.println("В почте присутствуют не английские буквы");
        }
        if (email.length() - email.lastIndexOf(".") <= 2) {
            emailOk++;
            System.out.println("В почте неверное окончание");
        }
        if (emailOk == 0) {
            System.out.println("Вы успешно зарегистрированы.");
        }
    }
}
