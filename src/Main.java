//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    // Задача № 1
    int firstFriday = 5;

    for (int day = 1; day <= 31; day++) {
        if (day >= firstFriday && (day - firstFriday) % 7 == 0) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
    }

    // Задача № 2
    int moveDistance = 0;
    int needToFinish = 42_195;

    do {
        System.out.println("Держитесь! Осталось " + (needToFinish - moveDistance) + " метров");
        moveDistance += 500;
    } while (moveDistance <= needToFinish);

    moveDistance = 0;

    for (; moveDistance <= needToFinish; ) {
        System.out.println("Держитесь! Осталось " + (needToFinish - moveDistance) + " метров");
        moveDistance += 500;
    }

    // Задача № 3
    int day = 1;
    int money = 3_000;

    while (true) {
        if (day % 5 == 0) {
            day++; // в первой версии пропустил этот момент :)
            continue;
        }
        money -= 100;
        day++;
        if (money <= 0) {
            System.out.println("Денежных средств хватит на оплату " + day + " дней");
            break;
        }
    }

    day = 1;
    money = 2_500;

    for (; ; day++) {
        if (day % 5 == 0) {
            continue;
        }
        money -= 100;
        if (money <= 0) {
            System.out.println("Денежных средств хватит на оплату " + day + " дней");
            break;
        }
    }

    // Задача № 4
    int month = 0;
    double total = 0;
    int salaryMonth = 15_000;

    while (true) {
        month++;
        if (month % 6 == 0) {
            total += total * 0.07;
        }
        total += salaryMonth;
        System.out.println("По состоянию на " + month + " месяц сумма накоплений равна " + String.format("%,.2f", total));
        if (total >= 12_000_000) {
            break;
        }
    }

    // Задача № 5
    int charge = 20;
    int minute = 0;
    int overheats = 0;

    while (charge <= 100 && overheats <= 3) {
        minute++;
        if (minute % 10 == 0) {
            overheats++;
            System.out.println("В связи с перегревом, зарядка устройства приостановлена на 2 минуты");
            minute += 2;
            continue;
        }
        charge += 2;
        if (overheats > 3) {
            System.out.println("В связи с повторяющимися перегревами, зарядка устройства отключена");
            break;
        }

    }
    ;

    System.out.println("Устройство заряжено на " + charge + "%, время зарядки составило " + minute + " минут");
}
