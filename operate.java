package JAVAHW6;

import java.util.*;

public class operate {

    public static Scanner scanner = new Scanner(System.in);

    public static void filterNotebook(Set<nout> notebooks, Map<String, Object> filters) {
        List<nout> filteredNotebook = new ArrayList<>();
        for (nout s : notebooks) {
            boolean matchFilters = true;
            for (Map.Entry<String, Object> entry : filters.entrySet()) {
                String filter = entry.getKey();
                Object value = entry.getValue();
                switch (filter) {
                    case "ОЗУ":
                        if (s.getOzu() < (int) value) {
                            matchFilters = false;
                        }
                        break;
                    case "Объем жесткого диска":
                        if (s.getHddsize() < (int) value) {
                            matchFilters = false;
                        }
                        break;
                    case "Операционная система":
                        if (!s.getOsname().equals(value)) {
                            matchFilters = false;
                        }
                        break;
                    case "Цвет":
                        if (!s.getcolor().equals(value)) {
                            matchFilters = false;
                        }
                        break;
                }
            }
            if (matchFilters) {
                filteredNotebook.add(s);
            }
        }
        System.out.println("Найдено ноутбуков: " + filteredNotebook.size());
        for (nout s : filteredNotebook) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Set<nout> n = new HashSet<>();
        nout n1 = new nout(
                1,"ASUS", "Red", "sg10",32,512, "i9", 3.5,"Nvidia",4,
                "Windows11");
        nout n2 = new nout(
                2,"Huawei", "Blue", "ts2030",64,1024, "i9+", 5.5,"HW",32,
                "Aurora");
        nout n3 = new nout(
                3,"Irbis", "Black", "f2040",128,2056, "Bars+", 6.5,"Atom 3245",64,
                "Aurora2");
        //Вывод данных
        n1.getspec();
        n2.getspec();
        n3.getspec();

        //Множество ноутбуков
        n.add(n1);
        n.add(n2);
        n.add(n3);

        //Резервируем новое множество под выбранные ноут
        Map<String, Object> filter = new HashMap<>();

        //Ввод данных
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем жесткого диска");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                int ram = scanner.nextInt();
                filter.put("ОЗУ", ram);
                break;
            case 2:
                System.out.println("Введите минимальный объем жесткого диска:");
                int hdd = scanner.nextInt();
                filter.put("Объем жесткого диска", hdd);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.next();
                filter.put("Операционная система", os);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.next();
                filter.put("Цвет", color);
                break;
        }

        filterNotebook(n, filter);
    }
}
