package P1;

// 코드 1-2

public class Computer {
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
    
    public Computer() {
        this.mb = new MainBoard();
        this.cpu = new CPU();
        this.ram = new Memory();
        this.power = new PowerSupply();
    }
}