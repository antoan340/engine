import engine.*;
public class Program {
    public static void main(String[] args) {
        enterEngine();
        heatMachine();
    }
    public static void enterEngine(){
        Machine[] arr = new Machine[3];
        Engine opel = new Engine(10,5,"red");
        arr[0] = opel;
        WrapperEngine bugati = new WrapperEngine(2000,20,"black");
        arr[1] = bugati;
        ProductionEngine lada = new ProductionEngine(60,4,"green");
        arr[2] = lada;
        print(arr);
    }
    public static void print(Machine[] arr){
        for (Machine i : arr) {
            System.out.print(i.getPower() + " , ");
        }
    }
    public static void heatMachine() {
        HeatManager[] heat = new HeatManager[3];
        HeatEngine heating = new HeatEngine(200, 10, "white");
        heat[0] = heating;
        WrapperEngine wrapperInator = new WrapperEngine(-20, 200, "green");
        heat[1] = wrapperInator;
        HeatEngine sauna = new HeatEngine(500, 30, "brown");
        heat[2] = sauna;
        powerSum(heat);
    }
    public static void powerSum(HeatManager[] heat){
        int sum=0;
        for (int i = 0;i<heat.length;i++){
            sum+=heat[i].getPower();
        }
        System.out.println(sum);
    }
}
