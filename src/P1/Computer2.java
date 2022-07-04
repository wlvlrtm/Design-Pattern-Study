package P1;

// 코드 1-3

public class Computer2 {
    private class MainBoard {
    }

    private class CPU {
    }

    private class Memory {
    }

    private class PowerSupply {
    }

    
    private MainBoard mb;
    private CPU cpu;
    private Memory ram;
    private PowerSupply power;
    
    public Computer2(MainBoard mb, CPU cpu, Memory ram, PowerSupply power) {
        this.mb = mb;
        this.cpu = cpu;
        this.ram = ram;
        this.power = power;
    }
}