public class Main {
    public static void main(String[] args) {

        try {
            check("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
            System.out.println("Вход выполнен успешно");
        } catch (WrongLoginException e) {
            e.printStackTrace();
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Добрый день!");

        }
    }

    public static void check (String login, String password, String confirmPassword) {
        if (login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException();
        }
        if (password.length() > 20 || !password.matches("[a-zA-z0-9_]+")) {
            throw new WrongPasswordException();
        }
        if (confirmPassword != password) {
            throw new WrongLoginException();
        }


    }
}