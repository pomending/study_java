package ex_work;

public class Truck {

    private String driverName;
    private int maxWeight;
    private int currentWeight;

    public Truck(String driverName, int maxWeight) {
        this.driverName = driverName;
        this.maxWeight = maxWeight;
        currentWeight = 0;
    }

    public boolean load(Item item, int count) {

        if (count > item.getStock()) {
            System.out.printf("[실패] 재고 부족 (요청 : %d개 / 현재 재고 : %d개)\n", count, item.getStock());
            return false;
        }

        if (item.getWeight() * count + currentWeight > maxWeight) {
            System.out.printf("[실패] 적재 중량 초과 : (요청 무게: %dkg / 남은 용량 : %dkg)\n", (item.getWeight() * count),
                    (maxWeight - currentWeight));
            return false;
        }
        
        item.decreaseStock(count);
        currentWeight += (item.getWeight() * count);
        System.out.printf("[성공] %s %d개 적재 완료 (현재 적재량 : %d / %d kg)\n", item.getName(), count, currentWeight, maxWeight);
        return true;

    }

    public void unloadAll() {
        currentWeight = 0;
        System.out.println("[안내] 트럭의 모든 짐을 하차했습니다. 현재 적재량 : 0kg");
    }

    public void showInfo() {
        System.out.printf("이름 : %s, 현재 적재량 : %d / %dkg\n", driverName, currentWeight, maxWeight);
    }

}
