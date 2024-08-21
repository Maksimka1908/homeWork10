public class Main {
    public static void main(String[] args) {


        {
            //Задание 1
            String firstName = "Ivanov";
            String middleName = "Ivan";
            String lastName = "Ivanovich";
            String fullName = firstName + " " + middleName + " " + lastName;
            System.out.println("Ф.И.О. сотрудника — " + fullName);
            //Задание 2
            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —  " + fullName.toUpperCase());
            //Задние 3
            String fullNameTrue = fullName.replace("ё", "е");
            System.out.println("Данные Ф. И. О. сотрудника —"+fullNameTrue);
        }
    }
}