import ru.netology.service.VacationService;

public class Main {

    public static void main(String[] args) {
        VacationService service = new VacationService();
        int count = service.calculate(10_000, 3_000, 20_000);
        System.out.println("В этом году мой отпуск составит " + count + " месяца!");
    }
}
