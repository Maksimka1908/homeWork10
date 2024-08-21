public class Main {
    public static void main(String[] args) {


        {
            //Задание 1
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("Ф.И.О. сотрудника — " + fullName);
            //Задание 2
            System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —  " + fullName.toUpperCase());
            //Задние 3
            String fullNameTrue = fullName.replace("ё", "е");
            System.out.println("Данные Ф. И. О. сотрудника —"+fullNameTrue);
        }
    }
}