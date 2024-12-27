package practice;

import java.util.Scanner;

public final class TrucksAndContainers {
    public final static int MAX_BOXES_IN_CONTAINER = 27;
    public final static int MAX_CONTAINERS_IN_TRUCK = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boxes = scanner.nextInt();

        if (boxes < 0) {
            return;
        }

        int requiredContainerCount = (int) Math.ceil((double) boxes / MAX_BOXES_IN_CONTAINER);
        int requiredTruckCount = (int) Math.ceil((double) requiredContainerCount / MAX_CONTAINERS_IN_TRUCK);

        int boxCounter = 1;
        int containerCounter = 1;

        for (int truck = 1; truck <= requiredTruckCount; truck++) {
            System.out.println("Грузовик: " + truck);
            for (int container = 1; container <= MAX_CONTAINERS_IN_TRUCK; container++) {
                if (boxCounter > boxes) break;
                System.out.println("\tКонтейнер: " + containerCounter);
                for (int box = 1; box <= MAX_BOXES_IN_CONTAINER; box++) {
                    if (boxCounter > boxes) break;
                    System.out.println("\t\tЯщик: " + boxCounter);
                    boxCounter++;
                }
                containerCounter++;
            }
        }

        System.out.println("Необходимо:" + System.lineSeparator()
                + "грузовиков - " + requiredTruckCount + " шт." + System.lineSeparator()
                + "контейнеров - " + requiredContainerCount + " шт." + System.lineSeparator());
    }
}
